package main.ar.com.dao;



import main.ar.com.entities.User;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class UserDAO implements DAO {

    private final String url = "/media/Work/Projects/Courses/AWSoftware/Exercises/UsersIO/src/ar/com/web/resources/usersDB.txt";

    private List<User> userList;

    /**
     * No-argument constructor
     */
    public UserDAO() {
        userList = new ArrayList<>();
    }

    /**
     * Parameterized constructor
     *
     * @param userList
     */
    public UserDAO(List<User> userList) {
        this.userList = new ArrayList<>();
    }

    // Getters & Setters

    public List<User> getUserList() {
        return this.userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public String getUrl() {
        return this.url;
    }

// CRUD implementations

    /**
     * Returns the File that fulfills the role of DB
     *
     * @return usersDB.txt
     */
    public File getFile() {
        return Optional.of(new File(getUrl())).orElseThrow(() -> new RuntimeException("Error finding DB file."));
    }

    /**
     * Creates a User Object
     *
     * @return user
     */
    @Override
    public User create() {
        return new User();
    }

    /**
     * Creates a user object
     *
     * @param name
     * @param lastName
     * @param idNumber
     * @param profession
     * @param dateOfBirth
     * @return user
     */
    @Override
    public User create(String name, String lastName, String idNumber, String dateOfBirth, String profession) {
        return new User(name, lastName, idNumber, dateOfBirth, profession);
    }

    /**
     * Prints a user's information
     *
     * @param user
     */
    @Override
    public void print(User user) {
        user.toString();
    }

    /**
     * Adds a user object to the list
     *
     * @param user
     * @return
     */
    @Override
    public void addToList(User user) {
        this.userList.add(user);
    }

    /**
     * Removes a user object from the list
     */
    @Override
    public void deleteFromList(User user) throws IOException {
//        Optional.ofNullable(user).map(u -> userList.remove(u)).orElseThrow(() -> new UserDeleted("User could not be deleted from list."));
        Optional.ofNullable(user).map(u -> userList.remove(u)).orElseThrow(() -> new IOException("User could not be deleted from list."));

    }

    /**
     * Checks if the specified user already exists in DB, then adds it to the list, sorts it and lastly saves it in the DB
     *
     * @param user
     * @return Exception
     */
    @Override
    public void addUserToDB(User user) throws IOException {

        User alreadyExists = this.getUsersFromDB().stream().filter(u -> Objects.equals(u.getIdNumber(), user.getIdNumber())).findFirst().orElse(null);

        if (alreadyExists == null) {
            this.addToList(user);
            this.userList = this.userList.stream().sorted(User::compareTo).collect(Collectors.toList());
            this.writeDB(this.userList);
//            throw new SuccessfulException("User successfully added.");
        } else {
//            throw new UserAlreadyExists("The user already exists.");
        }

    }

    /**
     * Gets the list of users from the DB
     *
     * @return List
     */
    @Override
    public List<User> getUsersFromDB() throws IOException {
        String registry = "";
        String[] field;
        List<User> aux = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(getFile()));

        while ((registry = bufferedReader.readLine()) != null) {
            field = registry.split(", ");
            aux.add(this.create(field[0], field[1], field[2], field[3], field[4]));
        }
        bufferedReader.close();
        return aux;
    }

    /**
     * Saves the list of users in the DB
     *
     * @param userList
     * @throws IOException
     */
    @Override
    public void writeDB(List<User> userList) throws IOException {

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(getFile()));

        for (User u : userList) {
            bufferedWriter.write(u.getName() + ", ");
            bufferedWriter.write(u.getLastName() + ", ");
            bufferedWriter.write(u.getIdNumber() + ", ");
            bufferedWriter.write(u.getDateOfBirth() + ", ");
            bufferedWriter.write(u.getProfession() + "");
            bufferedWriter.newLine();
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }

    /**
     * Removes the specified user from the DB
     * @param userList
     * @throws IOException
     */
    @Override
    public void deleteUserFromDB(List<User> userList) throws IOException {
        this.writeDB(userList);
//        throw new UserDeleted("User successfully deleted.");
    }

}
