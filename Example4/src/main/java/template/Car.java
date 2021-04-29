package template;

public abstract class Car {

    public abstract void drive();
    public abstract void stop();

    public abstract void wiper();

    public void washCar(){

    };
    public void startCar(){
        System.out.println("시동을 겁니다");
    }
    public void turnOff(){
        System.out.println("시동을 끕니다");
    }
    public final void run(){//final 이라고 하게되면 오버라이드 금지
        startCar();
        drive();
        wiper();
        washCar();
        stop();
        turnOff();
    }
}
