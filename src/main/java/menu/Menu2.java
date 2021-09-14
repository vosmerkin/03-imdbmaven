package menu;

public class Menu2 {

    public enum menuItems {
        ADD_ENTRY_1(1, MenuActions.addEntry()),
        DELETE_ENTRY_2(2, MenuActions.deleteEntry()),
        //        SEARCH_BY_NAME_3,
//        SEARCH_BY_SURNAME_4,
//        SEARCH_BY_AGE_5,
//        SHOW_DB_ON_SCREEN_6,
//        IMPORT_FROM_FILE_7,
//        EXPORT_TO_FILE_8,
        QUIT_9(9, MenuActions.quit());

        private int value;
        private Runnable menuAction;

        menuItems(int value, Runnable menuAction) {
            this.value = value;
            this.menuAction = menuAction;
        }



    }


    public void startMenu() {
        Integer userChoice;
        ReqResp<Integer> reqResp = new ReqResp();
        do {
            for (menuItems item : menuItems.values()) {
                System.out.println(item.value);
            }

            userChoice = reqResp.getRequestData(reqResp.getRequestType("CHOOSE_MENU_ITEM"));

            for (menuItems item : menuItems.values() ) {
                if (item.value == userChoice) item.menuAction.run();
            }

        } while (userChoice != 9);

    }

}
