package staticex;

public class StudentTest1 {
    public static void main(String[] args) {
        System.out.println(Student.getSerialNum());
        Student student1 = new Student();

        System.out.println(student1.getSerialNum());// 생성자가 로드될때 실행되서 값이매겨진다


        Student student2 = new Student();


        
        System.out.println(student2.getSerialNum());
    }
}
