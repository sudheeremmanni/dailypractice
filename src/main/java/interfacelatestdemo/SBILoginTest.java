package interfacelatestdemo;

public class SBILoginTest {
    public static void main(String[] args){
       BankLoginService loginService = new SBIBankLoginProcess();
      //  BankLoginService loginService = new SBIBankLoginProcess(null); -to test aggretion null point exception
        try {
            boolean loginStatus = loginService.login("1111", "1234");
            if (loginStatus) {
                System.out.println("Login Successful");
            } else {
                System.out.println("Login failed");
            }
        }catch (InvalidRunTimeOTPException e){
            System.out.println(e.getCode() +"" +e.getMessage());

        }
    }
}
