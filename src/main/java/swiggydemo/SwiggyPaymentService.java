package swiggydemo;

import swiggydemo.model.PaymentRequest;
import swiggydemo.model.PaymentResponse;

public interface SwiggyPaymentService {

    PaymentResponse payment(PaymentRequest request);
}
