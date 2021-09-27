package menu;

public class Menu2 {


    public void startMenu() {
        EnumMenu userChoice = EnumMenu.UNKNOWN;
        Request rqst = new RequestMenu();

        do {
            EnumMenu.showMenu();

            userChoice = (EnumMenu) rqst.getRequestType(RequestType.CHOOSE_MENU_ITEM).getRequestData();
            userChoice = rqst.getRequestData2(RequestType.CHOOSE_MENU_ITEM);

            //тут без (EnumMenu) пишет, что getRequestData() возвращает Object


            MenuActions.runMenuActions(userChoice);


        } while (userChoice != EnumMenu.QUIT_9);

    }

}
