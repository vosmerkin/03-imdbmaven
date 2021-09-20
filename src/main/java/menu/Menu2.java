package menu;

public class Menu2 {





    public void startMenu() {
        Integer userChoice;
        Rqst rqst;
        rqst = RequestType.CHOOSE_MENU_ITEM;
        do {

            EnumMenu.showMenu();
            rqst.getRequestType();


//            userChoice = (Integer) rqst.getRequestData(RequestType.CHOOSE_MENU_ITEM);



        } while (userChoice != 9);

    }

}
