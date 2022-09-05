package chapter02.EX03;

public class RangeOfVariableUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 변수의 생존 기간 : {} 블락 내에서만 생존
		int value1 = 3;
		{
			int value2 = 5;
			System.out.println(value1);
			System.out.println(value2);
		}
		System.out.println(value1);
		//System.out.println(value2);	//오류발생
	}

}
