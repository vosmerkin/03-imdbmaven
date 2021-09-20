package menu;

import java.util.HashMap;
import java.util.Map;

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



}
