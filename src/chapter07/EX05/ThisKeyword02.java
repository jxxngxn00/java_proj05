package chapter07.EX05;

//반드시 this keyword를 사용해야 하는 경우 :
//	- 생성자, 메서드의 매개변수 이름, 필드이름이 동일한 경우 필드 이름에 this를 명시해야한다.
class AA1 {
	int m;
	int n;
	
	void init (int m, int n) {		//this 키를 명시하지 않는 경우
		m=m;
		n=n;
	}
}

class BB1 {
	int m;
	int n;
	
	void init(int m,int n) {		//this 키를 명시한 경우
		this.m=m;
		this.n=n;
	}
}



public class ThisKeyword02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AA1 AA1 = new AA1();	//기본 생성자 호출
		AA1.init(10, 20);
		System.out.println(AA1.m);
		System.out.println(AA1.n);
		
		
		
		

	}

}
