package basic1;
import java.util.Calendar;
import java.util.Scanner;

public class Ex02_control {
    public static void main(String[] args) {
        String id=null;
        Scanner input = new Scanner (System.in);
        System.out.println("주민입력 -> ");
        id = input.nextLine();

        char sung = id.charAt(7);
        System.out.println(sung);
        // sung 변수에 문자가 1이거나 3이거나 9라면 남자 출력
        // 그렇지 않고 문자가 2이거나 4이거나 0이라면 여자 출력

        if (sung == '1'||sung=='3'||sung=='9'){
            System.out.println("남자");
        } else if(sung=='2'||sung=='4'||sung=='0'){
            System.out.println("여자");
        }

        char chul = id.charAt(8);
        System.out.println(chul);

        String home = null;
        // if (chul =='0')  home = "서울";
        // else if (chul =='1') home = "인천/부산";
        // else if (chul =='1') home = "경기";
        // else if (chul =='1') home = "제주";
        // System.out.println(home+"출신");

        switch (chul){
        case '0':home="서울"; break;
        case '1':home="인천/부산"; break;
        case '2':home="경기"; break;
        case '9':home="제주";
        }
        System.out.println(home+"출신");

        //String id="000810-4234567";

        String nai=id.substring(0, 2); // nai = "80"
        // 문자열 -> 정수 변환
        //int sunai = (int)nai;
        int sunai = Integer.parseInt(nai);

        int age=0;
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);        // 현재 년도를 불러옴

        if (sung == '1' || sung =='2') {        // 주민번호 뒷자리가 1이나 2로 시작하는 경우
            age = year-(1900+sunai)+1;
        }
        else if (sung =='4'||sung=='3'){        // 주민번호 뒷자리가 3이나 4로 시작하는 경우
            age = year-(2000+sunai)+1;
        }

        
        System.out.println(age);
    }
}
