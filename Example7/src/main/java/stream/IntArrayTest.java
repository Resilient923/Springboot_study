package stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayTest {
    public static void main(String[] args) {

        int[] arr ={1,2,3,4,5};

        IntStream stream = Arrays.stream(arr);
        int sum = stream.sum();

        System.out.println(sum);

        int count = (int)Arrays.stream(arr).count();//이미 스트림이 쓰였다. 한번만 사용가능하다/.
        System.out.println(count);
    }
}
