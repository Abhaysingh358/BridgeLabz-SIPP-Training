package Streams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

    public static void main(String[] args) {
        String sourcePath = "source.txt";      // You can change this
        String destinationPath = "destination.txt"; // You can change this

        File sourceFile = new File(sourcePath);

        if (!sourceFile.exists()) {
            System.out.println("❌ Source file does not exist: " + sourcePath);
            return;
        }

        try (
            FileInputStream fis = new FileInputStream(sourceFile);
            FileOutputStream fos = new FileOutputStream(destinationPath)
        ) {
            byte[] buffer = new byte[1024];
            int bytesRead;

            // Read from source and write to destination
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

            System.out.println("✅ File copied successfully to " + destinationPath);

        } catch (IOException e) {
            System.out.println("❌ Error during file operation: " + e.getMessage());
        }
    }
}

