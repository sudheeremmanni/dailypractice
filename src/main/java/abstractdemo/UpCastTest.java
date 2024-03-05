package abstractdemo;

public class UpCastTest {
    public static void main(String[] args){
        RBIBankService sbiService = new YoNoService("1234",100) ;
        //anonymous block
       /* RBIBankService sbiLatestService = new SBIBankService("1234",100) {
            @Override
            protected String helloWorld() {
                return null;
            }
        };*/

        YoNoService yoNoService = new YoNoService("1233",999);
        yoNoService.helloWorld(); //access super class method
        System.out.println(sbiService.calculateInterest(1000));
        System.out.println(yoNoService.accountNumber);
        yoNoService.login();
        yoNoService.sayHi();
        // we can't access subclass methods using super class
        RBIBankService rbiYoNOService = new YoNoService("1234",100);
        //rbiYoNOService.login();
        rbiYoNOService.sayHi(); //we can access super class method


    }
}
