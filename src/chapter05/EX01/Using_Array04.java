package chapter05.EX01;

import java.util.Arrays;

public class Using_Array04 {

	public static void main(String[] args) {
		// 배열(Array) : 하나의 [배열] 변수에 여러개의 값을 넣는다.
		//		- 참조 자료형 : 변수가 Stack에 저장, 값은 Heap에 저장
		//			변수의 Heap 영역의 주소값이 들어가있다.
//				- 기본 자료형 : 변수, 값, 모두 Strack에 저장되어 있다.
//					boolean, byte, short, int, long, float, double, char
		// 기본 자료형 배열 변수 : 
		// 참조 자료형 배열 변수 : String 

		//1. 동일한 자료형의 값을 담고있다.
		//2. 방의 갯수를 변경할 수 없다. (정적)
		
			//Heap 공간에는 반드시 값이 들어있어야 한다.
			//	- 초기값을 넣지 않는 경우 JVM이 자동으로 넣는다.
			//		--정수 : 0, 실수 : 0.0, boolean : false
			//		-- 참조자료형일 경우 : null <==0이 아니고 비어있는 상태
		
		
		// 1. 배열 선언과 초기화
		
		int[] a = new int[5];
			//int 배열 변수 ([]) a를 생성
			//new : Heap 공간에 int 배열방 5개를 생성해서 Heap의 주소를 a변후에 할당
		
		//2. 방의 값을 입력
			//index(방) 직접 값을 대입
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		
		for(int i=0, j =100;i<5;i++, j+=100) {	// i : index(0,1,2,3,4)
			a[i] = j;
		}
		
		System.out.println("===방의 갯수를 직접 넣어서 입력===");
		
		for(int i=0, j =100;i<5;i++, j+=100) {	// i : index(0,1,2,3,4)
			a[i] = j;
		}
		System.out.println("=====for문을 사용하여 출력=====");
		for(int i=0;i<5;i++) {	// i : index(0,1,2,3,4)
			System.out.println(a[i]);
		}
		
		
		System.out.println("===a.length===");
		System.out.println(a.length);
		for(int i=0, j =100;i<a.length;i++, j+=100) {	// i : index(0,1,2,3,4)
			a[i] = j;
		}
		
		System.out.println("=====a.length를 사용하여 출력=====");
		for(int i=0;i<a.length;i++) {	// i : index(0,1,2,3,4)
			System.out.println(a[i]);
		}
		
		//3. 배열 방의 정보를 출력
		System.out.println("=====직접 출력=====");
		System.out.println(a[0]);		//index (방번호 0)
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		
		//3. 배열 방의 정보를 출력 (Enhanced For : 배열의 저장된 모든 값을 출력)
		System.out.println("===향상된 for문을 사용해서 출력===");
		for (int k:a) {
			System.out.println(k);
		}
		
		//4. 출력 : Arrays.toString(a) : Arrays 객체의 toString() 메소드(함수)
		System.out.println("==Arrays.toString()를 사용==");
		System.out.println(Arrays.toString(a));
		
		
		
		
	}

}
