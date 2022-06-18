package main.ar.com.exceptions;

public class UserDeleted extends Exception {

    public UserDeleted() {
    }

    public UserDeleted(String message) {
        super(message);
    }
}
