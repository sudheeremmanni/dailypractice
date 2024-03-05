package interfacelatestdemo;

public enum ErrorCodes {

    NEOTERIC_INVALID_OTP_1000("NEOTERIC_IV_1000", "Invalid OTP"),
    NEOTERIC_EXPIRY_OTP_1001("NEOTERIC_EX_1001", "Expired OTP");
    String code;
    String message;
    ErrorCodes(String errorCode, String message){ //as many as parameters we can pass to constructor
        this.code = errorCode;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
