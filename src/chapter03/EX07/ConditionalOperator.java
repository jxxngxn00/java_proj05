package chapter03.EX07;

public class ConditionalOperator {

	public static void main(String[] args) {
		// 3항 연산자 <== 자주사용
		// (조건) ? 참 : 거짓
		// 조건이 참이면 '참'을 실행, 조건이 거짓이면 '거짓'을 실행
		//		: 깃발
		int v1 = (3<5)? 6:9;			//조건이 false이므로 변수에 9가 할당.
		System.out.println(v1);
		
		int v2 = ( 5> 3)? 10 : 20;		//조건이 true이므로 변수에 10이 할당.
		System.out.println(v2);
		
		int v3 = 3;
		System.out.println((v3 % 2 == 0)?"짝수":"홀수");
		
		//5의 배수만 인지 삼항 연산자를 통해서 확인
		int v4 = 15;
		System.out.println((v4%5==0)?"5의 배수이다":"5의 배수가 아니다");
		
		//나이가 20 이상이면 성인이다. 성인이 아니다.
		int v5=24;
		System.out.println((v5>=20)?"당신은 성인이다.":"당신은 성인이 아니다.");
		System.out.println("===============");
		// 3항 연산자는 if ~ else 문으로 변환 가능
		/*
		 if (조건) {
			실행문1;	<= 조건이 참이면 실행문1이 실행
		}
		else {
			실행문2	<= 조건이 거짓말일때 실행문2가 실행
		} 
		 */
		
		//변수 선언은 한번만 할 수 있음. 할당은 여러번 가능!
		if ( v3 %2 ==0) {
			System.out.println("짝수");
		}
		else {
			System.out.println("홀수");
		}
		
		System.out.println("===============");
		//5의 배수를 출력
		if (v4 %5==0) {
			System.out.println("5의배수");
		}
		else {
			System.out.println("5의배수아님");
		}
		
		System.out.println("===============");
		//나이가 20살 이상이면 성인
		if (v5 >20) {
			System.out.println("당신은 성인입니다.");
		}
		else {
			System.out.println("당신은 성인이 아닙니다.");
		}
	}

}
