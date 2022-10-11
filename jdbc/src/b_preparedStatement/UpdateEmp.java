package b_preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class UpdateEmp {

	public static void main(String[] args) {
		//입력값
		int sabun = 7698;
		String saname = "아무개";
		int salary = 15000;

		// 7698 사원의 이름과 월급을 변경하세요

		// 1. 드라이버 로딩
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 성공");

			// 2. 연결객체 얻어오기
			String url = "jdbc:oracle:thin:@192.168.0.35:1521:xe";
			String user = "scott";
			String pass = "tiger";

			Connection con = DriverManager.getConnection(url, user, pass);
			System.out.println("디비 연결 성공");
			
			// 3. SQL 문장
			//String sql = "UPDATE emp SET ename = '"+saname+"', sal ='"+salary+"' WHERE empno = "+sabun;
			String sql = "UPDATE emp SET ename = ?, sal =? WHERE empno = ?";
			
			// 4. SQL 전송 객체 **************
			PreparedStatement stmt = con.prepareStatement(sql);	// 먼저 넣어놓음
			stmt.setString(1, saname);
			stmt.setInt(2, salary);
			stmt.setInt(3, sabun);



			// 5. SQL 전송
			/*		- ResultSet executeQuery()		: SELECT
			 * 		- int executeUpdate()	: INSERT / DELETE / UPDATE
			 */
			int result = stmt.executeUpdate(); // sql 넣지 않음 : 이미 sql 연결함
			System.out.println(result + "행을 실행");

			// 6. 닫기
			stmt.close();
			con.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("DB 실패 : " + e);
		}//End of try/catch

	}

}
