package basic_temp;

public class Book {
    private String name;
    private String author;
    private String publisher;

    Book(){
        this(null,null,null);
    }

    Book(String name,String author,String publisher){
        this.name = name;
        this.author = author;
        this.publisher = publisher;
    }

    public void output(){
        System.out.println("책 이름 : "+name);
        System.out.println("저자 : "+author);
        System.out.println("출판사 : "+publisher);
    }

    public static void main(String[] args) {
        Book b = new Book();
        b.output();
    }
}
