package thisex;
class Birthday{
    int day;
    int month;

    public void setYear(int year) {
        this.year = year; //this는 멤버변수와 지역변수가 같으면 자기자신의 메모리를 알려주기위해사용
    }
    int year;

    public void printThis(){
        System.out.println(this);
    }
}


public class ThisExample {
    public static void main(String[] args) {
        Birthday b1 = new Birthday();
        Birthday b2 = new Birthday();

        System.out.println(b1);
        b1.printThis();
    }
}
