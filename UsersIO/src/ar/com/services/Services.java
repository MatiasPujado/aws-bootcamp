package ar.com.services;

import ar.com.entities.User;

import java.io.IOException;
import java.util.List;

public interface Services {

    List<User> getListFromDB() throws IOException;

    void addUser(User user) throws IOException;

    void deleteUser(User user) throws IOException;

    User findUser(String idNumber) throws IOException;

    void updateUser(User user) throws IOException;

    List<User> filterList(User user) throws IOException;

    User createUser();

    User createUser(String name, String lastName, String idNumber, String dateOfBirth, String profession);

    void printData(User user);

}
