package JavaExceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class EmployeeServiceIMPL implements IEmployee {

    @Override
    public void login(String userName, String password) {
        boolean found = false;

        try (BufferedReader br = new BufferedReader(new FileReader("Employee.json"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    String fileUser = parts[0].trim();
                    String filePass = parts[1].trim();

                    if (fileUser.equals(userName) && filePass.equals(password)) {
                        System.out.println("✅ Login successful for user: " + userName);
                        found = true;
                        break;
                    }
                }
            }

            if (!found) {
                throw new UserNotFoundException("Invalid username or password for user: " + userName);
            }

        } catch (IOException e) {
            System.out.println("❌ Error reading the credentials file: " + e.getMessage());
        } catch (UserNotFoundException e) {
            System.out.println(e);
        }
        
        
    }
}
