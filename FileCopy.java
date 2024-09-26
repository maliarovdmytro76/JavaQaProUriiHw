package HomeWork22092024;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) {
        String inputFilePath = "C:\\Users\\Lenovo\\IdeaProjects\\HomeWorkAvramenkoUrii\\src\\main\\java\\HomeWork22092024\\FileThree.txt";
        String outputFilePath = "C:\\Users\\Lenovo\\IdeaProjects\\HomeWorkAvramenkoUrii\\src\\main\\java\\HomeWork22092024\\FileFour.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }

            System.out.println("Текст скопирован в " + outputFilePath);
        } catch (IOException e) {
            System.err.println("Произошла ошибка: " + e.getMessage());
        }
    }
}