public class ReqResp <T> implements Request {
    enum RequestType{
        addEntry (1,MenuActions.addEntry),
        deleteEntry (2,MenuActions.deleteEntry)
    };

    @Override
    public Enum getRequestType() {

        return null;
    }

    @Override
    public Object getRequestData() {
        return null;
    }
}
