package innerclass;

class Outer{

    int outNum = 100;
    static int sNum = 200;
    
    public Runnable getRunnable(){//Runnable은 쓰레드를 생성하는 인터페이스
        int localNum = 100;
        class MyRunnable implements Runnable{

            @Override
            public void run() {
                System.out.println(outNum);
                System.out.println(sNum);
                System.out.println(localNum);
            }
        }
        return new MyRunnable();
    }
    
    
}
public class LocalInnerTest {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.getRunnable().run();
    }
}
