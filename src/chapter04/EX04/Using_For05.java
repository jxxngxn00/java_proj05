package chapter04.EX04;

import java.util.Scanner;

public class Using_For05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 이중 for문을 사용해서 1단부터 9단까지 출력,
		/*
		 	1*1=1	1*2=2	1*3=3..... 1*9=9
		 	2*1=2 ..................... 2*9=18
		 
		 */
		System.out.println("===========");
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				System.out.printf("%d * %d = %d\t",
						i+1,j+1,(i+1)*(j+1));
			}
			System.out.println();
		}
		System.out.println("==========");
		
		
		// 1단 ~ 19단까지 3의 배수단만 출력
		for(int i=3;i<20;i+=3) {
			
			 for(int j=1;j<20;j++) 
			 { System.out.printf("%d * %d = %d\t",i,j,i*j); 
			 
			 }
			System.out.println();
		}
		System.out.println();
		
		
		//스캐너에서 입력받은 단만 출력 (1~9단)
		Scanner sc = new Scanner(System.in);
		System.out.print("출력할 단을 입력하세요 (1~9단)>>> ");
		int aa = sc.nextInt();
		
		for (int i=1;i<10;i++) {
			System.out.printf("%d * %d = %d \n",aa,i,(aa*i));
		}
		sc.close();
	}

}