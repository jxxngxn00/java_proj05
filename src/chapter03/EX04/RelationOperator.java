package chapter03.EX04;

public class RelationOperator {

	public static void main(String[] args) {
		// 크기 비교 : true,false 값을 반환
		System.out.println(5<2);	//f
		System.out.println(5>2);	//t
		System.out.println(5<5);	//f
		System.out.println(5<=5);	//t
		System.out.println(5>=5);	//t
		
		// 등가 비교 :
		// 	==	: 같을때, != : 같지 않을때
		int a = 5; int b = 2; int c=5;
		System.out.println(a == b);	//f
		System.out.println(a != b);	//t
		System.out.println(a == c); //t
		System.out.println("\n===============\n");
		
		// 참조 자료형일때 등가비교 (객체의 참조주소를 비교하므로 false)
		String str1 = new String ("안녕"); 
		String str2 = new String ("안녕");
		System.out.println(str1 == str2);	//f, 객체의 번지수를 비교함
		System.out.println("\n===============\n");
		System.out.println(str1);	//객체의 번지수를 출력
		System.out.println(str2);	
		
	}

}
