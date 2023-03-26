package isp.lab4.exercise1;

public class Customer {
    private String customerId;
    private String name;
    private String phone;

    private Address address;

    private double wallet;

    public Customer() {
    }

    public Customer(String customerId, String name, String phone, Address address, double wallet) {
        this.customerId = customerId;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.wallet = wallet;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }

    public double getWallet() {
        return wallet;
    }
}
