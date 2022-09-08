package chapter07.EX01;

import java.util.Arrays;

public class Using_Method06 {
	
	static int add (int[] a) {
		//들어온 배열의 모든 값을 더해서 더한 값을 리턴
		int sum=0;				//각 배열의 방의 값을 가져와서 더해서 저장
		for(int i=0;i<a.length;i++) {
			sum += a[i];
		}
		
		return sum;
	}
	
	static int div (int[] a) {
		//들어온 배열의 모든 값을 빼서 뺀 값을 리턴
		int sub=7;
		for(int i=0;i<a.length;i++) {
			
			if(i==0) {continue;}
			sub -= a[i];
		}
		
		return sub;
	}
	
	static long mul (int[] a) {
		//들어온 배열의 모든 값을 곱해서 곱한 값을 리턴
		long mul=1;			//곱할때는 초기값을 1로 설정
		for(int i=0;i<a.length;i++) {
			mul *= a[i];
		}
		
		return mul;
	}
	
	static double avg (int[] a) {
		//들어온 배열의 모든 값을 더해서 평균 값을 리턴
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum += a[i];
		}
		
		double avg = sum / (double)a.length;
		
		return avg;
	}

	public static void main(String[] args) {
		// 1 ~ 100까지 7의 배수만 저장 후 각 메소드 호출
		//7의 배수를 저장
		int[] arr = new int[100/7];		//배열의 방의 갯수 지정
		int count=0;
		
		for(int i=1;i<101;i++) {
			if(i%7==0) {
				arr[count]=i;
				count++;
			}
		/*
		for(int i=0,j=7;i<arr.length;i++, j+=7) {
			arr[i] = j;			// arr[0] = 7
		}
		*/
		
			
		// 배열의 각 방의 내용을 출력
		System.out.println("1~100사이의 7의 배수 배열 : "+Arrays.toString(arr));
		
		System.out.println("=====");
		
		//메소드 호출
		System.out.println("배열의 합 : "+ add(arr));
		System.out.println("배열의 차 : "+ div(arr));	
		//변수명과 메소드명은 같아도 사용법이 다르기 때문에 괜찮음.
		
		System.out.println("배열의 곱 : "+ mul(arr));
		System.out.println("배열의 평균 : "+ avg(arr));
		
		/*
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		} System.out.println();
		*/
		
	}

	}}
