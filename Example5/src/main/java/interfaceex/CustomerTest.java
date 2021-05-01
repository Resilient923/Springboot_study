package interfaceex;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer();

        Buy buyCustomer = customer;
        buyCustomer.buy();

        Sell seller = customer;
        seller.sell();

        customer.order();//고객판매주문
        buyCustomer.order();//똑같다
        seller.order();//똑같다
    }
}
