package chapter04.EX06;

import java.util.Scanner;

public class Using_do_while02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int nu=0;			//스캐너로 인풋받는 변수
		
		do {
			System.out.println("===================================");
			System.out.println("1. 문자열 출력 | 2. 정수 출력 | 3. 종료");
			System.out.println("===================================");
			System.out.print("원하는 번호를 입력하세요 >>> ");
			nu = sc.nextInt();
			
			if (nu==1) {
				System.out.println("문자열을 출력합니다.");
				System.out.println();
			}else if(nu==2) {
				System.out.println("정수를 출력합니다.");
				System.out.println();
			}else if(nu==3){
				break;		//프로그램을 종료
			}
			
		}while (run);		//무한 루프가 작동됨
		System.out.println("프로그램을 종료합니다. ");
		
		
		sc.close();
	}

}
