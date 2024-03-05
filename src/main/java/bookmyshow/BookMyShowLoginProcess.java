package bookmyshow;

import interfacelatestdemo.InvalidOTPException;

public class BookMyShowLoginProcess implements BookMyShowLoginService{

    String user = "Mahesh";
    String pwd = "1234";

    @Override
    public boolean login(String userName, String password) throws InvalidPin {

            if (user.equals(userName) && pwd.equals(password)) {
                return true;
            } else {
                System.out.println("Invalid Pin");
                throw new InvalidPin(Errorcodes.BookMyShow_Invalid_1000.getCode(), Errorcodes.BookMyShow_Invalid_1000.message);

            }
        }




        }


