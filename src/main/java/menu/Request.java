package menu;

public interface Request <T>{
 //   enum RequestType{};  // типом запросов
//    Enum getRequestType(String requestTypeString);

    Object getRequestData(RequestType rType);

}
