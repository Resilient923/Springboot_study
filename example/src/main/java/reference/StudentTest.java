package reference;

public class StudentTest {
    public static void main(String[] args) {
        Student studentJames = new Student(100,"James");
        studentJames.setKorea("국어",100);
        studentJames.setMath("수학",100);

        Student studentThomas = new Student(1,"Thomas");
        studentThomas.setKorea("국어",1);
        studentThomas.setMath("수학",1);

        studentJames.showStudentInfo();
        studentThomas.showStudentInfo();
    }
}
