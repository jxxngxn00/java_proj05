package chapter02.EX05;

public class DataType02 {

	public static void main(String[] args) {
		// float과 double의 정밀도
			// float : 소숫점 7자리까지 정밀도가 유지됨.
			// double : 소숫점 15자리까지 정밀도가 유지됨.
		
		//float 값 지정하는 방법 : f를 끝에 붙이거나 형변환. (소수만 올 경우에는 double 형태임)
		float f1 = 1.0000001F;			//float 변수에 값을 저장할때 casting 필요
											//리터럴: 변수에 저장되는 값을 호칭
		System.out.println("끝F f1 : "+f1);
		f1 = (float)1.0000001;			//변수값 앞에 (float), 변수값 뒤 f
		System.out.println("형변환 f1 : "+f1);
		
		float f2 = 1.00000001F;			//자리수 넘어가면 카운트하지 않고 버림
		System.out.println("f2 : "+f2);
		
		System.out.println("========");
		
		double d1 = 1.000000000000001;
		System.out.println("d1 : "+d1);
		
		double d2 = 1.0000000000000001;	//자리수 넘어가면 카운트하지 않고 버림
		System.out.println("d2 : "+d2);
		
		
	}

}
