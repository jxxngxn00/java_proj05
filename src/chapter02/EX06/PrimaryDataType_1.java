package chapter02.EX06;

public class PrimaryDataType_1 {

	public static void main(String[] args) {

		// byte < short < int < long < float < double
		
		//업캐스팅 : 자동으로 적용, 작은 데이터 타입에서 큰 데이터 타입으로 변환
		//다운캐스팅 : 수동으로 적용해야함, 큰 데이터 타입에서 작은 데이터 타입으로 변환, 값이 손실될 수 있음
			//예외 : byte, short - int에서 byte/short 로 들어갈때 다운캐스팅 되지만, 명시하지 않아도 됨
		
		//자바에서 =의 왼쪽과 오른쪽은 반드시 데이터 타입이 같아야 함

		int a = 10;
		float b = 10.11f;
		
		float c = a+b;			// (int)a -> (float)a 로 업캐스팅
		System.out.println("c : "+c);
		
		//int d = a + b; 			// 오류 발생
		int d = a + (int)b;			// 수동으로 다운캐스팅(float b -> int b) - 해결
		System.out.println("d : "+d);
		
		
		//boolean : true, false
		boolean bool1 = true;
		boolean bool2 = false;
		System.out.println(bool1);
		System.out.println(bool2);
		
		//정수 : byte, short, int, long
		//기본값은 int 값으로 정의
		
		byte value1= 10;
		short value2 = -10;
		int value3 = 100;
		long value4 = -100;	//int 값이 Long 데이터 타입으로 업캐스팅 되어서 들어감 (L을 안써도 long 형으로 들어감)
		
	}

}
