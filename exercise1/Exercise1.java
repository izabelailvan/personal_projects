package isp.lab4.exercise1;

public class Exercise1 {

    public static void main(String[] args) {
        Customer customer = new Customer();
        Address address = new Address();
        Order order = new Order();
        Product product = new Product();

        address.setCity("Los Angeles");
        address.setStreet("North Boulevard");

        customer.setCustomerId("1234");
        customer.setName("Customer nr 1");
        customer.setAddress(address);
        customer.setPhone("0123456789");

        product.setName("lipstick");
        product.setProductId("1111");
        product.setProductCategory(ProductCategory.BEAUTY);

        order.setOrderId("123");
        order.spendMoney();
        order.orderProduct();
        order.setTotalPrice(300);
    }
}
