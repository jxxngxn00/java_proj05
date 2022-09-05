package chapter04.EX02;

import java.util.Scanner;

public class Using_Scammer_if03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// if문에서 String 문자열 비교
		// 	-- 기본 자료형에서 변수의 값이 같다 : ==
		//	-- 참조 자료형에서 객체의 값이 같다 : 변수명.equals("값")
		//		String 변수의 값을 비교할때 : equals() 메소드를 사용해야함
		
		Scanner sc = new Scanner(System.in);
		System.out.println("주문할 커피 메뉴를 고르세요 >>> ");
		String order = sc.next();
		
		if (order.equals("아메리카노")) {
			System.out.println("당신이 주문한 커피는 : "+order+" 입니다.");
		} else if(order.equals("카푸치노")) {
			System.out.println("당신이 주문한 커피는 : "+order+" 입니다.");
		} else if(order.equals("카페라떼") || order.equals("카페라때")) {
			System.out.println("당신이 주문한 커피는 : "+order+" 입니다.");
		} else if(order.equals("아포가토")) {
			System.out.println("당신이 주문한 커피는 : "+order+" 입니다.");
		} else {
			System.out.println("우리 매장에는 없는 메뉴입니다.");
		}
		
		
		sc.close();
	}

}
