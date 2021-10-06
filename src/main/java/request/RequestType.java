package request;

import java.util.HashMap;
import java.util.Map;

public enum RequestType {
    CHOOSE_MENU_ITEM,
    INPUT_USER_NAME,
    INPUT_USER_SURNAME,
    INPUT_USER_BIRTHDAY,
    INPUT_USER_ADDRESS,
    UNKNOWN;

    private static final Map<String, RequestType> MAPPING = new HashMap<>();

    static {
        for (RequestType rType : RequestType.values()) {
            MAPPING.put(rType.name(), rType);
        }
    }

    public static RequestType getMethodByName(String name) {
        RequestType result = RequestType.UNKNOWN;
        if (name != null && MAPPING.containsKey(name.toUpperCase())) {
            result = MAPPING.get(name.toUpperCase());
        }
        return result;
    }


//    public Object getRequestData(RequestType rType) {
//        Scanner scanner = new Scanner(System.in);
//        Object returnValue = null;
//
//        switch (rType) {
//            case CHOOSE_MENU_ITEM: {
//
//            }
//        }
//
//        switch (this.name()) {
//            case ("CHOOSE_MENU_ITEM"): {
//                int userInput = scanner.nextInt();
//                for (EnumMenu menuItem : EnumMenu.values()) {
//                    if (userInput > 0 && menuItem.getValue() == userInput){
//                        returnValue = (EnumMenu) menuItem;
//                        break;
//                    }
//                }
//
//                break;
//            }
//            case ("INPUT_DATA"): {
//                //surname
//                returnValue = (String) scanner.nextLine();
//                break;
//            }
//
//        }
//
//        return returnValue;
//    }


}
