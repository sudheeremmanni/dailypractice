package inerfacedemo;

public interface RBIBankService {
    //default access modifier is public + abstract for interface
    //int i = 20;
     String transfer(String fromAccountNumber, String toAccountNumber,int amt);

     //void withdraw();


}
