package week8.day5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class SortInfoInFile {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("C:\\Users\\A1eks\\IdeaProjects\\SDA\\src\\week8\\day5\\test.txt");
        Path toCopy = Paths.get("C:\\Users\\A1eks\\IdeaProjects\\SDA\\src\\week8\\day5\\test1.txt");
        Files.deleteIfExists(toCopy);
        Files.copy(filePath, toCopy);
        List<String> list = Files.readAllLines(filePath);
        List<String> listCopy = Files.readAllLines(toCopy);
        List<Integer> arrayList = new ArrayList<>();
        for (String line : list) {
            arrayList.add(Integer.parseInt(line));
        }
        System.out.println("Array: " + arrayList);
        for (int i = 0; i < arrayList.size(); i++) {
            for (int j = arrayList.size() - 1; j >= i + 1; j--) {
                if (arrayList.get(j) < arrayList.get(j - 1)) {
                    int temp = arrayList.get(j);
                    arrayList.set(j, arrayList.get(j - 1));
                    arrayList.set(j - 1, temp);
                }
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            listCopy.set(i, arrayList.get(i).toString());
        }
        Files.write(toCopy, listCopy);
        System.out.println("Sorted: " + arrayList);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(listCopy.get(i))) {
                System.out.println("Line " + i + " is the same");
            }
        }
    }
}
