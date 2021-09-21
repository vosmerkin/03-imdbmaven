package menu;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public enum RequestType {
    CHOOSE_MENU_ITEM,
    INPUT_DATA,
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

    public Object getRequestData() {
        Scanner  scanner = new Scanner(System.in);
        Object returnValue=null;
        switch (this.name()) {
            case ("CHOOSE_MENU_ITEM"):{

                returnValue= (Integer) scanner.nextInt();
                break;
            }
            case ("INPUT_DATA"):{
                //surname
                returnValue= (String) scanner.nextLine();
                break;
            }

        }

        return returnValue;
    }



}
