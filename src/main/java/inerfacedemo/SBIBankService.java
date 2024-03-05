package inerfacedemo;

public class SBIBankService implements RBIBankService{
    @Override
    public String transfer(String fromAccountNumber, String toAccountNumber, int amt) {
        return "Transfer from SBIBank";
    }
}
