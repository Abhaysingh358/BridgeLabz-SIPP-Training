package JavaExceptions;

public class UserNotFoundException extends Exception {
    public UserNotFoundException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "UserNotFoundException: " + getMessage();
    }
}
