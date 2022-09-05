package chapter02.bytecode;

class A {				// A.class
}

class B {				// B.class
}

class C {				// C.class
	class D {			// C$D.class
	}
}

public class ByteCode {	// ByteCode.class
	public static void main(String[] args) {
		//하나의 Java 소스 파일에서 여러개의 클래스 생성시 컴파일 파일 출력.
		//public class는 하나만 와야함
		//public class의 이름이 java 파일 이름이 됨.
		
	}

}
