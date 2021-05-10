package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionTest {
    public static void main(String[] args) throws FileNotFoundException {

        FileInputStream fis =null;

        fis = new FileInputStream("a.txt");
    }
}
