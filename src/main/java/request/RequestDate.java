package request;

import java.time.LocalDate;

public class RequestDate implements Request<LocalDate> {
    private RequestType rType;
    private LocalDate date;

    public RequestDate(RequestType rType) {
        this.rType = rType;
    }

    @Override
    public RequestType getRequestType() {
        return rType;
    }

    @Override
    public LocalDate getRequestData() {
        return date;
    }

    @Override
    public void setRequestData(LocalDate data) {
        date = data;

    }
}
