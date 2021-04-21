package inheritance;

public class Customer {
    protected int customerID;

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    protected String customerName;
    protected String customerGrade;
    int bounsPoint;
    double bonusRatio;



    public Customer(){

        customerGrade = "SILVER";
        bonusRatio = 0.01;

    }
    public Customer(int customerID,String customerName){
        this.customerID = customerID;
        this.customerName = customerName;
        customerGrade = "SILVER";
        bonusRatio = 0.01;

    }
    public int calcPrice(int price){


        bounsPoint += price * bonusRatio;
        return price;
    }
    public String showCustomerInfo(){
        return customerName +"님의 등급은"+customerGrade+"이고, 보너스포인트는"+bounsPoint+"입니다.";
    }
    public int getCustomerID(){
        return customerID;

    }
    public void setCustomerID(int customerID){
        this.customerID = customerID;
    }
}
