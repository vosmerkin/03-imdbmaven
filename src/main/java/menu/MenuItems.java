package menu;

public enum MenuItems {   //MenuItems
    ADD_ENTRY_1(1, "Add entry"),
    DELETE_ENTRY_2(2, "Delete entry"),
    SEARCH_BY_NAME_3(3, "Search by name"),
    SEARCH_BY_SURNAME_4(4, "Search by surname"),
    SEARCH_BY_AGE_5(5, "Search by age"),
    SHOW_DB_ON_SCREEN_6(6, "Show db on screen"),
    IMPORT_FROM_FILE_7(7, "Import from file"),
    EXPORT_TO_FILE_8(8, "Export to file"),
    QUIT_9(9, "Quit"),
    UNKNOWN(0, "");


    static {
    }


    private int value;
    private String menuName;

    MenuItems(int value, String menuName) {
        this.value = value;
        this.menuName = menuName;
    }

    public static MenuItems getMenuByValue(int value) {
        MenuItems returnValue = MenuItems.UNKNOWN;
        for (MenuItems item : values()) {
            if (item.getValue() == value) {
                returnValue = item;
            }
        }
        return returnValue;
    }

    public int getValue() {
        return this.value;
    }

    public static void showMenu() {
        System.out.println("Main menu");
        for (MenuItems menuItem : MenuItems.values()) {

            System.out.println(menuItem.menuName + " " + menuItem.value);
        }

    }


}
