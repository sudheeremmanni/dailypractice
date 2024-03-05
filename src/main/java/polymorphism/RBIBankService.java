package polymorphism;

public class RBIBankService {
    //double percentage = 0.0;
    double emiOfEveryMonth = 0.0;
    double interestPartOfEmi = 0.0;
    double monthlyPrincipalAmt = 0.0;
    public double calculateInterest(int principalAmt){
        int duration = 3 ;
        double interest = principalAmt*0.024 *0.25; //Qtr interest
        return interest;

    }

    public double processingFee(double principalAmt,double percentage){

        double processingAmt = principalAmt * percentage/100;
        //System.out.println(processingAmt);
        return processingAmt;
    }
    public double emiCalculation(double principalAmt, double rateOfInterest, int loanTenure){

        //double x = principalAmt * rateOfInterest * (1 +rateOfInterest)*loanTenure;
        //double y = ((1+rateOfInterest)*loanTenure-1);
        //double emiOfEveryMonth = x/y;


        emiOfEveryMonth = principalAmt * rateOfInterest * Math.pow(1 +rateOfInterest,loanTenure) /(Math.pow(1+rateOfInterest,loanTenure)-1);
        System.out.println("Emi for Every Month : " +emiOfEveryMonth);
        System.out.println("Personal Loan Tenure :"+loanTenure  );
        System.out.println(" ");
        for (int i = 1; i<=loanTenure; i++) {

            interestPartOfEmi = principalAmt * rateOfInterest;
            monthlyPrincipalAmt = emiOfEveryMonth - interestPartOfEmi;
            principalAmt = principalAmt -monthlyPrincipalAmt;
            System.out.println(" Interest and principal details for month " +i);
            System.out.println("Interest Amount : "+interestPartOfEmi);
            System.out.println("Monthly PrincipalAmount : "+monthlyPrincipalAmt);
            System.out.println("Total Principal Amount to be Paid "+principalAmt);
            System.out.println(" ");
        }
       // System.out.println(interestPartOfEmi);
        //System.out.println(monthlyPrincipalAmt);
        return emiOfEveryMonth;


    }
}
