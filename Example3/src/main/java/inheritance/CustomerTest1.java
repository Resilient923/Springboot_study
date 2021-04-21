package inheritance;

public class CustomerTest1 {
    public static void main(String[] args) {
        Customer customerLee = new Customer();
        customerLee.setCustomerID(101);
        customerLee.setCustomerName("LEE");

        VipCustomer customerKim = new VipCustomer();
        customerKim.setCustomerID(101);
        customerKim.setCustomerName("LEE");


        System.out.println(customerKim.showCustomerInfo());
        System.out.println(customerLee.showCustomerInfo());
        customerKim.showCustomerInfo();
        customerLee.showCustomerInfo();
    }
}
