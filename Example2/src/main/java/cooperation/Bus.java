package cooperation;

public class Bus {
    int busNumber;
    int passengerCount;
    int money;
    
    public Bus(int busNumber){
        this.busNumber = busNumber;
    }
    
    public void take(int money){//승객 한명을 태우는 메서드
        passengerCount++;
        this.money += money;
    }

    public void showInfo(){
        System.out.println("버스"+ busNumber+"번의 승객은"+
                passengerCount+"명이고, 수입은"+money+
                "입니다.");
    }
}
