package classpart;

public class FunctionTest {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 30;

    int sum = add(num1,num2);
        System.out.println(sum);
    }

    public static int add(int x,int y){
        int result = x+ y;
        return result;

    }
}
