package inheritance;

class Animal{
    public void move(){
        System.out.println("동물이움직입니다");
    }
}

class Human extends Animal{
    public void move(){
        System.out.println("사람이움직입니다");
    }
}

class Tiger extends Animal{
    public void move(){
        System.out.println("호랑이가뜁니다");
    }
}


class Eagle extends Animal{
    public void move(){
        System.out.println("독수리가 납니다");
    }
}
public class AnimalTest {
    public static void main(String[] args) {

        AnimalTest test = new AnimalTest();
        test.moveAnimal(new Human());
        test.moveAnimal(new Tiger());
        test.moveAnimal(new Eagle());

        Animal animal = new Human();
    }
    public void moveAnimal(Animal animal){//매개변수의 자료형이 상위 클래스이다.
        animal.move();//재정의된 메서드가 호출됨
    }
}
