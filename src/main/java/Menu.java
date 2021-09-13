import imdb.*;

import java.time.LocalDate;
import java.util.Scanner;

public class Menu {

    public static final String SEARCH_BY_NAME = "name";
    public static final String SEARCH_BY_SURNAME = "surname";
    public static final String SEARCH_BY_BIRTHDAY = "birthday";

    Scanner scanner = new Scanner(System.in);

    public void start() {
        Imdb imdb = new UsersImdb();

        Integer menuItem;
        do {
            menuItem = this.mainMenu();
            ImportExport io = new ImportExport();

            switch (menuItem) {
                case (1): //1 - Add entry
                    addEntry((UsersImdb) imdb);

                    //TODO delete this

                    break;
                case (2): //2 - Delete entry
                    delete((UsersImdb) imdb);
                    break;
                case (3): //3 - Search by name
                    searchWithMap((UsersImdb) imdb, SEARCH_BY_NAME);
//                    this.editEntry(imdb);
                    break;
                case (4): //4 - Search by surname
//                    this.search(imdb);
                    searchWithMap((UsersImdb) imdb, SEARCH_BY_SURNAME);
                    break;

                case (5): //5 - Search by age
                    searchWithMap((UsersImdb) imdb, SEARCH_BY_BIRTHDAY);
//                    this.searchAge(imdb);
                    break;

                case (6): //6 - Show db on the screen
                    io.showOnScreen(imdb.db);
                    break;
                case (7): //7 - Import from file
                    imdb.db = io.importFromFile("./" + "imdb.txt");
                    imdb.dbNames = io.getMapByProperty(imdb.db, User.NAME_PROPERTY);
                    imdb.dbSurnames = io.getMapByProperty(imdb.db, User.SURNAME_PROPERTY);
                    imdb.dbBirthdays = io.getMapByProperty(imdb.db, User.BIRTHDAY_PROPERTY);
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

//    private void searchAge(UsersImdb imdb) {
//        System.out.println("Enter searched date of birth:");
//        System.out.println("Year:");
//        int searchYear = scanner.nextInt();
//        System.out.println("Month:");
//        int searchMonth = scanner.nextInt();
//        System.out.println("Day:");
//        int searchDay = scanner.nextInt();
//        imdb.searchUsers("", LocalDate.of(searchYear, searchMonth, searchDay));
//
//    }

    private void searchWithMap(UsersImdb imdb, String searchParameter) {
        switch (searchParameter) {
            case SEARCH_BY_NAME: {
                String searchString = inputStr("Enter user name:");
                imdb.searchUsersMap(imdb.dbNames, searchString);
                break;
            }
            case SEARCH_BY_SURNAME: {
                String searchString = inputStr("Enter user surname:");
                imdb.searchUsersMap(imdb.dbSurnames, searchString);
                break;
            }
            case SEARCH_BY_BIRTHDAY: {
                String searchString = inputStr("Enter user birthday (YYYY-MM-DD):");
                imdb.searchUsersMap(imdb.dbBirthdays, searchString);
                break;
            }
        }
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

    private void delete(UsersImdb imdb) {
        System.out.println("Enter index of the user entry to delete:");
        String userIndex = scanner.next();
        String userConfirmation;

        int userIndex1 = Integer.parseInt(userIndex);
        if ((userIndex1 > 0) && (userIndex1 <= imdb.db.size())) {
            System.out.println("Imdb.User index - " + userIndex1);
            System.out.println(imdb.db.get(userIndex1).toString());
            System.out.println("Remove this user? (Type 1 to confirm):");

            userConfirmation = scanner.next();
            if ("1".equals(userConfirmation)) imdb.delete(userIndex1);
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


    public void search(UsersImdb imdb) {
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
        System.out.println("3 - Search by name");
        System.out.println("4 - Search by surname");
        System.out.println("5 - Search by age");
        System.out.println("6 - Show db on the screen");
        System.out.println("7 - Import from file");
        System.out.println("8 - Export to file");
        System.out.println("9 - Quit");
        int i = scanner.nextInt();
        String s = scanner.nextLine();
        return i;
    }


    public int inputInt(String prompt, int maxVal, int minVal, int emptyInputVal) {
        System.out.println(prompt);
        String str = scanner.nextLine();
        int returnVal = emptyInputVal;
        try {
            returnVal = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
        if (minVal > returnVal) {
            System.out.println("Input out of bounds. Value " + minVal + " is used");
            returnVal = minVal;
        }
        if (maxVal < returnVal) {
            System.out.println("Input out of bounds. Value " + maxVal + " is used");
            returnVal = maxVal;
        }
        return returnVal;
    }

    public String inputStr(String prompt) {
        System.out.println(prompt);
        return scanner.nextLine();
    }


    public User inputUserData(String prompt) {
        System.out.println(prompt);

        String name = inputStr("Enter user name:");
        String surname = inputStr("Enter user surname:");

        System.out.println("Enter user birthdate");
        int year = inputInt("Year (1900...2021):", 2021, 1900, 5000);
        int month = inputInt("Month(1...12):", 12, 1, 1);
        int day = inputInt("Day(1...31):", 30, 1, 1);
        LocalDate birthday = LocalDate.of(year, month, day);

        System.out.println("Enter user address");
        String city = inputStr("City:");
        String street = inputStr("Street:");
        int app = inputInt("App:", 10000000, 1, 1);
        return new User(name, surname, birthday, new Address(city, street, app));
    }

    public void addEntry(UsersImdb imdb) {
        imdb.addEntry(this.inputUserData("Adding new entry"));
    }

}
