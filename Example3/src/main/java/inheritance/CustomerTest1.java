package inheritance;

public class CustomerTest1 {
    public static void main(String[] args) {
        Customer customerLee = new Customer(101,"Lee");
        customerLee.setCustomerID(101);
        customerLee.setCustomerName("LEE");

        VipCustomer customerKim = new VipCustomer(10101,"Kim",100);
        //상속된 클래스는 상위클래스로 형변환이된다.
        customerKim.setCustomerID(101);
        customerKim.setCustomerName("Kim");

        //customerKim.
        System.out.println(customerKim.showCustomerInfo());
        System.out.println(customerLee.showCustomerInfo());
        customerKim.showCustomerInfo();
        customerLee.showCustomerInfo();
    }
}
