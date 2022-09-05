package chapter03.EX05;

public class LocalOperator {
	public static void main(String[] args) {
		//논리 연산자 (&& : AND, || : OR, ^ : XOR, ! : NOT)
		// - 연산자 좌축과 우측에는 true, false
		
		// AND 연산 : && (좌우 모두 true일때 true)
		System.out.println(true && true);			//t
		System.out.println(true && false);			//f
		System.out.println(true && (5<3));			//f
		System.out.println((5<=5) && (7>2));		//t
		System.out.println("\n===============\n");	
		
		// OR 연산 : || (좌우중 하나만 true면 true)
		System.out.println(true || true); 			//t
		System.out.println(true || false); 			//t
		System.out.println(false || (5<3)); 		//f
		System.out.println((5<=5) || (7>2));		//t
		System.out.println("\n===============\n");
		
		// XOR 연산 : ^ (좌우가 동일할 때 false)
		System.out.println(true ^ true); 			//f
		System.out.println(true ^ false); 			//t
		System.out.println(false ^ (5<3));	 		//f
		System.out.println((5<=5)^(7>2));			//f	
		System.out.println("\n===============\n");
		
		// NOT 연산 : ! (반대로 출력, false이면 true, true이면 false)
		System.out.println(!true); 					//f
		System.out.println(!false); 				//t
		System.out.println(false || !(5<3));	 	//t
		System.out.println((5<=5) || !(7>2));		//t 
		System.out.println("\n===============\n");
		
		// 비트연산자로 논리 연산을 수행
		System.out.println(true & true); 			//t
		System.out.println(true & false); 			//f
		System.out.println(true | (5<3)); 			//t
		System.out.println((5<=5) | (7>2));			//t
		System.out.println("\n===============\n");
		
		// 숏 서킷 (short circuit) :
		//	- 왼쪽의 결과값 만으로 유추 가능할 때 오른쪽의 값을 실행하지 않는 것.
		//- 논리연산자(&&, ||, ^, !)에서만 작동됨, 비트연산자(&, |, ^, ~)에서는 작동이 안됨
		
		// 논리연산에서는 short circuit이 발생됨
		int value1 =3;
		//short circuit : 앞의 값이 false이기 때문에 뒤의 식을 계산하지 않아도 됨
		//System.out.println(false && ++value1>6);	
		System.out.println(true && ++value1>6);
		System.out.println(value1);
		System.out.println("\n===============\n");
		
		// 비트연산은 모두 확인함
		int value2 = 3;
		System.out.println(false & ++value2 >6);
		//논리연산자가 아니기 때문에 모두 확인
		System.out.println(value2);
		System.out.println("\n===============\n");
		
		
		//OR 연산에서 숏 서킷이 발생되는 예제
		int value3 = 3;
		System.out.println(true || ++value3 > 6);
		System.out.println(value3);
		System.out.println("\n===============\n");
		
		//
		int value4 = 3;
		System.out.println(true | ++value4>6);
		System.out.println(value4);
		System.out.println("\n===============\n");
		
	}

}
