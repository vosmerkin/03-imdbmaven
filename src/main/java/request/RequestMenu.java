package request;


import menu.MenuItems;

public class RequestMenu implements Request<MenuItems> {

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

    @Override
    public void setRequestData(MenuItems data) {
        menuItem = data;
    }


}
