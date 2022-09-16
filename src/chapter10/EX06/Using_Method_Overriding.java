package chapter10.EX06;

class Animal {
	// 자식 클래스에서 2개의 메소드를 오버라이딩
	// Animal 타입으로 정의, 배열에 저장 후, 오버라이딩된 메소드 출력 (for, Enhanced for)
	void run() {
		System.out.println("모든 동물은 달립니다.");
	}
	void eat() {
		System.out.println("모든 동물은 먹습니다. ");
	}
	
}

class Tiger extends Animal{
	@Override
	void run() {
		System.out.println("호랑이는 달립니다.");
	}
	
	void eat() {
		System.out.println("호랑이는 먹습니다.");
	}
}

class Eagle extends Animal{
	@Override
	void run() {
		System.out.println("독수리는 납니다?.");
	}
	void eat() {
		System.out.println("독수리는 먹습니다.");
	}
}

class Fish extends Animal{
	@Override
	void run() {
		System.out.println("물고기는 헤엄칩니다.");
	}
	void eat() {
		System.out.println("물고기는 먹습니다.");
	}
}

class Dog extends Animal{
	@Override
	void run() {
		System.out.println("강아지는 달립니다.");
	}
	void eat() {
		System.out.println("강아지는 먹습니다.");
	}
}

public class Using_Method_Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal aa1 = new Animal();
		Animal bb1 = new Tiger();
		Animal cc1 = new Eagle();
		Animal dd1 = new Fish();
		Animal ee1 = new Dog();
		
		Animal[] arr1 = new Animal[] {aa1,bb1,cc1,dd1,ee1};
		
		//1. for
		System.out.println("==for==");
		for(int i=0;i<arr1.length;i++) {
			arr1[i].run();
			arr1[i].eat();
			
			/* TypeCasting
			Animal a1 = arr1[i];
			a1.eat();
			a1.run();
			*/
		}
		
		
		//2. enhanced for
		System.out.println("==enhanced for==");
		for(Animal k : arr1) {
			k.run();
			k.eat();
		}
		
	}

}
