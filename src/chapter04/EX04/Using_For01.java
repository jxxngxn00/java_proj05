package chapter04.EX04;

public class Using_For01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 for ( 초기값 ; 조건 ; 증가값 ) {
		 	실행문1; 					<= 조건이 참(true)일동안 계속 반복
		 							<= 거짓이면 for을 빠져나옴
		 }
		*/
		
		//기본 for 문
		int a;
		for (a=0 ; a<3 ; a++) {	//(초기값; 조건; 증가값)
			System.out.println(a);
		}	// 0 1 2 
		
		System.out.println("==========");
		//초기갓과 증가값에는 ,로 구분해서 여러개의 변수가 올 수 있다.
		
		int b, c, d;
		for(b=0, c=10, d=20; b<5; b++, c+=2, d+=5) {		// 5번반복(0,1,2,3,4)
			// b:1씩 증가, c:2씩 증가, d:5씩 증가
			System.out.println("b : "+b+", c : " + c+", d : "+d);}
		
		System.out.println("===============");
		
		// for문에서 무한루프 (조건이나 증가값을 잘못 처리할 경우)
		/*
		 * int e; for ( e=0; e<10 ; e-= 3) {
		 *  System.out.println(e); //조건이 True일동안 반복
		 *   }
		 * System.out.println("===============");
		 */

		// 1부터 10까지 for문 없이 덧셈
		int sum1;
		sum1 = 0;
		sum1 += 1; 
		sum1 += 2; 
		sum1 += 3; 
		sum1 += 4; 
		sum1 += 5;
		sum1 += 6; 
		sum1 += 7; 
		sum1 += 8; 
		sum1 += 9; 
		sum1 += 10;
		
		System.out.println("1~10까지의 합 : "+sum1);
		
		
		//for문을 사용해서 1부터 10까지의 합계 구하기
		int sum2=0;
		for(int i=0;i<10;i++) {
			int j = i+1;
			sum2 += j;
			System.out.println("sum2 : "+sum2+", i : "+j );
		}
		System.out.println("1~10까지의 합 : "+sum2);
		
		//for 문을 사용해서 0~1000 까지 7의 배수의 합계
		// 7의 배수의 합계 : 000
		
		int sum3=0;
		for (int i=0;i<1000;i+=7) {
			sum3 += i;
		}
		System.out.printf("7의 배수의 합계 : %3d \n", sum3);
		System.out.println("===============");
		
		//for과 if문을 사용해서 1~10까지 더한 값 출력하되
		//아래와 같이 출력하세요.
		//결과: 1+2+3+4+5+6+7+8+9+10 = 55
		
		int sum4 = 0;
		System.out.print("결과 : ");
		for (int k=1;k<11;k++) {
			sum4 += k;
			
			if(k==10) {
				System.out.print(k+" = ");}
			else {
				System.out.print(k + "+");
			}
			
		}
		System.out.println(sum4);

		System.out.println("===============");
	}
	

}
