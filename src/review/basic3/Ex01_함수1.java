package basic3;

public class Ex01_함수1 {

    public static void main(String[] args) {
        
        int sum = add();
        //합을 여기서 출력  
        System.out.println("합 : "+sum);  
    }

    static int add(){
        //여기에서 a,b의 값을 합해서 출력
        int a=10; int b=20;
        int sum = a+b;
        return sum;
    }
}
