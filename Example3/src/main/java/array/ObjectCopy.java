package array;

public class ObjectCopy {
    public static void main(String[] args) {
        Book[] bookArray1 = new Book[3];

        Book[] bookArray2 = new Book[3];

        bookArray1[0] = new Book("태백산맥1","조정래");
        bookArray1[1] = new Book("태백산맥2","조정래");
        bookArray1[2] = new Book("태백산맥3","조정래");

        bookArray2[0] = new Book();
        bookArray2[1] = new Book();
        bookArray2[2] = new Book();


///        System.arraycopy(bookArray1,0,bookArray2,0,3);

        for(int i = 0; i<bookArray1.length;i++){
            bookArray2[i].setAuthor(bookArray1[i].getAuthor());
            bookArray2[i].setBookeName(bookArray1[i].getBookeName());

        }
        bookArray1[0].setBookeName("나목");
        bookArray1[0].setAuthor("박완서");

        for(int i = 0; i<bookArray2.length;i++){
            bookArray2[i].showBookInfo();
        }
        System.out.println("==================");
        String[] strArr = {"java","anoroid","c"};

        for(String s: strArr){
            System.out.println(s);
        }
        System.out.println("==================");
        int[] intArr = {1,2,3,4,5,6,7};
        for(int s: intArr){//num==arr[i];
            System.out.println(s);
        }
    }
}
