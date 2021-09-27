package menu;

public interface Request <T>{
 //   enum RequestType{};  // типом запросов
 RequestType getRequestType();


    T getRequestData();

}
