package abstractdemo;

public abstract class RBIBankService {

    int year;
    double rateOfInterest;

    RBIBankService(int year, double rateOfInterest) {
        this.year = year;
        this.rateOfInterest = rateOfInterest;
    }

    //abstract class can have concrete methods & abstract methods
    public String sayHi(){
        return "Hi";
    }
    protected abstract String helloWorld(); //abstract method
    protected abstract double calculateInterest(int principalAmt);
}
