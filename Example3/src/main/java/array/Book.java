package array;

public class Book {
    private String bookeName;

    public String getBookeName() {
        return bookeName;
    }

    public void setBookeName(String bookeName) {
        this.bookeName = bookeName;
    }





    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    private String author;





    public Book(){

    }
    public Book(String bookeName,String author){
        this.bookeName = bookeName;
        this.author = author;
    }
    public void showBookInfo(){
        System.out.println(bookeName + "," + author);
    }


}
