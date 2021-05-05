package innerclass;


import java.util.ArrayList;

class OutClass{

    private int num = 10;
    private static int sNum = 20;
    InClass inClass;
    //private ArrayList list;

    public OutClass(){
        inClass = new InClass();

    }
    class InClass{
        int inNum = 200;
        //static int sInNum = 100;//static의 속성에 의해 사용할수없다.
        //static변수랑 스태틱 메서드는 인스턴스의 생성과 상관없이 호출과 사용할 수 있다.클래스에서 선언불가
        void inTest(){
            System.out.println(num);
            System.out.println(sNum);
        }

    }
    public void usingInTest(){
        inClass.inTest();
    }
    static class InStaticClass{
        int iNum = 100;
        static int sInNum = 200;
        void inTest(){
            sNum += 10;
            System.out.println(sNum);
            System.out.println(sInNum);
            System.out.println(iNum);
        }
        static void sTest(){
            System.out.println(sNum);
            System.out.println(sInNum);
          //  System.out.println(iNum);//자기클래스중 인스턴수변수, 정적클래스면서 정적변수

        }
    }

}
public class InnerTest {
    public static void main(String[] args) {
        OutClass outClass = new OutClass(); //안에서 inClass 생성
        outClass.inClass.inTest();

        OutClass.InClass inClass = outClass.new InClass();
        inClass.inTest();
        outClass.usingInTest();
        OutClass.InStaticClass.sTest();
    }
}
