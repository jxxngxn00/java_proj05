package chapter07.EX04;

import java.util.Scanner;

class Converter {	//환율을 계산하는 클래스
	// 1. 필드
	double rate;
	
	// 2. 메소드 생성 (달러를 인풋, 원화를 반환하는 메소드), toKRW()
	double toKRW(double usd) {
		return usd / rate;
	}
	// 3. 메소드 생성 (원화를 인풋, 달러를 반환하는 메소드), toUSD()
	double toUSD(double krw) {
		return krw * rate;
	}
	
	// 4. setRate() : setter를 사용해서 rate 필드의 값을 설정
	public void setRate(double rate) {
		this.rate = rate;
	}
	
}

public class Converter_Test {

	public static void main(String[] args) {
		// 네이버를 검색 후 오늘 확률 확인
		// 객체 생성 후 스캐너로 환율을 인풋 받아서 setRate() 메소드에 저장 후
		Scanner sc = new Scanner(System.in);
		Converter cv = new Converter();
		
		System.out.print("오늘의 환율을 입력하세요 >> ");
		cv.setRate(sc.nextDouble());
		
		// 원화 100만원 => $ 로 변환 후 출력
		System.out.println("KRW 100만원 = USD "+cv.toKRW(1000000)+" $");
		// 100$ => 몇 원인지 변환 후 출력
		System.out.println("USD 100$ = KRW "+cv.toUSD(100)+" 원");

		
		
		//1. printf() 사용해서 출력
		System.out.println("==소수점 2째자리까지 잘라서 출력(printf)==");
		System.out.printf("원화 100만원은 %.2f$입니다. \n", cv.toKRW(1000000));
		System.out.printf("100$는 %.2f원입니다.\n", cv.toUSD(100));
		
		
		
		//2. 변수에 더블 값을 할당 후 소숫점 2자리까지 변환해서 출력
		System.out.println("====== 예시 ======");
		double per2 = 3.141592;
		
		
			//String으로 변환 후 per2의 변수의 값을 소숫점 2자리까지 출력 후 다시 더블형으로 변환
		double per1 = Double.parseDouble(String.format("%.2f", per2));
		System.out.println(per1);
		
		System.out.println("==실수를 변수에 할당 후 소숫점 2자리까지 자른 후 다시 더블에 지정");
		double d2 = cv.toUSD(1000000);
		double d1 = Double.parseDouble(String.format("%.2f",d2));
		System.out.println("원화 100만원은 "+d1+"$ 입니다.");
		
		double d4 = cv.toKRW(100);
		double d3 = Double.parseDouble(String.format("%.2f", d4));
		System.out.println("100$는 "+d3+" 만원입니다.");
		
		sc.close();
	}

}
