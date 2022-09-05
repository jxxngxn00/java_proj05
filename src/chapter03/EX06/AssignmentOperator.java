package chapter03.EX06;

public class AssignmentOperator {

	public static void main(String[] args) {
		// 대입 연산자의 축약 표현
		/*
		 산술 연산의 축약표현
		 a = a + b ;			a += b ;
		 a = a - b ;			a -= b ;
		 a = a * b ;			a *= b ;
		 a = a / b ;			a /= b ;
		 
		 비트 연산의 축약표현
		 a = a & b ;			a &= b ;
		 a = a | b ;			a |= b ;
		 
		 시프트 연산의 축약표현
		 a = a >> b ;			a >>= b ;
		 a = a << b ;			a <<= b ;
		 
		 논리 시프트
		 a = a >>> b ; 			a >>>= b ;
		 */
		
		int value1 = 3;
		value1 = value1 + 3;				//대입 연산자는 제일 나중에 적용
		System.out.println(value1);
		System.out.println("=========");
		
		int v2;	//변수 선언
		v2 = 1;	//변수에 값 할당
		System.out.println(v2 += 2);		//v2 = v2 + 2
		System.out.println(v2 -= 2);		//v2 = v2 - 2
		System.out.println(v2 *= 2);		//v2 = v2 * 2
		System.out.println(v2 /= 2);		//v2 = v2 / 2
		System.out.println(v2 %= 2);		//v2 = v2 / 2 에서 나머지값만 출력함
		System.out.println(v2 <<= 2);		//v2 = v2 << 2  | 결과값 : 0000 0100
		System.out.println(v2 >>= 2);		//v2 = v2 >> 2
		
	}

}
