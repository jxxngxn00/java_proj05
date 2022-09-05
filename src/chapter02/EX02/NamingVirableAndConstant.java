package chapter02.EX02;

public class NamingVirableAndConstant {

	public static void main(String[] args) {
		
		/* 변수의 이름 부여 (변수 : 값 변경 가능)
		 	- 변수 이름은 영문, 한글 사용가능 (한글은 권장사항 아님)
		  	- 첫자는 소문자로 처리
		  	- 특수문자 : _ , $는 사용할 수 있으나 그 외는 올 수 없음.
		  	- 첫자에 숫자는 올 수 없음.
		  	- JAVA의 Keyword(예약어)는 올 수 없다. (int, double, String ... )		  
		 */
		
		boolean aBcD;		//aBcD 변수에 True, False ;
		aBcD = true;
		aBcD = false;
		
		System.out.println(aBcD);
		byte 가나다;			//사용은 가능하나 권장사항이 아니다.
		short _abcd;		//특수문자는 _와 $ 사용 가능
		char $ab_cd;
		double main;		//메소드 이름을 변수이름으로 사용 가능함
							//사용방법이 달라서 사용가능
		//float int;		//예약어를 변수명으로 사용하면 오류 발생
							//class, int, double,char, byte ......
		
		String myclassName; //첫 단어는 소문자, 여러 단어가 있을때 첫 단어 대문자
		
		/*
		  상수의 이름 부여	(상수 : 값 변경 불가능)
		  	- 대문자로 처리
		  	- 변수 선언문 앞에 final 키워드를 사용.  	
		 */
		
		final double PI; //꼭 대문자로만
		PI = 3.141592;
		
		System.out.println(PI);
		
		/*
		PI = 1234.00;
		System.out.println(PI);
		
		상수(final)은 수정할 수 없다.
		
		*/
		

		
	}

}
