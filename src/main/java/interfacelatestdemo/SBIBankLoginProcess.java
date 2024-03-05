package interfacelatestdemo;

import java.util.UUID;

public class SBIBankLoginProcess implements BankLoginService{

    //SBIBankLoginService sbiBankLoginService;
    BankOTPValidationService sbiBankLoginService;
    //Composition
    public SBIBankLoginProcess(){
        this.sbiBankLoginService = new SBIBankLoginService();

    }
    //Agreation
    public SBIBankLoginProcess(SBIBankLoginService sbiBankLoginService){
        this.sbiBankLoginService = sbiBankLoginService;

    }

    @Override
    public boolean login(String userName, String password) {
        if(sbiBankLoginService.login(userName, password)){
            String otp = sbiBankLoginService.generateOTP(userName);
            boolean validOtp = false;
            try {
                validOtp = sbiBankLoginService.validateOTP(UUID.randomUUID().toString());
            }catch (InvalidOTPException invalidOTPException){
                System.out.println("Error Occured" +invalidOTPException);
                throw new InvalidRunTimeOTPException(invalidOTPException.getCode(),invalidOTPException.getMessage());
            }catch (Exception e){
                System.out.println(e);

                throw new RuntimeException(e);

            }
            if(validOtp){
                System.out.println("Login is Successful");

            }
            else{
                System.out.println("Login Failed");
            }
            return validOtp;

        }else {
            System.out.println("Invalid Credentials");

        return false;
    }}
}
