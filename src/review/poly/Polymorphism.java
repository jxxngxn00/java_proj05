package poly;

import java.util.Scanner;

public class Polymorphism {
    public static void main(String[] args) {
        Item i = null;

        System.out.println("해당하는 물품번호 (1.책, 2.DVD, 3.CD)");
        Scanner input = new Scanner(System.in);
        int sel = input.nextInt();

        //다형성
        switch(sel){
            case 1: i = new Book("001","총균쇠","제러드","코스모"); break;
            case 2: i = new Dvd(); break;
            case 3: i = new Cd(); break;
        }

        i.output();

        input.close();


    }
}
