package chapter04.EX02;

import java.util.Scanner;

public class Using_Scanner_if05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * scanner로 나이를 인풋받아서 출력 :
		 나이(age)가 8세 미만이면  :	"취학 전 아동입니다",
		 						"입장료는 <1000>원입니다."
		 나이(age)가 14세 미만이면  :	"초등학생입니다",
		 						"입장료는 <2000>원입니다."
		 나이(age)가 20세 미만이면  :	"중, 고등학생입니다",
		 						"입장료는 <2500>원입니다."						
		 나이가 20세 이상이면		   :"일반인입니다"
		 						"입장료는 <3000>원입니다."
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이를 입력하세요 >>>> ");
		int age = sc.nextInt();
		int cost;
		
		if (age<8) {
			cost = 1000;
			System.out.println("취학 전 아동입니다.");
		} else if (age<14) {
			cost = 2000;
			System.out.println("초등학생입니다.");
		} else if (age<20) {
			cost = 2500;
			System.out.println("중, 고등학생입니다.");
		} else {
			cost = 3000;
			System.out.println("일반인입니다.");
		}
		System.out.printf("입장료는 %d원입니다. \n",cost);
		sc.close();
	}

}
