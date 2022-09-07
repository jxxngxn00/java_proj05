package chapter05.EX01;

import java.util.Arrays;
import java.util.Scanner;

public class Using_Array08 {

	public static void main(String[] args) {
		//정수배열 방 10개를 생성하고
		//임의의 값을 10개의 스캐너로 방에 저장하고
		//그 중 최대값을 뽑아서 출력하는 프로그램
		//출력 : 배열방 10개에서 최대값은 : 000
		
		Scanner sc=new Scanner(System.in);
		
		int[] aa=new int[10];									//배열 생성
		
		for(int i=0;i<aa.length;i++) {							//정수입력
			System.out.print("배열에 저장할 정수를 입력하세요. >>> ");
			aa[i]=sc.nextInt();
		}
		
		int max=aa[0];											//최대값 생성
		int min=aa[0];											//최소값 생성
		
		for(int i=0;i<aa.length;i++) {							//최대값 비교/찾기
			/*
			 * if(aa[i]>max) { max = aa[i]; }
			 */
			max=(aa[i]>max)?aa[i]:max;
		}
		for(int i=0;i<aa.length;i++) {							//최소값 비교/찾기
			min=(aa[i]<min)?aa[i]:min;
		}
		
		System.out.println();
		System.out.println("배열방 10개에서 최대값은 : "+max);		//출력
		System.out.println("배열방 10개에서 최소값은 : "+min);		//출력
		
		
		System.out.println("\n==Arrays.sort() 메소드 사용해서 출력==");
		Arrays.sort(aa);				//배열 방의 값을 정렬함
		System.out.println("배열방 10개에서 최대값은 : "+aa[aa.length-1]);		//출력
		System.out.println("배열방 10개에서 최소값은 : "+aa[0]);		//출력
		
		System.out.println();
		System.out.println("======Stream을 사용하는 경우======");
		System.out.println("배열방 10개에서 최대값은 : "+Arrays.stream(aa).max().getAsInt());//출력
		System.out.println("배열방 10개에서 최소값은 : "+Arrays.stream(aa).min().getAsInt());//출력
		
		
		
		sc.close();
	}

}
