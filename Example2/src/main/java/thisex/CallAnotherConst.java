package thisex;

class Person{
    String name;
    int age;

    public Person(){
        //this를 쓸때는 앞에 어떠한 코드문장이 올 수 없다.
        //this 는 생성자에서 다른 생성자를 호출한다.
        this("이름없음",1);
    }
    public Person(String name, int age){
        this.name = name;
        this.age = age;
        
    }
    public Person returnSelf(){//반환형을 자기자신클래스랑 같게 한다.

        return this;
    }
}



public class CallAnotherConst {
    public static void main(String[] args) {
        Person p1 = new Person("tls",100); //이렇게 호출하면 default생성자
        System.out.println(p1.name);
       // System.out.println(p1);
        System.out.println(p1.returnSelf());
    }
}
