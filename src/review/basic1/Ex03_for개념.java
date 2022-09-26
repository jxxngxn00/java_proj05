package basic1;
public class Ex03_for개념 {
/*
 * 반복문 : for / while / do~while
 * 
 * (1) for (초기치 ; 조건문 ; 증가치 ) {
 *          반복구문
 *      }
 */

    public static void main(String[] args){
        // for(int i=1;i<=10;i++) {
        //     System.out.println(i);
        // }

        for(int i=1 ; i<=5 ; i++){
            System.out.print(i+" ");
        }
        System.out.println();
        // for(char a='A' ; a<='Z' ; a+=2){
        //     System.out.print(a+" ");
        // }
        // System.out.println();
        // for(char a='Z' ; a>='A' ; a--){
        //     System.out.print(a+" ");
        // }
        // System.out.println();
        
        // [2] 1부터 10까지의 합 출력
        int sum = 0;
        for(int i=1;i<=10;i++){
            sum += i;
        }
        System.out.println("1부터 10까지의 합 : "+sum);
        
        // [3] 1부터 10까지의 홀수의 합 출력
        sum = 0;
        for(int i=1;i<=10;i+=2){
            sum += i;
        }
        System.out.println("1부터 10까지 홀수의합 : "+sum);
 
    }
}
