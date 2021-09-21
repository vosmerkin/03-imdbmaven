package menu;

public class Menu2 {





    public void startMenu() {
        Integer userChoice = 0;
//        Rqst rqst = new Rqst();
//        rqst = RequestType.CHOOSE_MENU_ITEM;
        do {
            EnumMenu.showMenu();
//            userChoice = (Integer) rqst.getRequestData(RequestType.CHOOSE_MENU_ITEM);
            userChoice = (Integer) RequestType.getMethodByName("CHOOSE_MENU_ITEM").getRequestData();
//  stMethod = RequestType.getRequestData().
//
////            userChoice = (          requeInteger) rqst.getRequestData(RequestType.CHOOSE_MENU_ITEM);



        } while (userChoice != 9);

    }

}
