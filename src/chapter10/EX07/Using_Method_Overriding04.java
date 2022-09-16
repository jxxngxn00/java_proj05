package chapter10.EX07;


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
	int count;		// 호랑이 수
	
	Tiger (int count){
		this.count = count;
	}
	
	
	@Override
	void run() {
		System.out.println("호랑이는 달립니다.");
	}
	@Override
	void eat() {
		System.out.println("호랑이는 먹습니다.");
	}
}

class Eagle extends Animal{
	int count;		// 독수리 수
	
	Eagle (int count){
		this.count = count;
	}
	
	@Override
	void run() {
		System.out.println("독수리는 납니다?.");
	}
	@Override
	void eat() {
		System.out.println("독수리는 먹습니다.");
	}
}

class Fish extends Animal{
	int count;			// 물고기 수
	
	Fish (int count){
		this.count = count;
	}
	
	@Override
	void run() {
		System.out.println("물고기는 헤엄칩니다.");
	}
	@Override
	void eat() {
		System.out.println("물고기는 먹습니다.");
	}
}

class Dog extends Animal{
	int count;			// 개의 수
	
	Dog (int count){
		this.count = count;
	}
	
	@Override
	void run() {
		System.out.println("강아지는 달립니다.");
	}
	@Override
	void eat() {
		System.out.println("강아지는 먹습니다.");
	}
}

public class Using_Method_Overriding04 {

	public static void main(String[] args) {
		
		// 1. 객체 생성	(Animal 타입으로 생성)
			// 생성자를 통해서 각각의 필드에 값을 할당.
		Animal a1 = new Animal();
		Animal a2 = new Tiger(10);
		Animal a3 = new Eagle(5);
		Animal a4 = new Fish(50);
		Animal a5 = new Dog(70);
		
		// 객체를 배열에 저장
		Animal[] arr1 = new Animal[] {a1,a2,a3,a4,a5};
		
		
		
		// For문을 사용해서 출력 : eat(), run(), 동물의 총 마리수
			//1. For문을 사용해서 객체를 Animal 객체로  뽑아서
			//2. 다운캐스팅 해서 자식 필드의 count값을 읽어서 총 더한 값을 출력
		int sum = 0;
		for (int i=0;i<arr1.length;i++) {
			if (arr1[i] instanceof Tiger) { 
				Tiger tigerCount = (Tiger) arr1[i];
				sum += tigerCount.count;
			}
				else if (arr1[i] instanceof Eagle) {
					Eagle eagleCount = (Eagle) arr1[i];
					sum += eagleCount.count;
				}
				else if (arr1[i] instanceof Fish) {
					Fish fishCount = (Fish) arr1[i];
					sum += fishCount.count;
				}
				else if (arr1[i] instanceof Dog) {
					Dog dogCount = (Dog) arr1[i];
					sum += dogCount.count;
				}
			
			arr1[i].eat();
			arr1[i].run();
			
		}
		System.out.println("동물의 총 마리수 : "+sum);
		
		
	}

}
