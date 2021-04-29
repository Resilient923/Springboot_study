package abstractex;

public abstract class Computer {//추상클래스가된다
    public abstract void display();//구현을 안하고 선언만 한다 (구현부가없음)
    public abstract void typing();

    public void turnOn(){
        System.out.println("전원키기");
    }
    public void turnOff(){
        System.out.println("전원끄기");
    }
}
