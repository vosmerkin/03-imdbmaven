package request;

import imdb.Address;

public class RequestAddress implements Request<Address> {

    private RequestType rType;
    private Address address;

    public RequestAddress(RequestType rType) {
        this.rType = rType;
    }

    @Override
    public RequestType getRequestType() {
        return rType;
    }

    @Override
    public Address getRequestData() {
        return address;
    }

    @Override
    public void setRequestData(Address data) {
        address = data;

    }
}
