package chapter02.EX08;

public class TypeCasting_2 {

	public static void main(String[] args) {
		//1.자동타입 변환(업캐스팅)
		float value1 = 3;	//int 3이 float으로 자동 업캐스팅
		long value2 = 5;	//int 5가 long 타입으로 자동 업캐스팅
		double value3=7;	//int 7가 double 타입으로 자동 업캐스팅
		
		byte value4=9;		//int 9가 byte 타입으로 자동 다운캐스팅 (예외)
		short value5=11;	//int 11가 short 타입으로 자동 다운캐스팅 (예외)
		
		System.out.println("value1 : "+value1);
		System.out.println("value2 : "+value2);
		System.out.println("value3 : "+value3);
		System.out.println("value4 : "+value4);
		System.out.println("value5 : "+value5);
		
		
		System.out.println("\n===============\n");
		
		//2.수동타입 변환(다운캐스팅) 
		byte value6 = (byte)128;	// int -> byte (-128)
		int value7 = (int)3.5;		// double -> int
		float value8 = (float)7.5;		// double -> float
		
		System.out.println("value6 : "+value6);
		System.out.println("value7 : "+value7);
		System.out.println("value8 : "+value8);

	}

}
