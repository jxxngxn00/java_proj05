package chapter10.EX01;

class Fruit{
	String name;		//과일 이름
	String color;		// 색깔
	int large;			// 크기
	
	void eat() {
		System.out.println("모든 과일은 맛이 있습니다.");
	}
	
	void print() {
		System.out.println(name +", "+color +", "+large);
	}
}

class Apple extends Fruit {
	int appleCount;
	void A() {
		System.out.println("사과");
	}
}

class Orange extends Fruit {
	int orangeCount;
	void B() {
		System.out.println("오렌지");
	}
}

class Banana extends Fruit {
	int bananaCount;
	void C() {
		System.out.println("바나나");
	}
}

public class Using_Inheritance02 {

	public static void main(String[] args) {
		System.out.println("===Fruit===");
		Fruit f = new Fruit();
		f.name = "과일";
		f.color = "기본값";
		f.large = 0;
		
		f.eat();
		f.print();
		
		
		System.out.println("===Apple===");
		Apple a = new Apple();
		a.name = "사과";
		a.color = "빨강";
		a.large = 3;
		a.appleCount = 30;
		
		a.eat();
		a.print();
		a.A();
		
		
		System.out.println("===Orange===");
		Orange o = new Orange();
		o.name = "오렌지";
		o.color = "주황";
		o.large = 1;
		o.orangeCount =123;
		
		o.eat();
		o.print();
		o.B();
		
		System.out.println("===Banana===");
		Banana b = new Banana();
		b.name = "바나나";
		b.color = "노랑";
		b.large = 6;
		b.bananaCount=32;
		
		b.eat();
		b.print();
		b.C();
	}

}
