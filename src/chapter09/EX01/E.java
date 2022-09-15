package chapter09.EX01;

// E class는 A class를 상속받는다. <== A 클래스의 모든필드와 메소드를 물려받는다.
// A class : 부모 클래스 (super class)
// E class : 자식 클래스 (child class)
//		(동일한 패키지에서 상속설정)

public class E extends A{
	
	public void print() {
		System.out.println("==부모의 필드 출력 ==");
		System.out.println(a);	// public			
		System.out.println(b);	// protected		
		System.out.println(c);	// default			
//		System.out.println(d);	// private, 동일한 파일에서만 접근, 접근 불가	
		
		System.out.println("==부모의 메소드 호출==");
		print1();			// public
		print2();			//  protected
		print3();			//  default
		//print4();			//  private
		
	}

}
