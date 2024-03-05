package interfacelatestdemo;

public class InvalidRunTimeOTPException extends RuntimeException {
    private String code; //Exception - immutable class - writing custom checked exceptions

    public InvalidRunTimeOTPException(String errorCode, String message){
        super(message);
        this.code = errorCode;

    }

    public String getCode() {
        return code;
    }
}
