package polymorphism;

public class BankServiceTest {
    public static void main(String[] args){
        SBIBankService sbiBankService = new SBIBankService();
        /*double sbiBankInterest = sbiBankService.calculateInterest(1000, 86);
        System.out.println("SBI Bank Interest"+sbiBankInterest);

        HDFCBankService hdfcBankService = new HDFCBankService();
        double hdfcBankInterest = hdfcBankService.calculateInterest(1000, 90);
        System.out.println("HDFC Bank " +hdfcBankInterest);*/

        RBIBankService sbiBank = new SBIBankService();
        double sbiProcessingFee = sbiBankService.processingFee(1000000);
        System.out.println(("Welcome to the SBI Personal Loans EMI Calculator "));
        System.out.println("Principal Amount taken "+sbiBankService.principalAmount);
        System.out.println("Processing Fee Amount " +sbiBankService.processingAmt);
        System.out.println("Principal Amount to be paid "+sbiBankService.remainingAmount);


        sbiBankService.emiCalculation(sbiBankService.remainingAmount,7.2,120);

        //System.out.println("EMI Amount for every month :"+sbiBankService.emiOfEveryMonth);
        /*System.out.println(sbiBankService.interestPartOfEmi);
        System.out.println(sbiBankService.monthlyPrincipalAmt);*/



    }
}
