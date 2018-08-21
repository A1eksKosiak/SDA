package week9.day2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        Path filePath = Paths.get("C:\\Users\\A1eks\\IdeaProjects\\SDA\\src\\week9\\day2\\test.txt");

        List<String> lines = Files.readAllLines(filePath);
        List<User> userList = new ArrayList<>();

        for (String line : lines) {
            String[] userFromFile = line.split(" ");
            userList.add(new User(userFromFile[0], Integer.parseInt(userFromFile[1]), Double.parseDouble(userFromFile[2])));
        }

        System.out.println("List of users from the file:");
        System.out.println(userList);
        System.out.println("----------------------------------------------------------------------------------------");
        transferMoney(userList, "A1eks", "Pjotr", 2000);
        System.out.println("First transfer:");
        System.out.println(userList);
        System.out.println("----------------------------------------------------------------------------------------");
        transferMoney(userList, "Pjotr", "A1eks", 6000);
        System.out.println("Second transfer:");
        System.out.println(userList);
        System.out.println("----------------------------------------------------------------------------------------");

        userList.add(new User("Bob", 72, 50000));
        userList.add(new User("John", 54, 5000));
        userList.add(new User("Kara", 27, 1000000));
        userList.add(new User("Marie", 18, 50));

        //saving all users to the file
        List<String> listOfUsers = new ArrayList<>();
        for (User user: userList){
            listOfUsers.add(user.getName() + " " + user.getAge() + " " + user.getMoney());
        }
        Files.write(filePath, listOfUsers);

    }

    public static void transferMoney(List<User> userList, String user1, String user2, double amountOfMoney) {
        for (User user : userList) {
            if (user.getName().equals(user1)) {
                user.withdrowMoney(amountOfMoney);
                for (User innerLoopUser : userList) {
                    if (innerLoopUser.getName().equals(user2)) {
                        innerLoopUser.addMoney(amountOfMoney);
                        return;
                    }
                }
                return;
            }
        }
    }
}
