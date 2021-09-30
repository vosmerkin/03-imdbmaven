package menu;

import java.util.Scanner;

public class RequestExecute {

    public static void execute (Request request){
        Scanner scanner = new Scanner(System.in);
        switch (request.getRequestType()){
            case CHOOSE_MENU_ITEM: {
                MenuItems.showMenu();
                request.setRequestData(MenuItems.getMenuByValue(scanner.nextInt()));
            }
            case INPUT_DATA :{

            }
        }
    }
}
