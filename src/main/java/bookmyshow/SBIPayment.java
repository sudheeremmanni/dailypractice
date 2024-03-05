package bookmyshow;

import bookmyshow.BookMyShowPayment;
import bookmyshow.model.PaymentRequest;
import bookmyshow.model.PaymentResponse;

import java.util.Date;
import java.util.UUID;

public class SBIPayment implements BookMyShowPayment {
    private String accountNumber = "1234";
    private double amt  = 5000;

    private String merchantAccount = "4567";
    private double merchantAmt = 10000;

    @Override
    public PaymentResponse payment(PaymentRequest request) {
        System.out.println(request.getTxId());
        if(request.isMerchantDebit()){
            merchantAmt = merchantAmt - request.getAmt();
            amt = amt + request.getAmt();
        }else{
            amt = amt - request.getAmt();
            merchantAmt = merchantAmt + request.getAmt();
        }
        PaymentResponse response = new PaymentResponse(UUID.randomUUID().toString(),"Success",new Date());
        return response;
    }
}
