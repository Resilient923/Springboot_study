package array;

public class TwoDimensionArray {

    public static void main(String[] args) {

//        int[][] arr= new int[2][3];
        int[][] arr= {{1,2,3},{4,5,6}};

        System.out.println(arr.length);
        System.out.println(arr[0].length);

        System.out.println("==================");
        for(int i=0;i<arr.length;i++){
            for(int j = 0;j<arr[i].length;j++){
                System.out.println(arr[i][j]);
            }
        }
        System.out.println("==================");
        char [][] alphabets = new char[2][13];
        char alphabet = 'a';
        for (int i=0;i<2;i++){
            for(int j=0;j<13;j++){
                alphabets[i][j] = alphabet;
                System.out.println(alphabets[i][j]);
                alphabet++;

            }
        }
    }


}
