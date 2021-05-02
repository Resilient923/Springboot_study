package classex;

public class ClassTest {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {

        Person person = new Person();
        Class pClass1 = person.getClass();

        System.out.println(pClass1.getName());
        Class pClass2 = Person.class;
        System.out.println(pClass2.getName());

        Class pClass3 = Class.forName("classex.Person");//동적로딩을 시켜준다.
        System.out.println(pClass3.getName());

        Person p2 = (Person) pClass3.newInstance();//(Person)은 다운캐스팅
        System.out.println(p2);
    }
}
