package chapter05.EX01;

import java.util.Arrays;

public class Using_Array03 {

	public static void main(String[] args) {
		//한국을 빛낸 5명의 위인들만 s String 배열에 저장후 4가지로 출력하세요
		
		String[] s = new String[5];
		
		s[0]="이순신";
		s[1]="홍길동";
		s[2]="신사임당";
		s[3]="안중근";
		s[4]="세종대왕";
		
		//1. 직접
		System.out.println("1. 직접 출력");
		
		System.out.println("s[0] : "+s[0]);
		System.out.println("s[1] : "+s[1]);
		System.out.println("s[2] : "+s[2]);
		System.out.println("s[3] : "+s[3]);
		System.out.println("s[4] : "+s[4]);
		
		//2. for문으로
		System.out.println("2. for문으로 출력");
		for(int i=0;i<s.length;i++) {
			System.out.println("s["+i+"] : "+s[i]);
		}
		
		//3. 향상for문
		System.out.println("3. 향상된 for문으로 출력");
		for(String i: s ) {
			System.out.println(i);
		}
		
		//4.Arrays.toString(s)
		System.out.println("4. Arrays.toString(s)로 출력");
		System.out.println(Arrays.toString(s));
		
		
	}

}
