package chapter04.EX05;

public class Using_while01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// while (조건) {
		// 실행문; }
		
		// while 반복 횟수를 알 수 없는 경우 사용
		// for 반복 횟수를 알 수 있는 경우.
		
		// -- 초기값 선언을 반드시 While 밖에서 선언을 해야한다.
		//		<while문 내에서 선언시 무한루프;
		
		
		// -- 증가값은 while 내에서 선언을 함<증가값을 선언하지 않으면 무한 루프
		
		
		//1. while 문에서 반복횟수가 0인 경우
		System.out.println("===반복횟수 0 ===");
		int a= 0;							// 1. while 문에서 반복횟수가 0인 질문
		while(a<0) {						//변수의 초기값은 While 밖에서 선언
			System.out.print(a + " "); 	//false
		}									//조건이 True 일때만 실행

		//3. while문에서 반복 횟수가 1번인 경우
		System.out.println("===반복횟수 1 ===");
		a=0;
		while(a==0) {
			System.out.print(a+" ");
			a++;
			break;
		}
		System.out.println();				
		System.out.println("===반복횟수 10 ===");
		
		
		a=0;								//초기값 : while 밖에서ㅃ 선언
		while(a<10) {
			System.out.print(a+" ");
			a++;							//증가값은 while 문제내에서 처리죠
		}
		
		System.out.println();
		System.out.println("===초기값을 while문 내에 넣는 경우 : <무한루프>===");
		
		while (a<10) {						//초기화 값을 while문 내에서 선언하면
			a=0;
			System.out.print(a+" ");		//증가값은 while문 내에서 처리                
			a++;
		}
		
		// while문은 조건을 생략할 수 없다.
		// for문은 조건을 생략시 무한 루프.
		// while문에서 무한 루프를 들릴때 True
		
		a=0;
		boolean b = true;
		
		while(b) {
			System.out.print(a+" ");
			a++;
			if(a>200) {
				break;
			}
		}
	}

}
