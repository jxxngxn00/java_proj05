package basic5;

public class Book {
    
    private static int count;

    public Book(){
        count++;
    }

    public static int getCount(){
        return count;
    }
}
/*
 * static
 * 
 *  - 객체의 공유
 *  - 객체생성보다 먼저 실행하기 때문에 클래스명 접근
 */