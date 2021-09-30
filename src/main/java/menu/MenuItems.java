package menu;

 public  enum MenuItems {   //MenuItems
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

    MenuItems(int value, String menuName) {
        this.value = value;
        this.menuName = menuName;
    }

    public static MenuItems getMenuByValue(int value){
        MenuItems returnValue = MenuItems.UNKNOWN;
        for (MenuItems item:values()){
            if (item.getValue()==value){
                returnValue=item;
            }
        }
        return returnValue;
    }

    public int getValue(){
        return this.value;
    }

    public static void showMenu(){
        System.out.println("Main menu");
        for (MenuItems menuItem: MenuItems.values()) {
            System.out.println(menuItem.menuName);
        }

    }
    public void executeMenuAction(){

    }
}
