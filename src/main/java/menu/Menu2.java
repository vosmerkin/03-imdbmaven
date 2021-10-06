package menu;

import imdb.Imdb;
import imdb.UsersImdb;
import request.Request;
import request.RequestExecute;
import request.RequestMenu;
import request.RequestType;

public class Menu2 {


    public static void startMenu() {
        MenuItems userChoice = MenuItems.UNKNOWN;
        Request<MenuItems> requestMenu = new RequestMenu(RequestType.CHOOSE_MENU_ITEM);
        Imdb db = new UsersImdb();

        do {
            RequestExecute.execute(requestMenu);
            userChoice = requestMenu.getRequestData();
            MenuActions.runMenuActions(userChoice);
        } while (userChoice != MenuItems.QUIT_9);

    }

}
