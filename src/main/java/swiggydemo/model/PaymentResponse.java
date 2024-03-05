package swiggydemo.model;
import java.util.Date;

public class PaymentResponse {
    private String corelationId;
    private String status;
    private Date responseDate;

    public PaymentResponse(String corelationId, String status, Date responseDate) {
        this.corelationId = corelationId;
        this.status = status;
        this.responseDate = responseDate;
    }

    public String getCorelationId() {
        return corelationId;
    }

    public String getStatus() {
        return status;
    }

    public Date getResponseDate() {
        return responseDate;
    }
}
