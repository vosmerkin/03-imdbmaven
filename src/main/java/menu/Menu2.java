package menu;

public class Menu2 {


    public void startMenu() {
        EnumMenu userChoice = EnumMenu.UNKNOWN;
        do {
            EnumMenu.showMenu();

            userChoice = (EnumMenu) RequestType.getMethodByName("CHOOSE_MENU_ITEM").getRequestData();

            MenuActions.runMenuActions(userChoice);


        } while (userChoice != EnumMenu.QUIT_9);

    }

}
