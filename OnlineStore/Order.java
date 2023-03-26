package isp.lab4.exercise1;

import java.time.LocalDateTime;

public class Order {
    private String orderId;

    private LocalDateTime date;

    private double totalPrice;

    private Customer c = new Customer();

    private Product product = new Product();

    public Order() {
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void orderProduct() {
        c.setWallet(500);
        if (totalPrice <= c.getWallet()) {
            System.out.println("Order complete");
        } else System.out.println("Order rejected");
    }

    public void spendMoney() {
        product.setPrice(20);

        System.out.println("Total price of spend money: " + (totalPrice + product.getPrice()));
    }
}
