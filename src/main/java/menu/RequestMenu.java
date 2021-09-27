package menu;


public class RequestMenu <EnumMenu> implements Request {

    private RequestType rType;

    @Override
    public RequestMenu getRequestType(menu.RequestType rType) {
        this.rType = rType;
        return this;
    }

    @Override
    public menu.EnumMenu getRequestData() {
        if (RequestType.CHOOSE_MENU_ITEM.equals(this.rType)) {
            //scanner
            //запрашиваем выбор пользователя
            //возвращаем EnumMenu.выбранный пункт меню
        }

        return menu.EnumMenu.UNKNOWN;
    }


    public EnumMenu getRequestData2(menu.RequestType rType) {
        if (RequestType.CHOOSE_MENU_ITEM.equals(this.rType)) {
            //scanner
            //запрашиваем выбор пользователя
            //возвращаем EnumMenu.выбранный пункт меню
        }
        return (EnumMenu) menu.EnumMenu.UNKNOWN;
    }
}
