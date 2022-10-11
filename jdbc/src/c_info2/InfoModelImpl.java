package c_info2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class InfoModelImpl implements infoModel {
	final static String DRIVER = "oracle.jdbc.driver.OracleDriver";	//상수로 지정할 경우 final static 사용, 변수명을 대문자로 지정
	//final static String URL = "jdbc:oracle:thin:@192.168.0.50:1521:xe";
	final static String URL = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	final static String USER = "scott";
	final static String PASS = "tiger";
	
	public InfoModelImpl() throws ClassNotFoundException {
		// 1. 드라이버 로딩
		Class.forName(DRIVER); //자바의 외적인 것과 연결할 경우 예외처리 필수
		System.out.println("드라이버 로딩 성공");
	}
	
	/*
	 * 사용자 입력값을 받아서 DB에 저장하는 역할
	 */
	@Override
	public void insertInfo(InfoVO vo) throws SQLException {
		// 2. 연결객체 얻어오기
		Connection con=null;
		PreparedStatement ps = null; // 변수 선언은 블럭 바깥에, 사용은 블럭 안에서
		try {
		con = DriverManager.getConnection(URL,USER, PASS);
		
		// 3. sql 문장 (#)
		String sql = "INSERT INTO info_tab(name, jumin, tel, gender, age, home) "
				+ " VALUES (?,?,?,?,?,?)";
		
		// 4. 전송객체
		ps = con.prepareStatement(sql);
		
		// ? 세팅 (#)
		ps.setString(1, vo.getName());
		ps.setString(2, vo.getId());
		ps.setString(3, vo.getTel());
		ps.setString(4, vo.getGender());
		ps.setInt(5, vo.getAge());
		ps.setString(6, vo.getHome());
		
		
		// 5. 전송
		ps.executeUpdate();
		
		} finally {
		// 6. 닫기
		ps.close();
		con.close();
		}
	}
	
	@Override
	public ArrayList<InfoVO> selectAll() throws SQLException {
		// 2. 연결객체 얻어오기
		Connection con=null;
		PreparedStatement ps = null; // 변수 선언은 블럭 바깥에, 사용은 블럭 안에서
		ResultSet rs = null;
		try {
			con = DriverManager.getConnection(URL,USER, PASS);

		//3. SQL 문장
		String sql = "SELECT * FROM info_tab";
		
		//4. 전송객체 만들기
		ps = con.prepareStatement(sql);
		
		//5. 전송
		rs = ps.executeQuery();
		
		ArrayList<InfoVO >list = new ArrayList<InfoVO>();
		
		while(rs.next()) {
			InfoVO vo = new InfoVO();
			vo.setName(rs.getString("name"));
			vo.setId(rs.getString("jumin"));
			vo.setTel(rs.getString("tel"));
			vo.setGender(rs.getString("gender"));
			vo.setAge(rs.getInt("age"));
			vo.setHome(rs.getString("home"));
			
			list.add(vo);
			
		}//while
		return list;
		
		} finally {
		// 6. 닫기
			rs.close();
			ps.close();
			con.close();
		}// finally
	}//selectAll()

	@Override
	public InfoVO selectByTel(String tel) throws SQLException {
		// 2. 연결객체 얻어오기
		Connection con=null;
		PreparedStatement ps = null;
		InfoVO vo = new InfoVO();
		try {
			con = DriverManager.getConnection(URL,USER, PASS);
			// 3. sql 문장
			String sql ="SELECT * FROM info_tab WHERE tel=?";
			
			// 4. 전송객체 얻어오기
			ps = con.prepareStatement(sql);
			ps.setString(1, tel);
			
			// 5. 전송
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				vo.setName(rs.getString("name"));
				vo.setId(rs.getString("jumin"));
				vo.setTel(rs.getString("tel"));
				vo.setGender(rs.getString("gender"));
				vo.setAge(rs.getInt("age"));
				vo.setHome(rs.getString("home"));
			}
			
		} finally {
			// 6. 닫기
			ps.close();
			con.close();
		}//End of try/finally
		return vo;
	}//selectByTel

	/*
	 * 메소드명 	: delete
	 * 인자 		: 전화번호
	 * 리턴값 	: 삭제한 행 수 
	 * 역할 		: 전화번호를 넘겨받아 해당 전화번호의 레코드를 삭제
	 */
	public int delete(String tel) throws SQLException {
		// 2. 연결객체 얻어오기
		Connection con=null;
		PreparedStatement ps = null;
		int count=0;
		try {
			con = DriverManager.getConnection(URL,USER, PASS);
			// 3. sql 문장
			String sql ="DELETE FROM info_tab WHERE tel=?";

			// 4. 전송객체 얻어오기
			ps = con.prepareStatement(sql);
			ps.setString(1, tel);

			// 5. 전송
			count = ps.executeUpdate();
			

		} finally {
			// 6. 닫기
			ps.close();
			con.close();
		}//End of try/finally
		
		return count;
	}//delete

	@Override
	public void editInfo(InfoVO vo) throws SQLException {
		// 2. 연결객체 얻어오기
		Connection con=null;
		PreparedStatement ps = null;
		try {
			con = DriverManager.getConnection(URL,USER, PASS);
			// 3. sql 문장
			String sql ="UPDATE info_tab SET name = ?, jumin=?,"
					+ " gender = ?, age=?, home=? "
					+ " WHERE tel = ?";

			// 4. 전송객체 얻어오기
			ps = con.prepareStatement(sql);
			ps.setString(1, vo.getName());
			ps.setString(2, vo.getId());
			ps.setString(3, vo.getGender());
			ps.setInt(4, vo.getAge());
			ps.setString(5, vo.getHome());
			ps.setString(6, vo.getTel());

			// 5. 전송
			ps.executeUpdate();

		} finally {
			// 6. 닫기
			ps.close();
			con.close();
		}//End of try/finally

	}

}//End of InfoModelImpl
