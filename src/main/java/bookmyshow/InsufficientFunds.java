package bookmyshow;

public class InsufficientFunds extends RuntimeException{
    private String code;

    public InsufficientFunds(String errorCode, String message) {
       super(message);
        this.code = errorCode;
    }

    public String getCode() {
        return code;
    }
}
