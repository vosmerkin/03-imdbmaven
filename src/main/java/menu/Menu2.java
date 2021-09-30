package menu;

public class Menu2 {


    public void startMenu() {
        MenuItems userChoice = MenuItems.UNKNOWN;
        Request requestMenu = new RequestMenu(RequestType.CHOOSE_MENU_ITEM);

        do {
            MenuItems.showMenu();
            RequestExecute.execute(requestMenu);
            userChoice = requestMenu.getRequestData();
            MenuActions.runMenuActions(userChoice);


        } while (userChoice != MenuItems.QUIT_9);

    }

}
