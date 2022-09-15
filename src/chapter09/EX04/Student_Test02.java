package chapter09.EX04;
class Student02{
	
	//필드의 접근 제어자 : default로 구성됨 : -- 외부 클래스에서 객체를 생성 후 직접 수정이 가능함
	static int serialNum =1000;
	int studentID;
	String studentName;
	int grade;
	String address;
	
}

class Student03 {
	//필드의 접근제어자는 보안을 위해서 private으로 선언 할 수 있다.
	//		-- 필드의 값을 직접적으로 수정 할 수 없다.
	//	-- 
	
	private static int serialNum =1000;
	private int studentID;
	private String studentName;
	private int grade;
	private String address;
	private int month;							// 값 : 1 ~ 12 까지만 와야한다.

	//필드의 접근 제어자를 private으로 설정하면 외부 클래스에서 접근 불가함.
	//생성자나 메소드(Setter)를 사용해서 필드의 내용을 수정	
		//원하는 값을 (제어해서) 입력을 할 수 있다.
	
	Student03 () {
		serialNum ++;
		studentID = serialNum;
		grade = 4;
		address = "서울";
	}
	
	Student03(String studentName){
		this();			//	기본 생성자를 다시 호출
		this.studentName = studentName;
	}
	
	void print() {
		System.out.println("학생 ID : "+studentID +", 학생 이름 : "+studentName
				+", 학년 : "+grade+", 주소 : "+address + ", 월 : "+month );
		System.out.println();
	}
	
	/*은진*/
	public void setGrade (int grade) {
		if (grade >= 1 && grade <= 4) {
			this.grade = grade;
		}else {
			System.out.println("잘못된 값을 입력했습니다. 1~4까지만 입력하세요.");
			return;
		}
		
	}
	
	void setMonth (int month) {				//외부 클래스에서 접근 가능
		if (month >=1 && month <=12) {
			this.month = month;
		} else {
			System.out.println("잘못된 값을 입력했습니다. 1~12시까지만 입력해주세요.");
			return;
		}
		
	}
}

public class Student_Test02 {

	public static void main(String[] args) {

		//객체 생성
		Student02 s = new Student02();
		
		//default 접근 제어자 : 동일한 패키지에 존재하는 클래스에서 필드의 값을 직접 수정
		s.serialNum = 2000;
		s.studentID = 100;
		s.studentName = "홍길동";
		
		//객체 생성
		Student03 s3 = new Student03();
		//		s3.serialNum = 2000;			<== 접근 제어자 : private, 접근 불가함.
		//		s3.studentID = 100;
		//		s3.studentName = "홍길동";
		
		
		/*은진*/
		
//		s3.grade = 100;		//1~4
//		s3.month = 200;		//1~4
		
		s3.setGrade(4);
		s3.setMonth(7);
		s3.print();
		
	
		
	}

}
