package HomeWork22092024;


import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Operations {

    public static void main(String[] args) {
        String text = "A Little Bit of Something is Better than Nothing.";
        String filePath = "File.txt";

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
