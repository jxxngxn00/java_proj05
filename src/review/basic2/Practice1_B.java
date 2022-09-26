package basic2;

import java.util.Scanner;

public class Practice1_B {
    public static void main(String[] args) {
        // [2] 회사 B

        Scanner sc = new Scanner(System.in);

        int count=0;    // 369의 갯수
        int temp=0;     // 임시 변수

        System.out.print("정수를 입력하세요 : ");
        int num = sc.nextInt();

        for(int i=0;i<=num;i++){
            temp = i;                       //temp에 i값 임시 저장
            while(true){
                if (temp%10 ==3 || temp%10 == 6 || temp%10 ==9) {count++; break;} 
                else if (temp>10) {temp /= 10; } 
                else {break;}            
            }
        }

        System.out.println("박수친 횟수 : "+count); //결과 출력
        sc.close();
    }
}
