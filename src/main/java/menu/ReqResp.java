package menu;

public class ReqResp<T> implements Request {




    enum requestType
    {
        CHOOSE_MENU_ITEM,
        INPUT_DATA
    }


    @Override
    public Enum getRequestType(String requestTypeString) {
        return  requestType.valueOf("requestTypeString");
        // catch exception??
    }

    @Override
    public T getRequestData(Enum request) {

    return null;
    }
}


//        ADD_ENTRY (1, menu.MenuActions.addEntry()),
//        DELETE_ENTRY (2, menu.MenuActions.deleteEntry());

//        RequestType( int val, Runnable toRun) {
//        }