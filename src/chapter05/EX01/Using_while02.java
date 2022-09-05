package chapter05.EX01;

import java.util.Scanner;

public class Using_while02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. String s = sc.nextLine();
		// 2. s.split(" ")
		// 3. Inter.parseInt()
		// 4. 합계 & 평균 구하기
		Scanner sc = new Scanner(System.in);
		String s;
		String[] arr;
		
		do {
			int sum=0;
			int num;
			int count=0;
			System.out.println("원하는 정수를 공백을 기준으로 입력하세요. '그만'으로 종료를 알리세요. >>> ");
			s= sc.nextLine();
			
			if(s.equals("그만")) {
				System.out.println("프로그램을 종료합니다. ");
				break;
				}
			
			arr=s.split(" ");
			
			for(int i=0;i<arr.length;i++) {
				num = Integer.parseInt(arr[i]);
				sum += num;
				count++;
			}
			
			System.out.printf("합계 : %d , 평균 : %.2f \n",sum,sum/(double)count);
			
		}while(true);
		
		sc.close();
	}

}
