package project;

import java.awt.*;
// import javax.swing.event.*;
import java.util.ArrayList;
import javax.swing.*;

public class Korean extends JPanel{
	
	//객체 생성
	JPanel p = new JPanel();
	
	JButton[] kBtn = new JButton[9];							//메뉴 버튼 구성
	JLabel[] kMenu = new JLabel[9];								//메뉴 입력 Label
	
	String[] menuName = {"김치찌개","된장찌개","제육볶음","비빔밥",
			"갈비탕","설렁탕","라면","동태찌개","쫄면"};	      //메뉴 이름 배열
	
	String[] price = {"7000원","7000원","7000원","7000원","8000원","7500원",
			"4000원","8000원","7000원"};						//메뉴 가격 배열

	ArrayList <PayVO> list = new ArrayList<PayVO>();			//선택한 메뉴 정보 넘길 VO 생성
	MainTest parent;
	
	public Korean(MainTest mainTest) {
		parent = mainTest;
		//메뉴 버튼 생성
		for(int i=0;i<kBtn.length;i++) {
			String imgSrc = "C:\\JI\\공부\\kosmo\\java\\project\\kor_imgs\\"+String.valueOf(i)+".PNG";
			String name = menuName[i] +" / "+ price[i];				// 메뉴이름 + 가격을 동시에 나타냄
			ImageIcon icon = new ImageIcon(imgSrc);					
			Image resizeImage = imageResize(icon, 50, 50);	 // 이미지 크기 조절
			kBtn[i] = new JButton(name, new ImageIcon(resizeImage));// 버튼에 메뉴와 아이콘 삽입
			kBtn[i].setHorizontalTextPosition(JButton.CENTER);		// 수직으로 정렬
			kBtn[i].setVerticalTextPosition(JButton.BOTTOM);		// 글씨를 아래쪽에 놓음
		}//for
		
		
		addLayout();
		// eventProc();

	}//end of Korean
	
	void addLayout() {
		setLayout(new GridLayout(3, 3));	// 3행 3열 그리드
		
		for(int i=0;i<kBtn.length;i++) {			   // 그리드에 맞춰 버튼 추가
			add(kBtn[i]);
		}//for
		
	}//addLayout()
	
	// void eventProc() {
	// 	PayVO p = new PayVO();
	// 	for(int i=0;i<kBtn.length;i++) {
	// 		kBtn[i].addActionListener(new ActionListener(){
	// 			public void actionPerformed(ActionEvent e) {
	// 				// 이벤트가 발생한 컴포넌트의 참조를 얻어옴.
	// 				JButton eBtn = (JButton)e.getSource();
	// 				p.setMenu(eBtn.getText());
	// 				list.add(p);
	// 				showRes();
	// 			}//end of actionPerformed
	// 		});//end of addActionListener
	// 	}//for
	// }//eventProc
	
	//버튼에 들어갈 아이콘 이미지 크기 변환 메소드
	Image imageResize(ImageIcon icon, int x, int y){
		Image image = icon.getImage();//아이콘에서 이미지를 불러옴
		Image resizeImage = image.getScaledInstance(x,y,java.awt.Image.SCALE_SMOOTH); //이미지 화질을 최대한 보존하면서 크기 조정
		return resizeImage;//크기 조정된 이미지 반환
	}
	}//end of Korean

