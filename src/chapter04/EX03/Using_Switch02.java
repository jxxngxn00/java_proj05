package chapter04.EX03;

import java.util.Scanner;

public class Using_Switch02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			// 에스프레소, 카페라떼, 아포가토 주문할 경우 가격이 3,500원
			// 아메리카노를 주문할 경우 : 2500원
			// 그 외의 메뉴를 출력할 경우 : 우리 매장에 없는 메뉴입니다.
			
			// 출력 : 주문하신 <에스프레소>는 가격이 <3500>원입니다.
		
		Scanner sc = new Scanner(System.in);
		int cost;
		
		System.out.print("커피를 주문해 주세요 >>> ");
		String order = sc.next();
		
		
		switch(order) {
		case "에스프레소": case "카페라떼": case "아포가토":
			cost = 3500;
			System.out.printf("주문하신 %s는 가격이 %d원입니다. \n",order, cost);
			break;
		case "아메리카노":
			cost = 2500;
			System.out.printf("주문하신 %s는 가격이 %d원입니다. \n",order, cost);
			break;
		default: System.out.println("우리 매장에 없는 메뉴입니다.");
		
		
		}
		
		
		sc.close();
		
	}
	
	

}
