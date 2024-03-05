package bookmyshow.model;

public class Ticket {
    private int seats;
    private String classType;
    private String row;
   private double price;

    public Ticket(int seats, String classType, String row, double price) {
        this.seats = seats;
        this.classType = classType;
        this.row = row;
        this.price = price;
    }

    public int getSeats() {
        return seats;
    }

    public String getClassType() {
        return classType;
    }

    public String getRow() {
        return row;
    }

    public double getPrice() {
        return price;
    }
}
