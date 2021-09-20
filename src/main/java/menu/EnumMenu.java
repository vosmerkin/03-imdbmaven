package menu;

 public  enum EnumMenu {
    ADD_ENTRY_1 (1, "Add entry"),
    DELETE_ENTRY_2 (2, "Delete entry"),
    //        SEARCH_BY_NAME_3,
//        SEARCH_BY_SURNAME_4,
//        SEARCH_BY_AGE_5,
//        SHOW_DB_ON_SCREEN_6,
//        IMPORT_FROM_FILE_7,
//        EXPORT_TO_FILE_8,
    QUIT_9 (9, "Quit"),
    UNKNOWN (0, "");


    static {}

    private int value;
    private String menuName;

    EnumMenu(int value, String menuName) {
        this.value = value;
        this.menuName = menuName;
    }

    public static void showMenu(){
        System.out.println("Main menu");
        for (EnumMenu menuItem: EnumMenu.values()) {
            System.out.println(menuItem.menuName);
        }

    }
}
