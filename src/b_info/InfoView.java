package b_info;

import java.util.Calendar;
import java.awt.*;
import java.awt.event.*;

//import javax.imageio.ImageIO;
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

		bAdd = new JButton("Add");									// 추가버튼
		bShow = new JButton("Show");								// 전체보기 버튼
		bSearch = new JButton("Search");							// 검색 버튼
		bDelete = new JButton("Delete");							// 삭제 버튼
		bCancel = new JButton("Cancel");							// 취소 버튼
		bExit = new JButton("Exit (alt + x)",						// 나가기 버튼 
				new ImageIcon("src\\b_info\\imgs\\exit.png"));


		bExit.setHorizontalTextPosition(JButton.CENTER);	// 수직으로 정렬
		bExit.setVerticalTextPosition(JButton.BOTTOM);		// 글씨를 아래쪽에 놓음

		bExit.setRolloverIcon(new ImageIcon("src\\b_info\\imgs\\cancel.png")); // 마우스를 올렸을 때
		bExit.setPressedIcon(new ImageIcon("src\\b_info\\imgs\\delete.png")); // 마우스 클릭했을 때
		bExit.setToolTipText("프로그램을 종료합니다.");	// 풍선도움말 - 툴팁 설정 : 마우스를 올려놓으면 설명창이 나타남

		bExit.setMnemonic('x'); // 단축키 설정 -- 기본으로 alt와 결합해서 사용


		tfName = new JTextField(" ", 25);
		tfId = new JTextField("");
		tfTel = new JTextField(" ");
		tfGender = new JTextField(" ");
		tfAge = new JTextField(" ");
		tfHome = new JTextField(" ");

		ta = new JTextArea();



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

	// 이벤트 처리 함수
	public void eventProc() {

		//버튼이 눌렸을 때의 이벤트 처리
		bAdd.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Add 버튼 클릭");
			}
		});
		bShow.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Show 버튼 클릭");
			}
		});
		bSearch.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Search 버튼 클릭");
			}
		});
		bDelete.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Delete 버튼 클릭");
			}
		});
		bCancel.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Cancel 버튼 클릭");
			}
		});
		bExit.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Exit 버튼 클릭");
			}
		});

		//주민번호 입력창에서 엔터 쳤을 때
		tfId.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				getJuminInfo();
			}//end of actionPerformed
		});//end of addActionListener

		//주민번호 입력창에서 포커스 이벤트 발생했을 때
		tfId.addFocusListener(new FocusListener() {

			public void focusLost(FocusEvent e) {
				getJuminInfo();
			}//end of focusLost

			public void focusGained(FocusEvent e) {

			}

		}//end of FocusListener			
		);//end of addFocusListener
	}//end of eventProc()
	
	void getJuminInfo() {
		String jumin = tfId.getText();						// 해당 text area의 내용을 받아옴
		if(jumin.length() < 14) {
			JOptionPane.showMessageDialog(null, "- 을 포함한 14자를 맞춰주세요.");
			return;
		}//if

		//(1) 주민번호의 7번째 문자로 성별을 구하여 성별창에 출력

		if (jumin.charAt(7)=='2' || jumin.charAt(7)=='4') {
			tfGender.setText("여자");
		} else if (jumin.charAt(7)=='1' || jumin.charAt(7)=='3') {
			tfGender.setText("남자");
		}//if

		//(2) 주민번호의 8번째 문자로 출신지를 구하여 출신지창에 출력

		//		if (jumin.charAt(8)=='0') {
		//			tfHome.setText("서울");
		//			}

		switch(jumin.charAt(8)) {
		case '0' :
			tfHome.setText("서울"); break;
		case '1':
			tfHome.setText("부산"); break;
		case '2':
			tfHome.setText("경기"); break;
		case '3':
			tfHome.setText("강원"); break;
		default :
			tfHome.setText("이외 지역"); break;
		}//switch

		//(3) 주민번호에서 년도에 의해 나이를 구해서 나이창에 출력 
		int year = 0;
		if (jumin.charAt(7)=='1' || jumin.charAt(7)=='2') {				// 2000년 이전 출생일 경우, 19xx년으로 입력받음
			year = 1900 + Integer.parseInt(jumin.substring(0, 2));		
		} else if (jumin.charAt(7)=='3' || jumin.charAt(7)=='4') {		// 2000년 이후 출생일 경우, 20xx년으로 입력받음
			year = 2000 + Integer.parseInt(jumin.substring(0, 2));
		}//if

		Calendar c = Calendar.getInstance();									// Calendar 클래스 이용- 현재 년도 받아옴
		int current = c.get(Calendar.YEAR);
		int age = current - year+1;												// 나이 계산 = 현재년도 - 출생년도 + 1

		tfAge.setText(String.valueOf(age));									// Text Field에 값 출력

	}//end of getJuminInfo()

	public static void main(String[] args) {
		InfoView info = new InfoView();
		info.addLayout();
		info.eventProc();

	}
}