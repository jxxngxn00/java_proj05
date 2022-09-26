package basic2;

public class Ex01_while개념 {
    public static void main(String[] args){

        //0. for 문
        int sum=0;
        for (int i=1;i<=100;i++){
            sum += i;
        }
        
        //1. while
        sum=0;
        int i=1;
        while (i<=10){
            sum = sum+=i;
            i++;
        }

        //2. do~while
        sum = 0;
        i=1;
        do {
            sum += i;
            i++;
        } while(i<=10);
        System.out.println(sum);

        System.out.println(sum);
        System.out.println(sum);

    }
}