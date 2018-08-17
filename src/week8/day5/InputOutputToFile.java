package week8.day5;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InputOutputToFile {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("C:\\Users\\A1eks\\IdeaProjects\\SDA\\src\\week8\\day5\\test.txt");
        List<String> lines = Files.readAllLines(filePath);
        List<Integer> arrayList = new ArrayList<>();
        for (String line : lines) {
            arrayList.add(Integer.parseInt(line));
        }
        System.out.println(arrayList);
        Integer max = arrayList.get(0);
        Integer sum = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) > max) {
                max = arrayList.get(i);
            }
            sum += arrayList.get(i);
        }
        System.out.println("Max = " + max);
        System.out.println("Sum = " + sum);
        Collections.sort(arrayList);
        System.out.println("Array after sort: " + arrayList);
    }
}
