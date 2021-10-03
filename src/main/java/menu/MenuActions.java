package menu;

import imdb.Imdb;
import imdb.UsersImdb;

public class MenuActions {


    public static void runMenuActions(MenuItems userChoice) {
        switch (userChoice) {
            case ADD_ENTRY_1:
                addEntry();
                break;
            case DELETE_ENTRY_2:
                deleteEntry();
                break;
            case SEARCH_BY_NAME_3:
                searchByName();
                break;
            case SEARCH_BY_SURNAME_4:
                searchBySurname();
                break;
            case SEARCH_BY_AGE_5:
                searchByAge();
                break;
            case SHOW_DB_ON_SCREEN_6:
                showDbOnScreen();
                break;
            case IMPORT_FROM_FILE_7:
                importFromFile();
                break;
            case EXPORT_TO_FILE_8:
                exportToFile();
                break;
            case QUIT_9:
                quit();
                break;
            case UNKNOWN:
                break;
        }
        //run method by its name
        // switch or reflection

    }

    public static void addEntry() {
         Imdb db = new UsersImdb();

    }

    private static void deleteEntry() {
    }

    private static void searchByName() {
    }

    private static void searchBySurname() {
    }

    private static void searchByAge() {
    }

    private static void showDbOnScreen() {
    }

    private static void importFromFile() {
    }

    private static void exportToFile() {
    }

    private static void quit() {
    }


}
