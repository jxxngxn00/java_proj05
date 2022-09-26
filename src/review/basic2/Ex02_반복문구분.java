package basic2;

import java.util.Scanner;

/*
 * for      : 반복 횟수가 정해진 경우
 * while    :
 * do~while :
 */
public class Ex02_반복문구분 {
    
    public static void main(String[] args) {
        // 구구단의 단수를 입력받아서 해당 단의 구구단을 출력
        Scanner sc = new Scanner(System.in);

        //System.out.print("구구단의 단수 입력 > ");
        //int num = sc.nextInt();

        //1. for 문 : 몇번 반복할지 정해져 있을 때
        //System.out.print("몇 번 반복을 할까요? > ");
        //int su = sc.nextInt();

        //for (int i=1;i<=su;i++){
        //    System.out.println(num + " * "+i+" = "+num*i);
        //}

        //2. while
        
        
        // while (true){
        //     System.out.print("구구단의 단수 입력 > ");
        //     int num = sc.nextInt();
        //     for(int i = 1;i<=9;i++){
        //         System.out.printf("%d * %d = %d \n",num,i,num*i);
        //     }

        //     System.out.print("반복을 종료 (Y) : ");
        //     String answer = sc.nextLine();
        //     if(answer.equalsIgnoreCase("Y")) break;
            
        // }

        //3. do~while
        do {
            System.out.print("구구단의 단수 입력 > ");
            int num = sc.nextInt();
            for(int i = 1;i<=9;i++){
                System.out.printf("%d * %d = %d \n",num,i,num*i);
            }

            System.out.print("계속 하시겠습니까? (Y) : ");
            String answer = sc.nextLine();
            if(answer.equalsIgnoreCase("Y")) continue;
        } while (false);

        sc.close();
    }
}
