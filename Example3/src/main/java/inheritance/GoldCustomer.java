package inheritance;

public class GoldCustomer extends Customer{

    public GoldCustomer(){
        bonusRatio = 0.05;

    }
    @Override//상속된 클래스 메서드 재정의 annotation
    public int calcPrice(int price) {
        return super.calcPrice(price);
    }

    @Override
    public String showCustomerInfo() {
        return super.showCustomerInfo();
    }
}
