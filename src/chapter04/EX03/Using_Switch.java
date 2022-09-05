package chapter04.EX03;

public class Using_Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 2;
		switch(a) {
		case 1:
			System.out.println("case1 을 출력 : "+a); break;
		case 2:
			System.out.println("case2 을 출력 : "+a); break;
		case 3:
			System.out.println("case3 을 출력 : "+a); break;
		case 4:
			System.out.println("case4 을 출력 : "+a); break;
		default:
			System.out.println("default 을 출력 : "+a);
		}
		
		// 7점 이상인 경우 pass, 그렇지 않은 경우 fail
		System.out.println("==========");
		int b=8;
		switch(b) {
		case 10 :
			System.out.println("pass"); break;
		case 9 :
			System.out.println("pass"); break;
		case 8 :
			System.out.println("pass"); break;
		case 7 :
			System.out.println("pass"); break;
		default :
			System.out.println("fail"); 
		}
		System.out.println("===축약표현===");
		//축약표현
		b = 8;                               
		switch(b) {
		case 10: case 9: case 8: case 7: 
			System.out.println("pass"); break;
		default:
			System.out.println("fail");
			
		}
		
		System.out.println("==========");
		
		// switch 문 <======> if ~ else if 문과 상호 변환됨
		
		int c = 8;
		switch (c) {
		case 10: case 9: 
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7: 
			System.out.println("C");
			break;
		default:
			System.out.println("D");
			
		}
		
		// 위 구문을 if ~ else if 문으로 변환, break 없이도 자동으로 구문을 빠져나옴
		c=7;
		if (c>=9) {
			System.out.println("A");
		}
		else if(c==8) {
			System.out.println("B");
		}
		else if(c==7) {
			System.out.println("C");		//실행 후 if문을 빠져나온다 (break 사용없이 )
		}
		else { System.out.println("D");}
	}

}
