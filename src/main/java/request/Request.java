package request;

public interface Request<T> {
    //   enum RequestType{};  // типом запросов
    RequestType getRequestType();

    T getRequestData();

    void setRequestData(T data);

}
