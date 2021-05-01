package interfaceex;

public class MyClass implements MyInterFace{
    @Override
    public void myMethod() {
        System.out.println("myMethod");
    }

    @Override
    public void x() {
        System.out.println('X');
    }

    @Override
    public void y() {
        System.out.println("Y");
    }

    public static void main(String[] args) {
        MyClass myClass = new MyClass();

        X xClass = myClass;
        myClass.x();
        myClass.y();
        myClass.myMethod();
        xClass.x();
    }
}
