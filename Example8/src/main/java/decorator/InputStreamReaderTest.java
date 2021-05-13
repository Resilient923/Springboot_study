package decorator;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class InputStreamReaderTest {
    public static void main(String[] args) {

        try(InputStreamReader irs = new InputStreamReader(System.in)) {
            int i =0;
            while((i = irs.read()) != -1){
                System.out.println((char) i);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
        Socket socket = new Socket();
        try {
            InputStreamReader ir = new InputStreamReader(socket.getInputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
