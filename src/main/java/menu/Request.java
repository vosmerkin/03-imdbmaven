package menu;

public interface Request <T>{
 //   enum RequestType{};  // типом запросов
 Request getRequestType(RequestType rType);


    T getRequestData();

}
