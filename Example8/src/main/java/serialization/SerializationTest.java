package serialization;

import java.io.*;
import java.net.Socket;

class Person implements Serializable{//serialization을 허용해주겠다.


    String name;
    transient String title;

    public Person(){};
    public Person(String name,String title) {
        this.name = name;
        this.title = title;

    }
    public String toString(){
        return name+title;
    }
}

public class SerializationTest { //직렬화
    public static void main(String[] args) {
        Person personLee = new Person("lee","manager");
        try(FileOutputStream fos = new FileOutputStream("serial.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos)){

            oos.writeObject(personLee);
        }catch (IOException e) {
            System.out.println(e);
        }
        try(FileInputStream fis = new FileInputStream("serial.dat");
            ObjectInputStream ois = new ObjectInputStream(fis)){

            Object obj = ois.readObject();
            if(obj instanceof Person){
                Person p = (Person) obj;
                System.out.println(p);
            }
        }catch (IOException e) {
            System.out.println(e);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
