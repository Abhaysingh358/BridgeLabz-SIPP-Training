package JavaExceptions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter username: ");
        String userName = sc.nextLine();

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        IEmployee service = new EmployeeServiceIMPL();
        service.login(userName, password);

        sc.close();
    }
}
