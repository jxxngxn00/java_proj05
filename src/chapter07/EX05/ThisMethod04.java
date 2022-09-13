package chapter07.EX05;

class Car {
	String companyName;
	String color;
	double maxSpeed;
	
	//생성자
	Car () {
		companyName = "null";
		color = "null";
		maxSpeed = 0.0;
	}
	
	Car (String companyName){
		this();
		this.companyName = companyName;
	}
	
	Car (String companyName, String color){
		this(companyName);
		this.color = color;
	}
	
	Car (String companyName, String color, double maxSpeed){
		this(companyName,color);
		this.maxSpeed=maxSpeed;
	}
	
	//필드의 모든 값을 출력 메소드 (print())
	void print() {
		System.out.println("======");
		System.out.println("Company Name : "+companyName);
		System.out.println("Color : "+color);
		System.out.println("Max Speed : "+maxSpeed+" km/h");
	}
	
}

public class ThisMethod04 {

	public static void main(String[] args) {
		// 1. 매개 변수 0개일때, 기본 필드의 값 출력
		Car car0 = new Car();
		car0.print();
		// 2. 매개 변수 1개일때, companyName만 출력, 나머지는 기본값 출력
		Car car1 = new Car("현대자동차");
		car1.print();
		// 3. 매개 변수 2개일때
		Car car2 = new Car("현대자동차","검은색");
		car2.print();
		// 4. 매개 변수 3개일떼
		Car car3 = new Car("현대자동차","검은색",200);
		car3.print();
	}

}
