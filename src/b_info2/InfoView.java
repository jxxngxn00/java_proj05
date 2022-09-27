package b_info2;

import java.awt.*;

import javax.imageio.ImageIO;
import javax.swing.*;

public class InfoView {
    //1. 멤버변수 선언
    JFrame f;
    JTextField tfName, tfId, tfGender, tfTel, tfAge, tfHome;
    JTextArea ta;
    JButton bAdd, bShow, bSearch, bDelete, bCancel, bExit;

    //2. 멤버변수 객체생성
    InfoView(){
        // 객체 생성
        f = new JFrame("DBTest");

        bAdd = new JButton("Add");
        bShow = new JButton("Show");
        bSearch = new JButton("Search");
        bDelete = new JButton("Delete");
        bCancel = new JButton("Cancel");
        bExit = new JButton("Exit");

        tfName = new JTextField(" ", 25);
        tfId = new JTextField(" ");
        tfTel = new JTextField(" ");
        tfGender = new JTextField(" ");
        tfAge = new JTextField(" ");
        tfHome = new JTextField(" ");

        ta = new JTextArea();

        //이미지 삽입
        try{
            bAdd.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("image/add.png"))));
            bShow.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("image/show.png"))));
            bSearch.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("image/search.png"))));
            bDelete.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("image/delete.png"))));
            bCancel.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("image/cancel.png"))));
            bExit.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("image/exit.png"))));
            System.out.println();
        }catch (Exception ex){
            System.out.println("no Image");
        }


    }

    //3. 화면 구성하고 출력
    /*
     * 전체 프레임 BorderLayout 지정
     *  - WEST : JPanel 붙이기 (GridLayout(6,2))
     *  - CENTER : TestArea
     *  - EAST : JPanel 붙이기 (GridLayout(1,6))
     */
    
    public void addLayout(){
        f.setLayout(new BorderLayout());

        //TextArea 생성
        JPanel pEast = new JPanel();
        pEast.add(ta);
        //TextArea 화면 출력
        f.add(pEast,BorderLayout.EAST);

        //TextField 생성
        JPanel pWest = new JPanel(new GridLayout(6,2)); // 그리드형식 레이아웃 -- 6행2열
        pWest.add(new JLabel("Name",JLabel.CENTER)); //label의 인적사항 + 가운데정렬
        pWest.add(tfName);
        pWest.add(new JLabel("ID",JLabel.CENTER));
        pWest.add(tfId);
        pWest.add(new JLabel("Tel",JLabel.CENTER));
        pWest.add(tfTel);
        pWest.add(new JLabel("Sex",JLabel.CENTER));
        pWest.add(tfGender);
        pWest.add(new JLabel("Age",JLabel.CENTER));
        pWest.add(tfAge);
        pWest.add(new JLabel("Home",JLabel.CENTER));
        pWest.add(tfHome);
        //Text field 화면 출력
        f.add(pWest,BorderLayout.WEST);

        //Button 생성
        JPanel pSouth = new JPanel(new GridLayout(1,6));
        pSouth.add(bAdd);
        pSouth.add(bShow);
        pSouth.add(bSearch);
        pSouth.add(bDelete);
        pSouth.add(bCancel);
        pSouth.add(bExit);
        //Button 화면 출력
        f.add(pSouth,BorderLayout.SOUTH);

       // 화면 출력
       f.setBounds(200,200,1200,650);
       f.setVisible(true);
       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

    }
    public static void main(String[] args) {
        InfoView info = new InfoView();
        info.addLayout();

    }
}