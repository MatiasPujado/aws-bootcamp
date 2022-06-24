package main.ar.com.services;

import main.ar.com.dao.DAO;
import main.ar.com.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class UserService implements Services {

    @Autowired
    private DAO userDAO;

    // CRUD Methods

    /**
     * Returns an ordered list of users from DB
     *
     * @return
     * @throws IOException
     */
    @Override
    public List<User> getListFromDB() throws IOException {
        return userDAO.getUsersFromDB().stream().sorted(User::compareTo).collect(Collectors.toList());
    }

    /**
     * Adds an user to the DB
     *
     * @param user
     * @throws IOException
     */
    @Override
    public void addUser(User user) throws IOException {
        userDAO.addUserToDB(user);
    }

    /**
     * Deletes the specified user from DB
     *
     * @param user
     * @throws IOException
     */
    @Override
    public void deleteUser(User user) throws IOException {
        userDAO.deleteUserFromDB(filterList(user));
    }

    /**
     * Finds the specified user in the DB
     *
     * @param idNumber
     * @return user
     * @throws IOException
     */
    @Override
    public User findUser(String idNumber) throws IOException {
        return userDAO.getUsersFromDB().stream().filter(u -> u.getIdNumber().equals(idNumber)).findFirst().orElseThrow(() -> new IOException("User not found."));
    }

    /**
     * Updates the specified user's information in DB
     *
     * @param user
     * @throws IOException
     */
    @Override
    public void updateUser(User user) throws IOException {
        List<User> aux = filterList(user);
        aux.add(user);
        aux = aux.stream().sorted(User::compareTo).collect(Collectors.toList());
        userDAO.writeDB(aux);
    }

    /**
     * Returns an ordered list of users excluding the user specified
     *
     * @param user
     * @return list
     * @throws IOException
     */
    @Override
    public List<User> filterList(User user) throws IOException {
        return userDAO.getUsersFromDB().stream().filter(u -> !Objects.equals(u.getIdNumber(), user.getIdNumber())).sorted(User::compareTo).collect(Collectors.toList());
    }

    /**
     * Creates a user objects without parameters
     *
     * @return user
     */
    @Override
    public User createUser() {
        return userDAO.create();
    }

    /**
     * Creates a user object with parameters
     *
     * @param name
     * @param lastName
     * @param idNumber
     * @param profession
     * @param dateOfBirth
     * @return User
     */
    @Override
    public User createUser(String name, String lastName, String idNumber, String dateOfBirth, String profession) {
        return userDAO.create(name, lastName, idNumber, dateOfBirth, profession);
    }

    /**
     * Prints the user private information
     *
     * @param user
     */
    @Override
    public void printData(User user) {
        userDAO.print(user);
    }


}
