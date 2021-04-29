package witharraylist;

public class VipCustomer extends Customer {

    private double saleRatio;
    private int agentID;

    /*public VipCustomer(){
        super();
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
    }*/


    public VipCustomer(int customerID, String customerName, int agentID){

        super(customerID,customerName);//this는 자기자신을 가리키는 키워드고 생성자호출,super는 상위클래스를 가리키는 참조자
        //super는 default 생성자를 가리킨다.
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
        this.agentID = agentID;
        //setBonusPoint(1000);

    }
    public int calcPrice(int price){
        bonusPoint += price * bonusRatio;
        return price - (int)(price * saleRatio);
    }

    public int getAgentID(){

        return agentID;
    }

}
