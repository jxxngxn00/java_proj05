package basic3;

import java.util.Scanner;

public class Practice_Hanoi {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("움직일 원판의 수 : ");
        int n = sc.nextInt();
        int count = Hanoi(n);
        System.out.println("움직인 횟수 : "+count);

        sc.close();
    }

    static int Hanoi(int n){

        if(n==1) return 1;
        return 2*Hanoi(n-1)+1;
    }
}
