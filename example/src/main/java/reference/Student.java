package reference;

public class Student {
    int studentID;
    String studentName;

    Subject korea;
    Subject math;

    public Student(){
        korea = new Subject(); //인스턴스 생성
        math = new Subject();
    }


    public Student(int id, String name){
        studentID = id;
        studentName = name;//String 은 new하지 않아도 된다. JDK에서 제공되는 것들중

        korea = new Subject(); //인스턴스 생성
        math = new Subject();
    }

    public void setKorea(String name, int score){
        korea.setSubjectName(name);
        korea.setScore(score);

        korea.subjectName = name;
    }
    public void setMath(String name, int score){
        math.setSubjectName(name);
        math.setScore(score);

        math.subjectName = name;
    }
    public void showStudentInfo(){
        int total = (korea.getScore() + math.getScore());

        System.out.println(studentName + "학생의 총점은"+total);
    }

    public static void main(String[] args) {

    }

}
