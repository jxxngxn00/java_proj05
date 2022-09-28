package project;

import java.awt.BorderLayout;
// import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;


public class MainTest {

	JFrame f;
	JLabel title;
	JTextArea ta;
	JButton pay;
	
	Korean panelK;
	
	MainTest(){
		f = new JFrame("kosmo 휴게소");
		
		title =new JLabel("Kosmo 휴게소");
		ta = new JTextArea();
		pay = new JButton("결제하기");
		panelK = new Korean(this);
	}
	
	void addLayout() {
		f.setLayout(new BorderLayout());
		f.add(title, BorderLayout.NORTH);
		
		JTabbedPane tab = new JTabbedPane();
		tab.addTab("한식", panelK);
		f.add(tab,BorderLayout.CENTER);
		
		f.add(ta,BorderLayout.SOUTH);
		f.add(pay,BorderLayout.SOUTH);
		
		f.setBounds(100, 100, 500, 400);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	void eventProc() {
		
	}//end of eventProc
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainTest test = new MainTest();
		test.addLayout();
	}

}
