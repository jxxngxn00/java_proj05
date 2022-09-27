package c_sample;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

/*
 *   화면(JFrame)에 '확인' 버튼 하나 출력
 */

public class EventTest3 {
	JFrame f;
	JButton btn;
	
	EventTest3(){
		f= new JFrame("EventTest3");
		btn = new JButton("확인3");
	
	// (1) 이벤트 핸들러 만들기
	// (2) 핸들러 객체 생성
	// (3) 이벤트 발생할 컴포넌트와 연결 -- 여기에서는 버튼(btn)
	// => 동시에 발생
		btn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "이벤트발생3");
			}
		});
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
		EventTest3 e = new EventTest3();
		e.addLayout();
	}

}
