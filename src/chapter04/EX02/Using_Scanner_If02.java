package chapter04.EX02;

import java.util.Scanner;

public class Using_Scanner_If02 {

	public static void main(String[] args) {
		//점수(score)와 학년(year)을 인풋받아서 60점 이상이면 합격, 미만이면 불합격
		// 4학년인 경우 70 이상이면 합격, 중첩 if문 사용
		
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요 (0~100) >> ");
		int score = sc.nextInt();
		System.out.print("학년을 입력하세요 (1~4) >> ");
		int year = sc.nextInt();
		
		System.out.println("점수 : "+score+" , 학년 : "+year );
		
		if (year>=4) {
			if (score>=70) {
				System.out.println("합격");		
			} else {
				System.out.println("불합격");
			}
		}else {
			if (score>=60) {
				System.out.println("합격");
			} else {
				System.out.println("불합격");
			}
		}
		
		/*
		 * if (score>=60) { 
		 * 		if (year!=4) { System.out.println("합격"); 
		 * 		} else if(score>=70) {
		 * 			System.out.println("합격"); 
		 * 		} else { System.out.println("불합격"); } 
		 * } else { System.out.println("불합격"); }
		 */

		
		sc.close();
	}

}
