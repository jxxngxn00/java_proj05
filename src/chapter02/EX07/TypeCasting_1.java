package chapter02.EX07;

public class TypeCasting_1 {

	public static void main(String[] args) {
		// 정수의 리터럴 기본은 int, 실수의 리터럴 기본은 double		
		
		//1. 캐스팅 방법
		// 	- 캐스팅 방법1 (데이터 타입을 명시)
		int value1 = (int)5.3;		// 5 (소수점이하 버림)
		long value2 = (long)10;		// int가 자동으로 long으로 업캐스팅
		float value3 = (float)5.8;	// double이 float으로 자동으로 다운캐스팅될 수 X : 명시해야함
		double value4 = (double)16;	// int가 자동으로 double로 업캐스팅
		
		System.out.println("value1 : "+value1);
		System.out.println("value2 : "+value2);
		System.out.println("value3 : "+value3);
		System.out.println("value4 : "+value4);
		
		// 	- 캐스팅 방법2 (L, F)
		long value5 = 10L;
		long value6 = 10l;
		float value7 = 5.8F;
		float value8 = 5.8f;
		System.out.println("value5 : "+value5);
		System.out.println("value6 : "+value6);
		System.out.println("value7 : "+value7);
		System.out.println("value8 : "+value8);
	}

}
