package filenotfoundexc;

public class CustomFileNotFoundException extends RuntimeException{
    private String code;
    CustomFileNotFoundException(String errorCode, String message){
        super(message);
        this.code = errorCode;
    }

    public String getCode() {
        return code;
    }
}
