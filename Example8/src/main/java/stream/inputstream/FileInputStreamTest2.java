package stream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest2 {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("input2.txt")) {
            byte[] bs = new byte[10];
            int i;
            while( (i=fis.read(bs))!=-1 ){
                for (int j =0 ; j<i;j++){ // 버퍼를 통째로 출력했기때문
                    System.out.println((char) bs[j]);
                }
                System.out.println();
            }

        } catch (IOException e) {
            System.out.println(e);
        };
    }
}
