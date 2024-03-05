package swiggydemo.model;

public class OrderItem {
    Product product;
    private int qty;
    private int price;

    public OrderItem(Product product, int qty, int price) {
        this.product = product;
        this.qty = qty;
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }

    public int getQty() {
        return qty;
    }

    public int getPrice() {
        return price = qty * product.getPrice();
    }
}
