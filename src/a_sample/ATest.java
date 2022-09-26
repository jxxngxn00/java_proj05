package a_sample;

/*  자바의 GUI
 *  - AWT   : 1.2 이전
 *  - SWING : 1.2 이후
 */
import java.awt.*;
import javax.swing.*;

public class ATest {
    JFrame f;
    JButton btn, cc;
    JCheckBox house, oracle;
    JRadioButton xx, xy;
    JTextField tf;
    JTextArea ta;

    ATest(){
        //객체 생성 필수
        f = new JFrame("안녕");
        btn = new JButton("click");
        cc = new JButton("cancel");
        house = new JCheckBox("check box");
        oracle = new JCheckBox("oracle box");
        xx = new JRadioButton("female");
        xy = new JRadioButton("male");
        tf = new JTextField();
        ta = new JTextArea();

        ButtonGroup group = new ButtonGroup();
        group.add(xx);
        group.add(xy);

        tf = new JTextField(20);
        ta = new JTextArea(40,20);
    }

    void addLayout() {
        // f.setLayout(new FlowLayout());          //한줄로 배치
        // f.setLayout(new GridLayout(3,3));       //행렬이 맞는 레이아웃
        f.setLayout(new BorderLayout());           //동,서,남,북,가운데 배치       

        // 붙이기 작업
        f.add(btn, BorderLayout.NORTH);
        f.add(cc, BorderLayout.SOUTH);
        // f.add(house);
        // f.add(oracle);

        JPanel pEast = new JPanel();
        pEast.add(xx);
        pEast.add(xy);
        f.add(pEast, BorderLayout.EAST);

        // f.add(xx);
        // f.add(xy);

        f.add(new JLabel("입력하시오"), BorderLayout.WEST);
        // f.add(tf);
        f.add(ta, BorderLayout.CENTER);

        // 화면 출력
        f.setBounds(100,100,500,350);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        ATest a = new ATest();
        a.addLayout();
    }
}
