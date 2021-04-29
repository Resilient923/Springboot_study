package witharraylist;

import java.util.ArrayList;

public class CustomerTest {
    public static void main(String[] args) {
        ArrayList<Customer> customerList = new ArrayList<Customer>();
        
        
        Customer customerLee = new Customer(10010,"이순신");
        Customer customerShin = new Customer(10011,"신사임당");
        GoldCustomer customerHOng = new GoldCustomer(10012,"홍길동");
        GoldCustomer customerYul = new GoldCustomer(10013,"이율곡");
        VipCustomer customerKim = new VipCustomer(10013,"김유신",1233);

        customerList.add(customerLee);
        customerList.add(customerShin);
        customerList.add(customerHOng);
        customerList.add(customerYul);
        customerList.add(customerKim);

        System.out.println("===============고객정보출력================");
        for(Customer customer : customerList){
            System.out.println(customer.showCustomerInfo());
        }
        System.out.println("-------할인율과 보너스포인트-----------");
        int price =10000;
        for(Customer customer : customerList){
            System.out.println(customer.customerName+customer.calcPrice(price));
            System.out.println(customer.showCustomerInfo());
        }
    }
}
