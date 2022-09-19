import java.util.Scanner;
public class Practice_IF{
    public static void main(String[] args){

        String num;
        Scanner input = new Scanner(System.in);

        System.out.print("학번 입력 : ");
        num = input.nextLine();

        String year = num.substring(0,4);
        char aa = num.charAt(4);
        String major = num.substring(5, 7);
        int major_int = Integer.parseInt(major);
        String unit = null;
        String major2 = null;

        if (aa=='1') {
            unit = "공대";
            if (major_int == 11) { major2 = "컴퓨터학과"; }
            else if (major_int == 12) { major2 = "소프트웨어학과"; }
            else if (major_int == 13) { major2 = "모바일학과"; }
            else if (major_int == 22) { major2 = "자바학과"; }
            else if (major_int == 33) { major2 = "서버학과"; }
        }
        else if (aa =='2') {
            unit = "사회대";
            if (major_int == 11) { major2 = "사회학과"; }
            else if (major_int == 12) { major2 = "경영학과"; }
            else if (major_int == 13) { major2 = "경제학과"; }
            }
        System.out.println(num+" 는 "+year+"년도에 입학한 "+
         unit + " "+ major2 + " 학생입니다.");

    }
}