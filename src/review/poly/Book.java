package poly;

public class Book extends Item{
    
    private String author;
    private String publisher;

    public Book(){
        this("000","제목없음","무명","출판사");
        System.out.println("Book 기본생성자");
    }
    public Book(String num, String name,String author,String publisher) {
        // super.num = num;
        // super.name = name;
        super(num, name);

        this.author = author;
        this.publisher =publisher;
    }
    
    public void output(){
        System.out.println(" 번호 : " + num);
        System.out.println(" 이름 : " + name);
        System.out.println(" 저자 : " + author);
        System.out.println(" 출판사 : "+publisher);
    }
}
