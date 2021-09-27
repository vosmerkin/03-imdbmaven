package menu;


public class RequestMenu <EnumMenu> implements Request {

    private RequestType rType;
    private MenuItems menuItem;

    public RequestMenu(RequestType rType) {
        this.rType = rType;
    }


    @Override
    public RequestType getRequestType() {
        return rType;
    }

    @Override
    public MenuItems getRequestData() {
        return menuItem;
    }

}
