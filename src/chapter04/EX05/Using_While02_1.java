package chapter04.EX05;

import java.util.Scanner;

public class Using_While02_1 {

	public static void main(String[] args) {
		//"그만" 할때까지 정수값을 넣어서 합계와 평균을 출력
		//문자열을 정수로 변환
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		int count = 0;
		System.out.print("원하는 정수를 입력하세요. '그만'으로 종료를 알리세요. >>> ");
		String aa = sc.next();
		
		while(!aa.equals("그만")) {
			int bb = Integer.parseInt(aa);
			sum += bb;
			count++;
			System.out.print("원하는 정수를 입력하세요. '그만'으로 종료를 알리세요. >>> ");
			aa=sc.next();
		}
		
		if (count == 0 ) {			//제일 처음에 정수값을 -1
			System.out.println("입력된 정수가 없습니다. ");
		}else {						//정수값을 하나이상 넣은 경우
			System.out.println("입력된 정수는 "+count+"개 입니다.");
			System.out.println("입력된 정수의 합은 : "+sum+"입니다.");
			System.out.println("평균은 : "+sum/(double)count+" 입니다.");
		}
		
		sc.close();
		
	}

}
