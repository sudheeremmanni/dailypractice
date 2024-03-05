package bookmyshow;

import bookmyshow.model.PaymentRequest;
import bookmyshow.model.PaymentResponse;
import bookmyshow.model.Ticket;

import java.util.Date;
import java.util.UUID;

public abstract class BookMyShowService {
    private final double price;
    int seats;
    String classType;
    String row;
    double finalPrice;

    double amount;
    BookMyShowPayment bookMyShowPayment;
    public BookMyShowService(int seats, String classType, String row, double price) {

        this.seats = seats;
        this.classType = classType;
        this.row = row;
        this.price = price;
        bookTicket(seats,classType,row,price);
    }

    public Ticket createTicket(int seats, String classType, String row,double price){


        Ticket ticket = new Ticket(seats,classType,row,finalPrice);
        return ticket;

    }
    public Ticket bookTicket(int seats, String classType, String row,double price) {

        if(classType =="Balcony"){
             amount = seats * price;
        }else{
             amount = seats * price;
        }
        try{
        PaymentRequest payment = new PaymentRequest(UUID.randomUUID().toString(),amount,new Date(),"555",false);
        PaymentResponse response = bookMyShowPayment.payment(payment);

        if(response!= null){
           return  createTicket(seats,classType,row,amount);
        }else{

            return null;
        }}catch(InsufficientFunds funds){
            throw new InsufficientFunds(funds.getCode(),funds.getMessage());

        }catch (Exception e){
            throw new RuntimeException(e);
        }
        //return null;


    }
}
