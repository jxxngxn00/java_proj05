package chapter09.EX01;


// 클래스의 접근 지정자 : public, default(생략)
// 필드, 생성자, 메소드 : public, protected, default, private
		//	public : 다른 패키지, 같은 패키지
		//	protected : 다른 패키지(상속), 같은 패키지
		//	default(생략) : 같은 패키지
		//	private : 같은 파일

public class A {
	
	//필드의 접근 제어자
	public int a=10;			// 다른 패키지, 같은 패키지
	protected int b=20;			// 다른 패키지(상속), 같은 패키지
	int c = 30;					// 같은 패키지
	private int d = 40;			// 같은 파일에서만 적용
	
	
	//메소드의 접근제어자
	public void print1() {
		System.out.println("A class print - public");
	}
	
	public void print2() {
		System.out.println("A class print - protected");
	}
	
	void print3() {
		System.out.println("A class print - default");
	}
	
	private void print4() {
		System.out.println("A class print - private");
	}
	
}
