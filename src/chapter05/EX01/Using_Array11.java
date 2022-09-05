package chapter05.EX01;

import java.util.Scanner;

public class Using_Array11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//탁구, 야구, 축구, 농구, 씨름
		// 각 운동 종목의 구성원 수를 합한 값을 출력
		
		String s;
		String[] arr;
		
		do{	int num;								//구성원 수를 입력할 변수
			int count=0;							//종목의 개수
			int sum=0;								//구성원 수의 합계
			System.out.println("각 종목의 구성원 수를 공백을 이용해서 넣으세요.");
			s=sc.nextLine();
			if (s.equals("그만")) {					//"그만"을 입력했을 경우 while 종료
				break; }
			
			arr = s.split(" ");						//공백 기준으로 끊기
			
			for(int i=0;i<arr.length;i++) {
				if(i%2!=0) {
					num = Integer.parseInt(arr[i]);	//문자열을 정수형으로 변환
					sum += num;
					count++;
				} }
			
			System.out.println("구성원의 합계 : "+sum);
			System.out.println("구성원의 평균 : "+sum/(double)count);
			
		}while(true);
		
		System.out.println("프로그램을 종료합니다.");
		sc.close();
	}

}
