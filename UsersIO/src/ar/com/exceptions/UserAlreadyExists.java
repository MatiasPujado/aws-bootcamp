package ar.com.exceptions;

public class UserAlreadyExists extends Exception {

    public UserAlreadyExists() {
    }

    public UserAlreadyExists(String message) {
        super(message);
    }
}
