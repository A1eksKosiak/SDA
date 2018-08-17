package week8.day5;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class InputOutputToFile {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("C:\\Users\\A1eks\\IdeaProjects\\SDA\\src\\week8\\day5\\test.txt");
        List<String> lines = Files.readAllLines(filePath);
        for (String line : lines) {
            Integer currentNumber = Integer.parseInt(line);
            System.out.println(line);
        }
    }
}
