package basic3;

public class Ex02_멤버변수 {

    static int a =10, b=20;
    static int sum=0;

    public static void main(String[] args) {
        add();
        System.out.println(sum);
    }
    static void add(){
        sum = a+b;
    }
}
