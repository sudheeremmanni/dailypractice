package bookmyshow;

public class InvalidPin extends Exception{
    private String code;



    public InvalidPin(String code, String message){
        super(message);
        this.code = code;
    }
    public String getCode() {
        return code;
    }

}
