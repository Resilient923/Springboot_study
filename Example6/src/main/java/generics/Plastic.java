package generics;

public class Plastic extends Material {


    @Override
    public String toString() {
        return "재료는 플라스틱";
    }

    @Override
    public void doPrinting() {
        System.out.println("플라스틱 프린트");
    }
}
