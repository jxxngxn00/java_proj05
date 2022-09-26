package basic_temp;

import java.util.Calendar;
import java.util.Scanner;

public class Birth {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("자신이 태어난 년도 입력 : ");
        int year = sc.nextInt();        // 변수 year에 태어난 년도 입력


        //Calendar 클래스 이용 - 현재 년도 받아옴
        Calendar c = Calendar.getInstance();
        int current = c.get(Calendar.YEAR);
        int age = current - year;       // 나이 계산 : 현재 년도 - 태어난 년도

        //결과 출력
        System.out.println("age : "+age);
        System.out.println("year : "+year);
        sc.close();
    }
}
