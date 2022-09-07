package chapter05.EX01;

import java.util.Arrays;

public class Using_Array05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1~500까지 3의 배수를 배열에 저장
		// 출력 : 1.직접출력, 2.for출력, 3.Enhanced For, 4. toString()
		// 합계:				 평균 :
		
		int j=0;
		
		int sum=0;
		
		int[] a = new int[170];
		
		for(int i=1;i<=500;i++) {
			if(i%3==0) {
				a[j] = i;
				sum += i;
				j++;
			}
		}
		
		//1. 직접
		
		//2. for 출력
		for(int i=0;i<j+1;i++) {
			System.out.println(a[i]);
		}
		
		//3.Enhanced for
		for(int k:a) {
			System.out.println(k);
		}
		
		//4. toString()
		System.out.println(Arrays.toString(a));
		
		
		System.out.println("합계 : "+sum+" , 평균 : "+sum/(double)(j+1));
	}

}
