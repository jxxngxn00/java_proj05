package c_sample;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

/*
 *   화면(JFrame)에 '확인' 버튼 하나 출력
 */

public class EventTest {
	JFrame f;
	JButton btn;
	
	EventTest(){
		f= new JFrame("EventTest");
		btn = new JButton("확인");
		
	// (2) 핸들러 객체 생성
		MyHandler hdlr = new MyHandler();
		
	// (3) 이벤트 발생할 컴포넌트와 연결 -- 여기에서는 버튼(btn)
		btn.addActionListener(hdlr);
	}
	
	// (1) 이벤트 핸들러 만들기
	//		-- 핸들러 : 이벤트 처리하는 클래스
	class MyHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "이벤트발생");
			
		}
		
	}
	
	public void addLayout() {
		f.setLayout(new FlowLayout());	// 한 줄로 배치 
		
		f.add(btn);
		
		f.setBounds(100,100,500,350);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventTest e = new EventTest();
		e.addLayout();
	}

}
