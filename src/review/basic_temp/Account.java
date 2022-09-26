package basic_temp;

public class Account {

    //클래스 내 변수 지정
    private String name = "자바맨";     //예금주
    private String account = "123-456"; //계좌번호
    private int money = 1000;           //잔액

    //인출 메소드 생성
    public void out(int a){
        if(a>money) {                   //잔액보다 인출하려는 금액이 클 경우
            System.out.println("잔액이 부족합니다.");
        }else {                         
            System.out.println("인출한 금액 : "+a);
            money -= a;                 //결과값 출력 후 잔액에서 인출금액 차감
        }
    }

    //입금 메소드 생성
    public void in(int a){
        money += a;                             //입금액 + 잔액
        System.out.println("입금한 금액 : "+a); //입금한 금액 출력
    }

    @Override
    public String toString() {                  //toString 오버라이딩 -- 결과값 출력
        // TODO Auto-generated method stub
        System.out.printf("예금주 : %s, 계좌번호 : %s, 잔액 : %d원 \n",name,account,money);
        return super.toString();
        
    }

    public static void main(String[] args) {
        Account a = new Account();
        a.out(1500);
        a.out(500);
        a.in(500);
        a.toString();
    }
}
