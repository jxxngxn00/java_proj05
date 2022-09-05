package chapter04.EX02;

import java.util.Scanner;

public class Using_Scanner_if04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 에스프레소, 카페라떼, 아포가토 주문할 경우 가격이 3,500원
		// 아메리카노를 주문할 경우 : 2500원
		// 그 외의 메뉴를 출력할 경우 : 우리 매장에 없는 메뉴입니다.
		
		// 출력 : 주문하신 <에스프레소>는 가격이 <3500>원입니다.
		
		Scanner sc = new Scanner(System.in);
		int cost;
		System.out.println("주문할 메뉴를 입력하세요");
		System.out.println("===========================");
		System.out.println("에스프레소 카페라떼 아포가토 아메리카노");
		System.out.println("===========================");
		String menu = sc.next();
		
		
		
		
		if (menu.equals("에스프레소")||menu.equals("카페라떼")||menu.equals("아포가토")) {
			cost = 3500;
			System.out.println("주문하신 "+menu+"는 가격이 "+cost+"원입니다.");
		} else if(menu.equals("아메리카노")) {
			cost = 2500;
			System.out.println("주문하신 "+menu+"는 가격이 "+cost+"원입니다.");
			
		} else {
			System.out.println("우리 매장에 없는 메뉴입니다.");
		}
		
		
		
		sc.close();
	}

}
