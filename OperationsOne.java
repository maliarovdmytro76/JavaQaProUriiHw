package HomeWork22092024;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class OperationsOne {
    public static void main(String[] args) {
        String text = "Hello! Привет! ສະບາຍດີ";
        String filePath = "FileOne.txt";

        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            String fileContent = new String(Files.readAllBytes(Paths.get(filePath)));
            if (text.equals(fileContent)) {
                System.out.println("Строка записана корректно.");
            } else {
                System.out.println("Строки не совпадают.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
