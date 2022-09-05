package chapter04.EX06;

import java.util.Scanner;

public class Using_do_while03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Boolean run = true;
		int nu = 0;
		do {
			System.out.println("====================================================");
			System.out.println("1. 19단 출력 | 2. 홀수단 출력 | 3. 3의 배수단 출력 | 4. 종료");
			System.out.println("====================================================");
			System.out.print("원하는 숫자를 선택하세요 >> ");
			
			nu = sc.nextInt();
			if(nu==1) {
				//1. 19단 출력
				System.out.println("==1. 19단 출력 ==");
				for(int i=1;i<20;i++) {
					for(int j=1;j<20;j++) {
						System.out.printf("%d * %d = %d\t",i,j,i*j);
					}
					System.out.println();
				}
				
				
			}else if(nu==2) {
				//2. 홀수단 출력
				System.out.println("==2. 홀수단 출력 ==");
				for(int i=1;i<20;i+=2) {
					for(int j=1;j<20;j++) {
						System.out.printf("%d * %d = %d\t",i,j,i*j);
					}
					System.out.println();
				}
				
				
				
			}else if(nu==3) {
				//3. 3의 배수단 출력
				System.out.println("==3. 3의 배수단 출력 ==");
				for(int i=3;i<20;i+=3) {
					for(int j=1;j<20;j++) {
						System.out.printf("%d * %d = %d\t",i,j,i*j);
					}
					System.out.println();
				}
				
				
			}else if(nu==4) {
				//4. 종료
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
		}while(run);
		
		sc.close();
	}

}
