package chapter5;

public class StudentTest {
    public static void main(String[] args) {


        int i =0; //프리미티브 타입 4byte 정수
        Student studentLee = new Student(10,"이순신"); //생성자 -> 힙메모리에 생성

        studentLee.address = "서울시 마포구";


        Student studentKim = new Student(400,"tlsrbjf"); //생성자 -> 힙메모리에 생성 new에 의해 생성 alloc
        //heap은 가비지 컬렉터에서 없애준다.  heap메모리에 이름,id,주소,grade 메서드등 멤버변수넣어서 생성
        //new를 쓰면 인스턴스 생성
        //new를 써서만든 생성된 인스턴스를 객체라고한다.
        studentKim.studentName = "SSS";
        studentKim.studentID = 50;
        studentKim.address = "서울시 마포구";

        studentLee.showStudentInfo();
        studentKim.showStudentInfo();

        //studentLee : 참조변수
        System.out.println(studentLee);//16진수 주소값출력 (참조값)reference value
        System.out.println(studentKim);//16진수 주소값출력
    }
}
