package inheritance;

public class VipCustomer extends Customer{

    private double saleRatio;
    private int agentID;


    public VipCustomer(){

        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;

    }

    public int getAgentID(){
        return agentID;
    }

}
