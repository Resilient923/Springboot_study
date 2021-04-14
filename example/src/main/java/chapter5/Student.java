package chapter5;

public class Student { // 클래스 속성은 프로퍼티
    int studentID;
    String studentName;
    int grade;
    String address;

    public void showStudnetInfo(){

        System.out.println(studentName + "," + address);
    }
    public String getStudentName(){
        return studentName;
    }
    public void setStudentName(String name){ // void 반환값
        studentName = name;
    }

}
