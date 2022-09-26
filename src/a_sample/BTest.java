package a_sample;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BTest extends JFrame{
    JButton btn;

    BTest(){
        super("나의 두번째 창");
        btn = new JButton("확인");
    }

    void addLayout(){   //창 만들기 가능
        add(btn);       //부모에게 상속받음 --> 그대로 쓸 수 있음

        setBounds(100,100,500,350);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        BTest b = new BTest();
        b.addLayout();
    }
}
