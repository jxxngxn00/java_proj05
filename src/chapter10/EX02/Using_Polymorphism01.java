package chapter10.EX02;

// 다형성 (Poymorphism) : 하나의 객체가 여러가지 타입을 가질 수 있다.
//		- 메소드 오버라이딩을 사용해서 부모 클래스의 메소드를 재정의해서 자식 클래스에서 재사용한다.

//상속을 사용한 다형적 표현
		//	- 상속 관계에서 객체를 생성시 부모 타입으로 선언할 수 있다.
		//	- 부모 타입으로 선언하면 부모 크랠스의 필드와 메소드만 사용가능함.
		//	- 자식 객체를 생성하면서 부모 타입으로 지정하면 업캐스팅이 자동으로 됨
		// 	- 다시 자식 클래스의 필드와 메소드를 사용 할려면 다운 캐스팅을 해야 사용 가능 
		//	- 다운 캐스팅은 수동으로 적용됨.

class A{ }					//부모 클래스
class B extends A{}		//자식 클래스
class C extends B{}		
class D extends B{}

public class Using_Polymorphism01 {

	public static void main(String[] args) {
		// 자식에서 객체 생성 후 부모 타입으로는 지정이 가능함.
		// 부모에서 객체 생성 후 자식 타입으로는 지정이 불가능.
		
		//1. A 타입의 다형적 표현
			//a1은 A타입만 내포하고 있고, A타입으로 지정
		A a1 = new A();		 // A class = A Type, A=A (O)
			//a2는 A, B 타입을 내포하고 있고, A 타입으로 지정
		A a2 = new B();		// B class = A Type, B=A (O)
			//a3는 A,B,C 타입을 내포하고 있고, A타입으로 지정
		A a3 = new C();		// C 클래스는 A 타입니다. C는 A이다. (O)
		
		//2. B 타입으로 다형적 표현
//		B b1 = new A();		// A는 B다. (X) 
		B b2 = new B();		// B는 B다. (O)
		B b3 = new C();		// C는 B다. (O)
		B b4 = new D();		// D는 B다. (O)
		
		//3. C타입으로 다형적 표현
//		C c1 = new A();		// A는 C다. (X)
//		C c2 = new B();		// B는 C다. (X)
		C c3 = new C();		// C는 C다. (O)
//		C c4 = new D();		// D는 C다. (X)
		
		//4. D 타입으로 다형적 표현
//		D d1 = new A();		// A는 D다. (X)
//		D d2 = new B();		// B는 D다. (X)
//		D d3 = new C();		// C는 D다. (X)
		D d4 = new D();		// D는 D다. (O)
		
		
		
	}

}
