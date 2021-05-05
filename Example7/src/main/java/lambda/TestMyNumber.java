package lambda;

public class TestMyNumber {
    public static void main(String[] args) {
        MyNumber maxNum = (x,y) -> (x>=y)?x:y;
        int max = maxNum.getMaxNubmer(10,20);
        System.out.println(max);

        int i =100; //final이다.
        MyNumber aaa = new MyNumber() {//익명내부클래스

            @Override
            public int getMaxNubmer(int num1, int num2) {
                //i = 200; 값을 변환 시킬 수는 없다.
                return 0;
            }
        };
        //람다식에서 외부메서드의 지역변수는 상수로 처리된다.
    }
}
