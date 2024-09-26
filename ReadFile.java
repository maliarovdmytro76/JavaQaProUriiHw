package HomeWork22092024;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

    public static void main(String[] args) {
        String filePath = "C:\\Users\\Lenovo\\IdeaProjects\\HomeWorkAvramenkoUrii\\FileOne.txt";
        printFile(filePath);
    }

    public static void printFile(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }
}
