package c_info2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.*;

public class InfoView {
	
    //1. 멤버변수 선언
    JFrame f;
    JTextField tfName, tfId, tfGender, tfTel, tfAge, tfHome;
    JTextArea ta;
    JButton bAdd, bShow, bSearch, bDelete, bCancel, bExit;

    // 비지니스 로직 - 모델단
    infoModel model;
    
    //2. 멤버변수 객체생성
    InfoView(){
        // 객체 생성
        f = new JFrame("DBTest");

        bAdd = new JButton("Add");
        bShow = new JButton("Show");
        bSearch = new JButton("Search");
        bDelete = new JButton("Delete");
        bCancel = new JButton("Cancel");
        bExit = new JButton("수정하기");

        tfName = new JTextField("", 25);
        tfId = new JTextField("");
        tfTel = new JTextField("");
        tfGender = new JTextField("");
        tfAge = new JTextField("");
        tfHome = new JTextField("");

        ta = new JTextArea();
        
        // 모델객체 생성
        try {
			model = new InfoModelImpl();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

    }//End of InfoView()

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

    }//End of addLayout()
    
    void eventProc() {
    	// Add 버튼이 눌렸을 때
    	bAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				insertData();
			}// actionPerformed()
		});// addActionListener()
    	
    	// Show 버튼이 눌렸을 때
    	bShow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectAll();
			}// actionPerformed()
		});// addActionListener()
    	
    	// Search 버튼이 눌렸을 때
    	bSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectByTel();
			}// actionPerformed()
		});// addActionListener()
    	
    	// text field Tel에서 엔터를 눌렀을 때
    	tfTel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectByTel();
			}// actionPerformed()
		});// addActionListener()
    	
    	// Delete 버튼이 눌렸을 때
    	bDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				deleteByTel();
				
			}// actionPerformed()
		});// addActionListener()
   
    	// Exit 버튼이 눌렸을 때
    	bExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				edit();
			}// actionPerformed()
		});// addActionListener()
    }//eventProc()
    
    void insertData() {
    	// (1) 사용자 입력값 얻어오기
    	String name = tfName.getText();
    	String id = tfId.getText();
    	String tel = tfTel.getText();
    	String gender = tfGender.getText();
    	int age = Integer.parseInt(tfAge.getText());
    	String home = tfHome.getText();
    	// (2) 1번의 값들을 InfoVO()에 지정 -- (1) 생성자 이용 (2) setter 
    	InfoVO vo = new InfoVO();
    		//(1) InfoVO vo = new InfoVO(name, id, tel, gender, age, home);
    	vo.setName(name);
    	vo.setId(id);
    	vo.setTel(tel);
    	vo.setGender(gender);
    	vo.setAge(age);
    	vo.setHome(home);

    	// (3) 모델의 insertInfo() 호출
    	try {
			model.insertInfo(vo);
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	// (4) 화면의 입력값들을 지우기
    	clearText();
    }//insertData
    
    void clearText() {
    	tfName.setText(null);
    	tfId.setText(null);
    	tfTel.setText(null);
    	tfGender.setText(null);
    	tfAge.setText(null);
    	tfHome.setText(null);
    }//clearText
    
    void selectAll() {
    	try {
			ArrayList<InfoVO> data = model.selectAll();
			ta.setText("----검색결과---- \n\n");
			for(InfoVO vo : data) {
				ta.append(vo.toString());
			}
		} catch (SQLException e) {
			ta.setText("검색실패 : "+e.getMessage());
		}
    }
    
    void selectByTel() {
    	try {
    		// (1) 입력한 전화번호 값을 얻어오기
    		String tel = tfTel.getText();
    		
    		// (2) 모델단에 selectByTel() 호출
			InfoVO vo = model.selectByTel(tel);
			
			// (3) 받은 결과를 각각의 텍스트필드에 지정 (출력)
			tfName.setText(vo.getName());
			tfId.setText(vo.getId());
			tfGender.setText(vo.getGender());
			tfAge.setText(Integer.toString(vo.getAge()));
			tfHome.setText(vo.getHome());
			
		} catch (Exception e) {
			ta.setText("전화번호 검색실패 : "+e.getMessage());
		}//end of try
    }//end of selectByTel();
    
    void deleteByTel() {
    	// (1) 입력한 전화번호 값을 얻어오기
    	String tel = tfTel.getText();
    	// (2) 모델단에 deleteByTel() 호출
    	try {
    		int result = model.delete(tel);
    		ta.setText(result+"행이 삭제");
    		
    		
    		// (3) 화면을 지움.
    		clearText();
    		
    	} catch (SQLException e) {
    		ta.setText("삭제실패 : "+e.getMessage());
    	}
    }

    void edit() {
    	// (1) 사용자 입력값 얻어오기
    	// (2) 1번의 값들을 InfoVO()에 지정
    	InfoVO vo = new InfoVO();
    	vo.setName(tfName.getText());
    	vo.setId(tfId.getText());
    	vo.setTel(tfTel.getText());
    	vo.setGender(tfGender.getText());
    	vo.setAge(Integer.parseInt(tfAge.getText()));
    	vo.setHome(tfHome.getText());

    	// (3) 모델의 editInfo() 호출
    	try {
			model.editInfo(vo);
			selectAll();
		} catch (SQLException e) {
			ta.setText("수정 실패 : "+e.getMessage());
		}
    	// (4) 화면의 입력값들을 지우기
    	clearText();
    }//edit()
public static void main(String[] args) {
        InfoView info = new InfoView();
        info.addLayout();
        info.eventProc();
    }
}