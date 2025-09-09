package FunctionalInterface;

interface SecurityUtils {
    static boolean isStrongPassword(String password) {
        return password.length() >= 8 &&
               password.matches(".*[A-Z].*") &&
               password.matches(".*[0-9].*") &&
               password.matches(".*[@#$%].*");
    }
}

public class PasswordCheck {
    public static void main(String[] args) {
        String pass = "Secure@123";
        System.out.println("Is Strong? " + SecurityUtils.isStrongPassword(pass));
    }
}

