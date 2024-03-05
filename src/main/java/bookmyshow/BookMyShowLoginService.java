package bookmyshow;

public interface BookMyShowLoginService {
    boolean login(String userName, String password) throws InvalidPin;
}
