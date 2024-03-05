package inerfacedemo;

public class InterfaceDemoTest {
    public static void main(String[] args){
        RBIBankService hdfcBankService = new SBIBankService();
        RBIBankService sbiBankService = new SBIBankService();
        String hdfcStatus = hdfcBankService.transfer("1234","3333",10);
        String sbiStatus = sbiBankService.transfer("222","333",100);
        System.out.println(hdfcBankService);
        System.out.println(sbiBankService);
    }
}
