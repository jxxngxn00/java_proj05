package basic4;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {

        //객체 생성
        CalculatorExpr cal = new CalculatorExpr();

        //Scanner로 num1, num2에 수 입력받음
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("num1 입력 : ");
            int num1 = sc.nextInt();
            System.out.print("num2 입력 : ");
            int num2 = sc.nextInt();
            cal.setNum1(num1);                  // setter 이용 -> 변수에 수 입력
            cal.setNum2(num2);


            // 결과 출력
            System.out.println("덧셈 : "+cal.getAddition());
            System.out.println("뺄셈 : "+cal.getSubtraction());
            System.out.println("곱셈 : "+cal.getMultiplication());
            System.out.println("나눗셈 : "+cal.getDivision());

            // 계속 진행할지 물어본 후 진행 판단
            System.out.print("계속 진행하시겠습니까? (Y/N) : ");
            String answer = sc.next();
            if (answer.equalsIgnoreCase("N")) break;
        }
        sc.close();
    }
}
