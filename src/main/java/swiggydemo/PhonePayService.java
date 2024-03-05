package swiggydemo;

import swiggydemo.SBIBankService;
import swiggydemo.SwiggyPaymentService;
import swiggydemo.model.PaymentRequest;
import swiggydemo.model.PaymentResponse;

import java.util.UUID;

public class PhonePayService implements SwiggyPaymentService {

    @Override
    public PaymentResponse payment(PaymentRequest request) {


        SBIBankService sbiBankService = new SBIBankService();
        return sbiBankService.transfer(request);

    }
}
