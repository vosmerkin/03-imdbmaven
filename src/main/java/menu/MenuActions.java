package menu;

import imdb.*;
import request.*;

import java.time.LocalDate;

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
        Request<String> requestName = new RequestName(RequestType.INPUT_USER_NAME);
        Request<String> requestSurname = new RequestSurname(RequestType.INPUT_USER_SURNAME);
        Request<LocalDate> requestBirthday = new RequestDate(RequestType.INPUT_USER_BIRTHDAY);
        Request<Address> requestAddress = new RequestAddress(RequestType.INPUT_USER_ADDRESS);

        RequestExecute.execute(requestName);
        RequestExecute.execute(requestSurname);
        RequestExecute.execute(requestBirthday);
        RequestExecute.execute(requestAddress);

        db.addEntry(new User(requestName.getRequestData(), requestSurname.getRequestData(), requestBirthday.getRequestData(), requestAddress.getRequestData()));


    }

    private static void deleteEntry() {
    }

    private static void searchByName() {
        Imdb db = new UsersImdb();
        Request<String> requestName = new RequestSurname(RequestType.INPUT_USER_NAME);
        RequestExecute.execute(requestName);
        db.searchNameMap(requestName.getRequestData());


    }

    private static void searchBySurname() {
        Imdb db = new UsersImdb();
        Request<String> requestSurname = new RequestSurname(RequestType.INPUT_USER_SURNAME);
        RequestExecute.execute(requestSurname);
        db.searchSurnameMap(requestSurname.getRequestData());
    }

    private static void searchByAge() {
        Imdb db = new UsersImdb();
        Request<LocalDate> requestBirthday = new RequestDate(RequestType.INPUT_USER_BIRTHDAY);
        RequestExecute.execute(requestBirthday);
        db.searchBirthdaysMap(requestBirthday.getRequestData().toString());
    }


    private static void showDbOnScreen() {
    }

    private static void importFromFile() {
        ImportExport io = new ImportExport();
        Imdb db = new UsersImdb();
        db.setDb(io.importFromFile("./" + "imdb.txt"));
//        db.setDbNames (io.getMapByProperty(imdb.db, User.NAME_PROPERTY));
//        db.setDbSurnames  (io.getMapByProperty(imdb.db, User.SURNAME_PROPERTY));
//        db.setDbBirthdays  (io.getMapByProperty(imdb.db, User.BIRTHDAY_PROPERTY));
    }

    private static void exportToFile() {
    }

    private static void quit() {
    }


}
