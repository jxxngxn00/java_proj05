package d_calculator;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CalTest {

	//1. 멤버변수 선언
	JFrame f;
	JTextField tf;
	JButton []bNum = new JButton[10];   // 0~ 9 숫자 표현할 버튼
	JButton []bOp = new JButton[4];   // +, -, *, / 연산자를 표현할 버튼
	JButton bEqual;

	String []op = {"+","-","*","/"};

	String val1, val2, sign;
	int res=0;

	//2. 객체 생성
	CalTest(){
		f = new JFrame("유치원 ...");

		//숫자 버튼
		for(int i=0;i<bNum.length;i++) {
			bNum[i] = new JButton(String.valueOf(i));
		}//for

		//연산자 버튼
		for(int i=0;i<bOp.length;i++) {
			bOp[i] = new JButton(op[i]);
		}

		// = 버튼
		bEqual = new JButton("=");

		// 숫자 입력 창
		tf = new JTextField("");

	}//end of CalTest

	//3. 화면 구성 및 화면출력
	void addLayout() {
		f.setLayout(new BorderLayout());
		f.add(tf, BorderLayout.NORTH);

		//버튼 구역 생성 -- 5행 3열
		JPanel pSouth = new JPanel(new GridLayout(5,3));
		//1~9까지의 버튼 지정
		for(int i=1;i<bNum.length;i++) {
			pSouth.add(bNum[i]);
		}//end of for

		// 0, 연산자, = 버튼 지정
		for(int i=0;i<bOp.length;i++) {
			pSouth.add(bOp[i]);
			if(i==0) {
				pSouth.add(bNum[0]);
				pSouth.add(bEqual);
			}
		}

		//버튼 출력
		f.add(pSouth, BorderLayout.CENTER);

		//화면 출력
		f.setBounds(100, 100, 300, 300);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}//end of addLayout()

	//4. 이벤트 처리
	void eventProc() {


		//숫자 버튼이 눌렸을 때
		for(int i=0;i<bNum.length;i++) {
			bNum[i].addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					// 이벤트가 발생한 컴포넌트의 참조를 얻어옴.
					JButton eBtn = (JButton)e.getSource();
					String su;
					if(tf.getText().equals("+")||tf.getText().equals("-")||			// 이전에 연산자를 눌렀을 경우
							tf.getText().equals("*")||tf.getText().equals("/")) {
						su = eBtn.getText();												// 새로 수를 입력받음
					} else {
						su = tf.getText() + eBtn.getText();							// 아닌 경우 이어서 계속 수를 입력받음
					}

					val1 = su;						// 계산용 변수 저장
					tf.setText(su);					// 텍스트필드에 값 출력
				}//end of actionPerformed
			});//end of addActionListener
		}

		//연산자 버튼이 눌렸을 때
		for(int i=0;i<bOp.length;i++) {
			bOp[i].addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					// 이벤트가 발생한 컴포넌트의 참조를 얻어옴.
					JButton eBtn = (JButton)e.getSource();
					String eOp = eBtn.getText();
					sign = eOp;					// 계산용 변수 저장
					tf.setText(eOp);				// 텍스트필드에 값 출력

					if(val1 != null) {				// 처음 값을 입력한 경우
						val2 = val1;
						res = Integer.parseInt(val2);
						val1 = null;
					}else if(val1 == null) {	// 이전에 계산된 값이 있을 경우 / 이전에 이미 계산 한 경우
						val2 = String.valueOf(res);
					}

				}//end of actionPerformed
			});//end of addActionListener
		}

		// =이 눌렸을 때
		bEqual.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				
				//사칙연산
				if(sign.equals("+")) {
					res += Integer.parseInt(val1);
				}else if(sign.equals("-")) {
					res -= Integer.parseInt(val1);
				}else if(sign.equals("*")) {
					res *= Integer.parseInt(val1);
				}else if(sign.equals("/")) {
					res /= Integer.parseInt(val1);
				}
				tf.setText(String.valueOf(res));
				
				//연산 후 계산용 변수 초기화 
				val1 = null;

			}//end of actionPerformed
		});//end of addActionListener

	}//end of eventProc()

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalTest cal = new CalTest();
		cal.addLayout();
		cal.eventProc();
	}//end of main

}