public interface Request <T>{
//    enum RequestType;  // типом запросов
    Enum getRequestType ();

    T getRequestData();

}
