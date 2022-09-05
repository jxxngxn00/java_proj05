package chapter04.EX03;

import java.util.Scanner;

public class Using_Switch03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*1문제
		  	스캐너로 "Gold"를 넣으면 "금메달 입니다"를 출력
		  	스캐너로 "Silver"를 넣으면 "은메달 입니다"를 출력
		  	스캐너로 "Bronze"를 넣으면 "동메달 입니다"를 출력
		  	그외는 "메달이 없습니다."
		 */
		
		Scanner sc = new Scanner(System.in);
		
		//1
		System.out.print("메달을 입력하시오 ( Gold / Silver / Bronze ) >>> ");
		String medal = sc.next();
		
		switch(medal) {
		case "Gold" : case "gold" :
			System.out.println("금메달 입니다."); 
			break;
		case "Silver" : case "silver":
			System.out.println("은메달 입니다."); 
			break;
		case "Bronze" : case "bronze" :
			System.out.println("동메달 입니다.");
			break;
		default :
			System.out.println("메달이 없습니다.");
		}
		sc.close();
	}

}
