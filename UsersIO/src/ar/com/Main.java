package ar.com;

import ar.com.dao.UserDAO;
import ar.com.entities.User;
import ar.com.exceptions.SuccessfulException;
import ar.com.exceptions.UserAlreadyExists;
import ar.com.exceptions.UserDeleted;
import ar.com.services.UserService;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws UserAlreadyExists, SuccessfulException, IOException, UserDeleted {

        // Test Service
        // Writing works

        System.out.println();
        System.out.println("Writing DB");
        System.out.println();


        UserService userService = new UserService();
        User u = new User("Matias", "Pujado", "1111111", "Dev", "101187");
        User u2 = new User("Luis", "Saez", "2222222", "Engineer", "040490");
        User u3 = new User("Ana", "Dominguez", "33333333", "Cook", "040490");
        User u4 = new User("Lautaro", "Henriquez", "444444444", "Lawyer", "040490");
        User u5 = new User("Ludmila", "Toledo", "555555555", "Secretary", "040490");
        User u6 = new User("Ludmila", "Toledo", "555555555", "Secretary", "040490");


        UserDAO userDAO = new UserDAO();
        System.out.println(userDAO.getUrl());


        userService.addUser(u);
        userService.addUser(u2);
        userService.addUser(u3);
        userService.addUser(u4);
        userService.addUser(u5);
//        userService.addUser(u6);
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
        userService.deleteUser(u5);

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

    }
}
