package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class JdbcEx04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("삭제할이름");
		String name = sc.nextLine();

		String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";  //DB에 연결
		String user = "java";
		String password = "1234";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");//드라이버 로드, 
			Connection conn = DriverManager.getConnection(url, user, password);//DB에 연결
			
			String sql = "DELETE FROM tbl_study "
						+"WHERE sname = ?";//SQL문 작성   /현재 미완성 돼있음 물음표가 있어서   /물음표 - 바인딩 변수 라고한다. 매개변수 같은것
			PreparedStatement pstmt = conn.prepareStatement(sql);//SQL문 작성
			pstmt.setString(1, name);//SQL문  완성
			
			int result = pstmt.executeUpdate();//작성된 SQL문 실행    /executeupdate 티켓, 이거 없으면 왔다갔다 ㄴㄴ
			if(result > 0 ) {
				System.out.println("삭제성공");
			} else {
				System.out.println("삭제실패");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}
	}
}
