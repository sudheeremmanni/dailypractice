package bookmyshow;

public class BookMyshowTest {
    public static void main(String[] args) throws InvalidPin {
        BookMyShowLoginProcess bookMyShowLoginProcess = new BookMyShowLoginProcess();
        try {
            bookMyShowLoginProcess.login("Raja", "Mahesh");
        }catch (InvalidPin pin){
            throw new InvalidPin(pin.getCode(),pin.getMessage());
        }

    }
}
