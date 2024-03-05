package interfacelatestdemo;

public class InvalidOTPException extends Exception{
    private String code; //Exception - immutable class - writing custom checked exceptions

    public InvalidOTPException(String errorCode, String message){
        super(message);
        this.code = errorCode;

    }

    public String getCode() {
        return code;
    }
}
