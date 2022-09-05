package chapter04.EX04;

import java.util.Scanner;

public class Using_For03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 정수 (음수, 양수) 를 스캐너로 5개 인풋받아서
		// 양수만 더한 값을 출력하세요.
		Scanner sc = new Scanner(System.in);
		
		int sum=0;		//양수만 더함
		int sum1 = 0;	//모든수를 더함
		int count = 0;	//양수를 카운트하는 변수
		int count1 = 0;	//모든 수를 카운트
		for (int i=0;i<5;i++) {
			System.out.print("정수를 입력하세요 >>> ");
			int a = sc.nextInt();
			if(a>0) {
				sum += a;
				count++;
			}
			count1++;
			sum1 +=a;
		}
		System.out.println("양수 합계 : " + sum +" 모든 수 합계 : " + sum1 );
		
		
		double avg = sum / count;
		System.out.println("양수 평균 : " + avg + " 모든 수 평균 : "+(sum1/(double)count1));
		System.out.println();
		
		sc.close();
		
	}

}
