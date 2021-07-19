package Imdb;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class ImportExport {

    public List<User> importFromFile(String filename) {
        List<User> list = new ArrayList<>();

        try (BufferedReader in = new BufferedReader(new FileReader(new File(filename).getAbsoluteFile()))) {
            String s;
            String s1[];
            while ((s = in.readLine()) != null) {
                s1 = s.split(":");
                list.add(new User(s1[0], s1[1], LocalDate.parse(s1[2], DateTimeFormatter.ofPattern("yyyy-MM-dd")), new Address(s1[3], s1[4], Integer.parseInt(s1[5]))));
                System.out.println(s);
            }
        } catch (IOException e) {
            System.out.println("File not found");
            System.out.println(e.getMessage());
        }
        return list;
    }

    public void exportToFile(String filename, List<User> list) {
        try (PrintWriter out = new PrintWriter(new File(filename).getAbsoluteFile())) {
            for (User user : list) {
                out.println(user.toString());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            System.out.println(e.getMessage());
        }
    }


    public void showOnScreen(List<User> list) {
        for (User user : list) {
            System.out.println(user.toString());
        }
    }

}
