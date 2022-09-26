package poly;

public class Item {
    String num;
    String name;

    public Item(){}
    public Item(String num, String name){
        this.num = num;
        this.name = name;
    }

    public void output(){
        System.out.println(" 번호 : " + num);
        System.out.println(" 이름 : " + name);
    }
}
