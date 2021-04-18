package staticex;

public class Student {

    public static int getSerialNum() {
        int i = 10;//지연변수
        i++;
        System.out.println(i);

        studentName = "fasdf";//인스턴스변수 ,멤버변수
        
        return serialNum;//static 변수, 클래스 변수
    }

    private static int serialNum = 10000;
    int studentID;
    String studentName;


    public Student(){//Constructor 생성자
        serialNum++;
        studentID = serialNum;
    }

}
