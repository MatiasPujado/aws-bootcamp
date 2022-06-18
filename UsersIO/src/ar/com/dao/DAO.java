package ar.com.dao;

import ar.com.entities.User;

import java.io.IOException;
import java.util.List;

public interface DAO {

    // User CRUD methods
    User create();

    User create(String name, String lastName, String idNumber, String dateOfBirth, String profession);

    void print(User user);

    void addToList(User user);

    void deleteFromList(User user) throws IOException;

    void addUserToDB(User user) throws IOException;

    List<User> getUsersFromDB() throws IOException;

    void writeDB(List<User> userList) throws IOException;

    void deleteUserFromDB(List<User> userList) throws IOException;

}
