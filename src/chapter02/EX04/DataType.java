package chapter02.EX04;

public class DataType {

	public static void main(String[] args) {
		/*
		자바의 자료형
			- 기본 자료형 8가지 : 첫자가 소문자
				- boolean 	: true, false
				- byte		: 정수 (1byte), -2^7 ~ 2^7-1만 입력 가능 (-128 ~ 127)
				- short		: 정수 (2byte=16bit), -2^15 ~ 2^15-1까지 입력 가능 (-32,768 ~ 32,767)
				- int		: 정수 (4byte=32bit),	 -2^31 ~ 2^31-1까지 입력 가능 (-2,147,483,648 ~ 2,147,483,647) (기본)
				- long		: 정수 (8byte=64bit), 값을 할당할때 1234L 이라고 입력함
				- float		: 실수 (4byte),		  "	  "    456.78F " 	"
				- double	: 실수 (8byte) (기본)
				- char		: 문자 (1byte), 1개
			- 참조 자료형 무한대 : 첫 자가 대문자 <String은 참조자료형>
				- String : 문자열, ""
				배열, 클래스/인터페이스
		*/
		
		boolean aaa;				//true, false
		aaa = true; aaa = false;
		System.out.println(aaa);
		
		byte bbb;					//정수값만 할당 가능, 1byte = 8bit (-128~127)
		bbb = -128;
		System.out.println(bbb);
		
		byte bb;
		byte cc;
		//bb = 128;					//byte 범위를 넘겨서 입력 오류
		bb = (byte)128;				//해결
		cc = (byte)129;
		System.out.println("bb : "+bb);	//-128
		System.out.println("cc : "+cc);	//-127
		
		short ccc;					// -32,768 ~ +32,767
		ccc = -32768;
		System.out.println(ccc);
		
		short abc;
		abc = 32767;				//short 변수의 마지막
		System.out.println("abc : "+abc);
		abc = (short)32768;
		System.out.println("abc : "+abc);
		
		int ddd;
		ddd = 1234567890;
		System.out.println(ddd);
		
		long eee;
		eee = 1234567891234567891L;
		System.out.println(eee);
		
	}

}
