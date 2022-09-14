package chapter09.EX04;

class Student {
	static int serialNum =1000;
	int studentID;
	String studentName;
	int grade = 4;
	String address = "서울";
	
	Student () {
		serialNum ++;
		this.studentID = serialNum;
		grade = 4;
		address = "서울";
	}
	
	
	Student (String studentName){
		this();
		this.studentName=studentName;
	}
	

}


public class Student_Test {

	public static void main(String[] args) {
		// 객체를 생성시 자동으로 학번이 1000붙 1씩 자동으로 하번이 지정되어야 한다.
		// studentID : 1000부터 학생객체를 생성할 때마다 고유한 값으로 적용되어있어야 한다. 
		
		Student lee = new Student ("이지원");		// 1001
		Student hong = new Student ("홍지원");	// 1002
		Student jung = new Student ("정지원");	// 1003
		Student park = new Student ("박지원");	// 1004
		
		System.out.println("학번 : " +
				lee.studentID + ", 이름 : " + lee.studentName + ", 학년 : " 
				+ lee.grade +  ", 주소 : "+lee.address);
		
		System.out.println("학번 : " +
				hong.studentID + ", 이름 : " + hong.studentName + ", 학년 : " 
				+ hong.grade + ", 주소 : "+hong.address);
		
		System.out.println("학번 : " +
				jung.studentID + ", 이름 : " + jung.studentName + ", 학년 : "
				+ jung.grade + ", 주소 : "+jung.address);
		
		System.out.println("학번 : " +
				park.studentID + ", 이름 : " + park.studentName + ", 학년 : " 
				+ park.grade + ", 주소 : "+park.address);
	}

}
