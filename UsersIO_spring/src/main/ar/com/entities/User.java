package main.ar.com.entities;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Builder
@Data
@ToString
public class User implements Comparable<User> {

    private String name;
    private String lastName;
    private String idNumber;
    private String profession;
    private String dateOfBirth;

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

}
