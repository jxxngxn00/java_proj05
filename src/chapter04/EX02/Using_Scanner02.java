package chapter04.EX02;

import java.util.Scanner;

public class Using_Scanner02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름(문자열), 나이(점수), 몸무게(실수) "+"공백으로 구분해서 입력하세요. >>> ");
		
		String aa = sc.next();			//콘솔 인풋, 문자열
		int bb = sc.nextInt();			//콘솔 인풋, 정수
		double cc = sc.nextDouble();	//콘솔 인풋, 실수
		
		System.out.printf("당신의 이름은 %s이고 나이는 %d이고, "+"당신의 몸무게는 %4.1f 입니다. \n", aa, bb, cc);
		System.out.println("당신의 이름은 "+aa+"이고 나이는 "+bb+"이고, 당신의 몸무게는 "+cc+"입니다. \n");
		sc.close();
	}

}
