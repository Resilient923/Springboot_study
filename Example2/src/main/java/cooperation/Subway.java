package cooperation;

public class Subway {
    int lineNumber;
    int passengerCount;
    int money;

    public Subway(int lineNumber){
        this.lineNumber = lineNumber;
    }

    public void take(int money){//승객 한명을 태우는 메서드
        passengerCount++;
        this.money += money;
    }

    public void showInfo(){
        System.out.println("지하철"+ lineNumber+"번의 승객은"+
                passengerCount+"명이고, 수입은"+money+
                "입니다.");
    }
}
