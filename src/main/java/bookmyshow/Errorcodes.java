package bookmyshow;

public enum Errorcodes {
    BookMyShow_Invalid_1000("101","Invalid Pin"),
    BookMyShow_Insufficient_Funds_10001("102","Insufficient Funds");
    String code;
    String message;
    Errorcodes(String code, String message){
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
