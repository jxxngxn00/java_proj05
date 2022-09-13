package chapter07.EX05;

//Aa 클래스 : 여러개의 생성자 사용시 this()  없이 사용한 경우 : 중복된 값을 매번 입력해야함.

class Aa {
	int m1, m2, m3, m4;	// 정수 값을 담는 필드 4개 선언
	Aa(){ //기본 생성자
		m1=1; m2=2; m3=3; m4=4;
	}
	
	Aa(int a){
		m1=a; m2=2; m3=3; m4=4;
	}
	
	Aa(int a,int b){
		m1=a; m2=b; m3=3; m4=4;
	}
	
	void print() {	//각 필드의 값을 출력하는 메소드
		System.out.print(m1+" ");
		System.out.print(m2+" ");
		System.out.print(m3+" ");
		System.out.print(m4+" ");
		System.out.println();
	}
	
}

//Bb 클래스 : 여러개의 생성자 사요시 this()를 사용한 경우 : 중복된 값을 제거할 수 있음.

class Bb {
	int m1,m2,m3,m4;
	Bb() {
		m1=1; m2=2; m3=3; m4=4;
	}
	Bb(int a){
		this();		//!기본값을 다시 불러와서 덮어쓸때 자주 쓰임
		m1=a;
	}
	Bb(int a,int b){
		this(a);
		m2=b;
	}
	void print() {	//각 필드의 값을 출력하는 메소드
		System.out.print(m1+" ");
		System.out.print(m2+" ");
		System.out.print(m3+" ");
		System.out.print(m4+" ");
		System.out.println();
	}
	
}

public class ThisMethod02 {

	public static void main(String[] args) {
		//1. 3개의 객체 생성 (this() 미사용)
		System.out.println("===Aa 객체 생성 (this 미사용)===");
		Aa aaa1 = new Aa();		//기본 생성자 호출
		aaa1.print();
		
		Aa aaa2 = new Aa(10);	//매개 변수 1개인 생성자 호출
		aaa2.print();
		
		Aa aaa3 = new Aa(10,20);//매개 변수 2개인 생성자 호출
		aaa3.print();
		
		
		//2. 3개 객체 생성 (this() 사용)
		System.out.println("===Bb 객체 생성 (this() 사용)===");
		Bb bbb1 = new Bb();		//기본 생성자 호출
		bbb1.print();
		
		Bb bbb2 = new Bb(10);	//매개 변수 1개인 생성자 호출
		bbb2.print();
		
		Bb bbb3 = new Bb(10,20);//매개 변수 2개인 생성자 호출
		bbb3.print();
		
		
		
		
		
		
		
	}

}
