public class Menu1 {
    public void start() {
        RequestResponse requestMenu = new RequestResponse();
        do {
            requestMenu

        } while (response != menuItems.QUIT_9);
    }

    public enum menuItems {
        ADD_ENTRY_1,
        DELETE_ENTRY_2,
        SEARCH_BY_NAME_3,
        SEARCH_BY_SURNAME_4,
        SEARCH_BY_AGE_5,
        SHOW_DB_ON_SCREEN_6,
        IMPORT_FROM_FILE_7,
        EXPORT_TO_FILE_8,
        QUIT_9
    }


}
