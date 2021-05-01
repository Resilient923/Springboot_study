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

    default void description(){//default나 static으로 바꿔야 사용가능하다
        System.out.println("정수 계산기를 구현");
    }
    static int total(int[]arr){
        int total=0;
        for(int i : arr){
            total += i;
        }
        return  total;
    }
}

