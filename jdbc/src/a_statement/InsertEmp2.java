package a_statement;

import java.sql.*;

public class InsertEmp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// project Properties -> Build Path -> Add External JARs -> oracle 설치 폴더에서 ojdbc6.jar 선택
		try {
			// 1. 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 성공");
			
			// 2. 연결객체 얻어오기
			String url = "jdbc:oracle:thin:@192.168.0.35:1521:xe";
			String user = "scott";
			String pass = "tiger";
			
			Connection con = DriverManager.getConnection(url, user, pass);
			System.out.println("디비 연결 성공");
			
			//---입력값
			String bonmyeong = "본명";
			int wolgup = 10000;
			String jikup = "IT";
			
			// 3. SQL 문장
			//		10번 부서의 사원의 월급을 10% 인상
			String sql = "INSERT INTO emp(empno, ename, sal, job) "
					+ " VALUES (seq_temp2.nextval, '"+bonmyeong+"', "+Integer.toString(wolgup)+", '"+jikup+"')"; 
			
			//String sql = "UPDATE emp SET sal = sal * 1.1 WHERE deptno = 10";

			//월급이 10000 이상인 사원을 삭제
			//String sql = "DELETE FROM emp WHERE sal >= 10000";
			
			
			// 4. SQL 전송 객체
			Statement stmt = con.createStatement();
			
			// 5. SQL 전송
			/*		- ResultSet executeQuery()		: SELECT
			 * 		- int executeUpdate()	: INSERT / DELETE / UPDATE
			 */
			int result = stmt.executeUpdate(sql);
			System.out.println(result + "행을 실행");
			
			// 6. 닫기
			stmt.close();
			con.close();
			
		} catch (Exception e) {
			System.out.println("DB 실패 : " + e);
		}//End of try/catch
	}

}
