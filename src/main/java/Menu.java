import java.time.LocalDate;
import java.util.Scanner;
import Imdb.*;

public class Menu {

    Scanner scanner = new Scanner(System.in);

    public void start() {
        Imdb imdb = new Imdb();

        Integer menuItem;
        do {
            menuItem = this.mainMenu();
            ImportExport io = new ImportExport();

            switch (menuItem) {
                case (1): //1 - Add entry
                    this.addEntry(imdb);

                    break;
                case (2): //2 - Delete entry
                    this.delete(imdb);
                    break;
                case (3): //3 - Edit entry
//                    System.out.println("Not yet");
//                    this.editEntry(imdb);
                    break;
                case (4): //4 - Search by name
                    this.search(imdb);

                    break;

                case (5): //5 - Search by age
                    this.searchAge(imdb);
                    break;

                case (6): //6 - Show db on the screen
                    io.showOnScreen(imdb.db);
                    break;
                case (7): //7 - Import from file
                    imdb.db = io.importFromFile("./" + "imdb.txt");
                    break;
                case (8): //8 - Export to file
                    io.exportToFile("./" + "imdb.txt", imdb.db);
                    break;
                case (9): //9 - Quit

                    break;
            }

        }
        while (menuItem != 9);
    }

    private void searchAge(Imdb imdb) {
        System.out.println("Enter searched date of birth:");
        System.out.println("Year:");
        int searchYear = scanner.nextInt();
        System.out.println("Month:");
        int searchMonth = scanner.nextInt();
        System.out.println("Day:");
        int searchDay = scanner.nextInt();
        imdb.searchUsers("", LocalDate.of(searchYear, searchMonth, searchDay));

    }

//    private void editEntry(Imdb.Imdb imdb) {
//        System.out.println("Enter index of the user entry to edit, or use search to find it (type _7):");
//        String userIndex = scanner.next();
//        String userConfirmation;
//        if (userIndex.equals("_7")) this.search(imdb);
//        else {
//            int userIndex1 = Integer.parseInt(userIndex);
//            if ((userIndex1 > 0) & (userIndex1 <= imdb.db.size())){
//                System.out.println("Imdb.User index - " + userIndex1);
//                System.out.println(imdb.db.get(userIndex1).toString());
//            }
//        }
//    }

    private void delete(Imdb imdb) {
        System.out.println("Enter index of the user entry to delete, or use search to find it (type _7):");
        String userIndex = scanner.next();
        String userConfirmation;
        if (userIndex.equals("_7")) this.search(imdb);
        else {
            int userIndex1 = Integer.parseInt(userIndex);
            if ((userIndex1 > 0) & (userIndex1 <= imdb.db.size())) {
                System.out.println("Imdb.User index - " + userIndex1);
                System.out.println(imdb.db.get(userIndex1).toString());
                System.out.println("Remove this user? (Type 1 to confirm):");

                userConfirmation = scanner.next();
                if (userConfirmation.equals("1")) imdb.delete(userIndex1);
            }
        }


    }

//    class searchUserComp implements Comparator<Imdb.User> {
//        @Override public int compare(Imdb.User s1, Imdb.User s2)
//        {
//            if (s1.getSid() == s2.getSid()) {
//                return 0;
//            }
//            else if (s1.getSid() > s2.getSid()) {
//                return 1;
//            }
//            else if (s1.getSid() < s2.getSid()) {
//                return -1;
//            }
//            return -1;
//        }
//    }


    public void search(Imdb imdb) {

        imdb.searchUsersStream(this.inputUserData("Enter user search parameters"));
//
//        System.out.println("Enter search string:");
//        String searchString = scanner.next();
//        //int[] searchResults;
//        imdb.searchUsers(searchString,LocalDate.of(1, 1, 1) );
    }

    public Integer mainMenu() {
        System.out.println("1 - Add entry");
        System.out.println("2 - Delete entry");
        //System.out.println("3 - Edit entry");
        System.out.println("4 - Search by name or address");
        //System.out.println("5 - Search by age");
        System.out.println("6 - Show db on the screen");
        System.out.println("7 - Import from file");
        System.out.println("8 - Export to file");
        System.out.println("9 - Quit");
        int i=scanner.nextInt();
        String s= scanner.nextLine();
        return i;
    }


    public int inputInt(String prompt, int maxVal, int minVal, int emptyInputVal){
        System.out.println(prompt);
        String str=scanner.nextLine();
        int returnVal=emptyInputVal;
        try {
            returnVal = Integer.parseInt(str);
            if (minVal > returnVal) {
                System.out.println("Input out of bounds. Value " + minVal + " is used");
                returnVal = minVal;
            }
            if (maxVal < returnVal) {
                System.out.println("Input out of bounds. Value " + maxVal + " is used");
                returnVal = maxVal;
            }
        }
        catch (NumberFormatException e)
        {
            returnVal = emptyInputVal;
        }


        return returnVal;
    }

    public String inputStr(String prompt){
        System.out.println(prompt);
        String str=scanner.nextLine();
        return str;
    }


    public User inputUserData(String prompt){
        System.out.println(prompt);

        String name = inputStr("Enter user name:");
        String surname =  inputStr("Enter user surname:");

        System.out.println("Enter user birthdate");
        int year = inputInt("Year (1900...2021):",2021,1900,5000);
        int month = inputInt("Month(1...12):",12,1,1);
        int day = inputInt("Day(1...31):",30,1,1);
        LocalDate birthday = LocalDate.of(year, month, day);

        System.out.println("Enter user address");
        String city = inputStr("City:");
        String street = inputStr("Street:");
        int app = inputInt("App:",10000000,1,1);
        return new User(name, surname, birthday, new Address(city, street, app));
    }

    public void addEntry(Imdb imdb) {
        imdb.addEntry(this.inputUserData("Adding new entry"));
    }

}
