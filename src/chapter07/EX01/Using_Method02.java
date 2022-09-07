package chapter07.EX01;

class Circle {
	double circle (int r) {					//넓이를 구하는 메서드
		return r*r*3.14;
	}
	
	//정답
	int radius;
	String name;
	
	Circle (int radius, String name){
		this.radius = radius;
		this.name = name;
	}
	
	void call() {
		double area = 3.14 * radius * radius;
		System.out.println(name + "의 넓이는 "+area+"입니다. ");
	}
	
}



public class Using_Method02 {

	public static void main(String[] args) {
		/*
		원의 지름을 넣었을때 전체 넓이를 구하는 객체를 생성후 출력해보세요
		피자 : 10 (반지름)
		도넛 : 5	(반지름)
		
		피자의 넓이는 00입니다.
		도넛의 넓이는 00입니다.
		*/
		
		/*
		 * Circle aa = new Circle (); //객체 생성
		 * 
		 * double pizza = aa.circle(10); //피자 넓이 구하기 (메서드 사용) double doughnut =
		 * aa.circle(5); //도넛 (메서드 사용)
		 * 
		 * System.out.println("피자의 넓이는 "+pizza+"입니다.");
		 * System.out.println("도넛의 넓이는 "+doughnut+"입니다.");
		 */
		
		Circle pizza = new Circle(10,"피자");
		pizza.call();
		Circle donut = new Circle(5,"도넛");
		donut.call();
		

	}

}
