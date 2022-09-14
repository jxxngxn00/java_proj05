package chapter09.EX03;

//기존 클래스의 외부 클래스 생성 : 다른 패키지에서 접근이 불가능
	// 간단하게 외부 패키지에서는 접근이 불가능, 같은 패키지에서만 사용할 경우


public class A {	//default 접근 지정자가 생략됨.
	int m = 10;
	int n = 20;
	
	void print() {
		System.out.println(m+", "+n);
	}
}


public class Using_Modifier10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		a.print();
	}

}
