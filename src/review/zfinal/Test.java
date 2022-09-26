package zfinal;

class Parent{
    final String field = "부모님꺼";
    final public void jib(){
        System.out.println("부모님이 만드신 것");
    }
}

class Child extends Parent{
    Child(){
        //field = "내꺼";
    }

    // public void jib(){  //overriding
    //     System.out.println("탕진...");
    // }
}

public class Test {
    public static void main(String[] args) {
        Parent p = new Child();
        System.out.println(p.field);
        p.jib();
    }
}

 
 