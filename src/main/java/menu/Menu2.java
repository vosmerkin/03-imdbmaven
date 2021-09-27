package menu;

public class Menu2 {


    public void startMenu() {
        MenuItems userChoice = MenuItems.UNKNOWN;
        Request rqst = new RequestMenu(RequestType.CHOOSE_MENU_ITEM);

        do {
            MenuItems.showMenu();


//            userChoice = (MenuItems) rqst.getRequestType(RequestType.CHOOSE_MENU_ITEM).getRequestData();
            //тут без (EnumMenu) пишет, что getRequestData() возвращает Object


//            userChoice = rqst.getRequestData2(RequestType.CHOOSE_MENU_ITEM);
            MenuActions.runMenuActions(userChoice);


        } while (userChoice != MenuItems.QUIT_9);

    }

}
