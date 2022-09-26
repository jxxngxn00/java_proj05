package basic4;

public class MainTest {
    public static void main(String[] args) {
        
        // 값지정1 -setter
        // Student s = new Student();
        // s.setName("홍길동");
        // s.setKor(100);
        // s.setEng(80);
        // s.setMath(55);

        // 값지정2 - 생성자
        Student s= new Student("홍길동",100,80,55);
        s.calTotal();
        s.calAvg();

        s.output();
    }
}
