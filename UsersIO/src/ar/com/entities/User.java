package ar.com.entities;

public class User implements Comparable<User> {

    private String name;
    private String lastName;
    private String idNumber;
    private String profession;
    private String dateOfBirth;

    /**
     * No-argument constructor
     */
    public User() {
    }

    /**
     * Parameterized constructor
     *
     * @param name
     * @param lastName
     * @param idNumber
     * @param profession
     * @param dateOfBirth
     */
    public User(String name, String lastName, String idNumber, String dateOfBirth, String profession) {
        this.name = name;
        this.lastName = lastName;
        this.idNumber = idNumber;
        this.dateOfBirth = dateOfBirth;
        this.profession = profession;

    }

    // Getters & Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * Enables the User Object to be able to know how to compare itself with other User Objects
     *
     * @param user the object to be compared.
     * @return int number
     */
    @Override
    public int compareTo(User user) {
        return this.getIdNumber().compareTo(user.getIdNumber());
    }

    // To String Method

    @Override
    public String toString() {
        return "User{" +
                " name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", idNumber='" + idNumber + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", profession='" + profession + '\'' +
                '}';
    }

}
