package swiggydemo;

import swiggydemo.model.Order;
import swiggydemo.model.PaymentRequest;
import swiggydemo.model.PaymentResponse;

import java.util.Date;
import java.util.UUID;

public abstract class SwiggyOrderProcess {
    SwiggyPaymentService swiggyPaymentService;
    public SwiggyOrderProcess(SwiggyPaymentService swiggyPaymentService){
        this.swiggyPaymentService = swiggyPaymentService;

    }

    public Order getFinalOrder(Order order){
        double tax = 0;
        if (order.getPrice() > 1000){
             tax = order.getPrice()*20/100;
        }
        double finalAmt = order.getPrice()*tax+20;
         Order finalOrder = new Order(finalAmt,tax, 20);
         finalOrder.setOrderItemList((order.getOrderItemList()));//Shallow cloning

       /* for (int i= 0;i<order.getOrderItemList().size();i++){
            finalOrder.addItem(order.getOrderItemList().get(i)); Deep Cloning ((order.getOrderItemList() -> will be shallow finalOrder.addItem - deep
        }*/
         return finalOrder;

    }
    public Order createOrder(Order order){
        Order finalOrder = getFinalOrder(order);
        PaymentRequest paymetInitationRequest = new PaymentRequest("Swiggy"+ UUID.randomUUID().toString(),finalOrder.getPrice(),new Date(),"5555",false);
       PaymentResponse response =  swiggyPaymentService.payment(paymetInitationRequest);
       if(response!=null){
           finalOrder.setStatus("Success");
           System.out.println((response.getCorelationId()));

       }
       delivery(finalOrder);
       return finalOrder;

    }
    public abstract  boolean delivery(Order request);

}
