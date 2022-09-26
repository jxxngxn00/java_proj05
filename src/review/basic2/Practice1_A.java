package basic2;

public class Practice1_A {
    public static void main(String[] args) {

        // [1] 회사 A

        int count=0;    // 8의 갯수
        int temp=0;     // 임시 변수
        for(int i=0;i<=10000;i++){
            temp = i;                       //temp에 i값 임시 저장
            while(true){
                if (temp%10 ==8) count++;   //temp를 10으로 나눈 나머지의 값이 8일 경우 갯수를 셈
                if (temp>10) {temp /= 10; } //temp가 10보다 클 경우(2자리수 이상) 10으로 나눈 후 다시 갯수를 셈
                else {break;}               //temp가 10보다 작을 경우 while문 종료
            }
        }

        System.out.println("1부터 10000사이에 존재하는 8의 갯수 : "+count); //결과 출력
        
    }
}
