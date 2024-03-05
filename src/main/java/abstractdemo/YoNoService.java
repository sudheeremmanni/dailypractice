package abstractdemo;

import abstractdemo.SBIBankService;

public class YoNoService extends SBIBankService {
    public YoNoService(String accountNumber, int amt){
        super(accountNumber,amt);
    }
    @Override
    public String helloWorld() {
        return null;
    }
    public void login(){

    }
}
