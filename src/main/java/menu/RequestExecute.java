package menu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
                List list2 = new ArrayList(Arrays. asList(1, 2, 3, 4, 5, 6));
            }
        }
    }
}
