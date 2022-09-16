package chapter10.EX09;

public class Customer {
	int customerID;			//고객 ID
	String customerName;	//고객 이름
	String customerGrade;	//고객 등급 (VIP, Gold, Silver)
	int bonusPoint;			//고객의 등급에 따라서 포인트 적립
	double bonusRatio;		//물품구매시 할인율
	
	Customer(){
		initCustomer();		//this.initCustomer()
		
	}
}
