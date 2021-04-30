package interfaceex;

public interface Calc {//인터페이스는 다 public

    /*인터페이스는 모든 메서드가 추상 메서드로 이루어진 클래스를 말한다.*/
    /*public static final*/
    double PI = 3.14;
    int ERROR = -99999999;

    int add(int num1,int num2);
    int substract(int num1,int num2);
    int times(int num1,int num2);
    int divide(int num1,int num2);

}

