package chapter5;

public class Student { // 클래스 속성은 프로퍼티
    int studentID;
    String studentName;
    int grade;
    String address;

    //클래스에 생성자가 하나도 없으면 자바 컴파일러가 생성자를 자체적으로 만들어 둔다.
     public Student(int id, String name){
        studentID = id;
        studentName = name;
     } //-> default 생성자 : 매개변수, 구현코드가 없다

    //위에 방식을 메소드 오버로딩 생성자 오버로딩이라 한다.
    //생성자는 class이름과 동일


    public void showStudentInfo(){

        System.out.println(studentName + "," + address);
    }
    public String getStudentName(){
        return studentName;
    }
    public void setStudentName(String name){ // void 반환값
        studentName = name;
    }



}
