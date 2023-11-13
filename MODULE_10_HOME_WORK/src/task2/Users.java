package task2;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Users {
    public static void main(String[] args) throws IOException {
        try(FileWriter fw = new FileWriter("C:\\Users\\bagri\\java16\\MODULE_10_HOME_WORK\\src\\task2\\UsersList.txt")) {
            fw.write("Name Age\n");
            fw.write("Vova 36\n");
            fw.write("Valera 25\n");
            fw.write("Lusia 18\n");
            fw.write("Antonina 45\n");
            fw.write("Max 27\n");
        }
        //fw.flush();
       // fw.close();

        List<UsersInfo> userList = readUsersFromFile("C:\\Users\\bagri\\java16\\MODULE_10_HOME_WORK\\src\\task2\\UsersList.txt");
        writeUsersToJsonFile(userList, "C:\\Users\\bagri\\java16\\MODULE_10_HOME_WORK\\src\\task2\\UsersList.json");
    }

    private static List<UsersInfo> readUsersFromFile(String s) throws IOException {
        List<UsersInfo> userList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(s))) {
            reader.readLine();
            String line;
            while ((line = reader.readLine()) != null) {
                String[] columns = line.split(" ");
                if (columns.length == 2) {
                    String name = columns[0];
                    int age = Integer.parseInt(columns[1]);
                    UsersInfo user = new UsersInfo();
                    user.setName(name);
                    user.setAge(age);

                    userList.add(user);
                }
            }
        }
        return userList;
}

    private static void writeUsersToJsonFile(List<UsersInfo> userList, String outputPath) throws IOException {
        FileWriter writer = new FileWriter(outputPath);
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        gson.toJson(userList, writer);
        writer.flush();
        writer.close();
    }
}
