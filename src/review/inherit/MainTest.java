package inherit;

public class MainTest {
    public static void main(String[] args) {
        // Mother m = new Mother();
        // m.job();
        // m.gene();
        

        // Ddal d = new Ddal();
        // d.job();
        // d.gene();
        // d.study();

        // Ddal d= new Mother();

        // 부모 변수에 자식객체 생성이 가능 **
        // Mother m = new Ddal();

        // * 형 변환 : casting
        // 1> 기본형끼리
        // 2> 참조형에서 상속관계에 있는 경우만 가능

        // String s = new String("~~");
        // StringBuffer sb = (StringBuffer)s;   --> X

        // Mother m = new Mother();
        // Ddal d = (Ddal) m;

        Ddal d = new Ddal();    // upcasting
        Mother m = (Mother) d;  // downcasting
    }
}
