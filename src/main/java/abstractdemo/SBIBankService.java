package abstractdemo;


public abstract class SBIBankService extends RBIBankService {

    String accountNumber;
    int amt;
    public SBIBankService(String accountNumber, int amt){
        super(1234,2.4);
        this.accountNumber = accountNumber;
        this.amt = amt;


    }
    public double calculateInterest(int principalAmt){
        double totalAmt =0;
        double processingAmt = principalAmt * 2.4/100;

        totalAmt = processingAmt + principalAmt;

        return  totalAmt;
    }
}
