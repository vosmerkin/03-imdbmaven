package request;

public class RequestSurname implements Request<String> {


    private RequestType rType;
    private String surname;

    public RequestSurname(RequestType rType) {
        this.rType = rType;
    }

    @Override
    public RequestType getRequestType() {
        return rType;
    }

    @Override
    public String getRequestData() {
        return surname;
    }

    @Override
    public void setRequestData(String data) {
        surname = data;

    }
}
