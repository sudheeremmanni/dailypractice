package polymorphism;

public class SBIBankService extends RBIBankService{
    //double percentage = 0.0;
    double principalAmount = 0;
    double processingAmt = 0.0;
    double remainingAmount = 0.0;
    public double calculateInterest(int principalAmt){
        double totalAmt =0;

            double interestAmt = super.calculateInterest(principalAmt);
             totalAmt = interestAmt + principalAmt;

        return  totalAmt;

    }
    public double calculateInterest(int principalAmt, int days){
        double totalAmt = 0;
        if(days >85){
            return this.calculateInterest(principalAmt);
        }
        return totalAmt+principalAmt;
    }
    public double processingFee(double principalAmt,double percentage){


        super.processingFee(principalAmt,percentage);
        principalAmount = principalAmt;
        processingAmt = principalAmount * percentage/100;
        remainingAmount = principalAmount - processingAmt;
        return remainingAmount;
    }
    public double processingFee(double principalAmt){

        double processingFeePercentage =0.0;
        if (principalAmt <=500000) {
            processingFeePercentage= 2.0;

        } else if (principalAmt >500000 && principalAmt <=1000000){
            processingFeePercentage = 1.5;

        }else{
            processingFeePercentage = 1.0;
        }
        return this.processingFee(principalAmt,processingFeePercentage);
    }
    public double emiCalculation(double principalAmt, double rateOfInterest, int loanTenure) {


        rateOfInterest = rateOfInterest/12/100;
        return  super.emiCalculation(principalAmt,rateOfInterest,loanTenure);
    }
}
