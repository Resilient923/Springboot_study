package inheritance;

public class OverridingTest {
    public static void main(String[] args) {
        /*Customer customerLee = new Customer(10010,"LEE");
        customerLee.calcPrice(10000);
        System.out.println(customerLee.showCustomerInfo());

        VipCustomer customerKim = new VipCustomer(10010,"Kim",100);
        customerKim.calcPrice(10000);
        System.out.println(customerKim.showCustomerInfo());*/
        Customer customerWho = new VipCustomer(100010,"WHO",100);
        int price = customerWho.calcPrice(10000);
        System.out.println("지불금액은"+price+"원이고,"+customerWho.showCustomerInfo());
    }
}
