package bookmyshow;

import bookmyshow.model.PaymentRequest;
import bookmyshow.model.PaymentResponse;

public interface BookMyShowPayment {
    PaymentResponse payment(PaymentRequest request);
}
