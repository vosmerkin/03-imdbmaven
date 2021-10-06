package request;

public class RequestName implements Request<String> {


    private RequestType rType;
    private String name;

    public RequestName(RequestType rType) {
        this.rType = rType;
    }

    @Override
    public RequestType getRequestType() {
        return rType;
    }

    @Override
    public String getRequestData() {
        return name;
    }

    @Override
    public void setRequestData(String data) {
        name = data;

    }
}
