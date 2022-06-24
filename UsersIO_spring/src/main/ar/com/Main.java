package main.ar.com;

import main.ar.com.config.AppConfig;
import main.ar.com.entities.User;
import main.ar.com.exceptions.SuccessfulException;
import main.ar.com.exceptions.UserAlreadyExists;
import main.ar.com.exceptions.UserDeleted;
import main.ar.com.services.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws UserAlreadyExists, SuccessfulException, IOException, UserDeleted {


        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
        ac.register(AppConfig.class);
        ac.refresh();

        UserService userService = (UserService) ac.getBean(UserService.class);

        // Test Service
        // Writing works

        System.out.println();
        System.out.println("Writing DB");
        System.out.println();

        User u = User.builder().name("Matias").lastName("Pujado").idNumber("111111111").dateOfBirth("101187").profession("Dev").build();
        User u1 = User.builder().name("Luis").lastName("Saez").idNumber("222222222").dateOfBirth("040490").profession("Teacher").build();
        User u2 = User.builder().name("Ana").lastName("Dominguez").idNumber("333333333").dateOfBirth("040490").profession("Lawyer").build();
        User u3 = User.builder().name("Lautaro").lastName("Henriquez").idNumber("44444444444").dateOfBirth("040490").profession("Secretary").build();
        User u4 = User.builder().name("Ludmila").lastName("Toledo").idNumber("5555555555").dateOfBirth("040490").profession("Cook").build();

        userService.addUser(u);
        userService.addUser(u1);
        userService.addUser(u2);
        userService.addUser(u3);
        userService.addUser(u4);

        System.out.println(userService.getListFromDB().size());
        System.out.println(userService.getListFromDB());
        System.out.println();
        System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println();

        // Reading

        System.out.println();
        System.out.println("Reading DB");
        System.out.println();

        List<User> list = userService.getListFromDB();

        System.out.println(list.size());
        for (User user : list) {
            System.out.println(user.toString());
        }

        System.out.println();
        System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println();

        // Deleting

        System.out.println();
        System.out.println("Deleting users from DB");
        System.out.println();


        userService.deleteUser(u2);
        userService.deleteUser(u4);

        System.out.println("---------------------");

        // Reading

        System.out.println();
        System.out.println("Reading DB");
        System.out.println();

        List<User> list2 = userService.getListFromDB();

        System.out.println(list2.size());
        for (User user : list2) {
            System.out.println(user.toString());
        }

        System.out.println();
        System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println();


        ac.close();
    }
}
