package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class JdbcEx03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("번호:");
		int num = sc.nextInt();
		System.out.print("이름:");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("나이:");
		int age = sc.nextInt();
		
//		String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE"; //이 세개는 자바정보들을 담아놓은것
//		String user = "java";
//		String password = "1234";

		try { // 트라이절은 예외가 발생 할 수도 있는 부분
			//Class.forName("oracle.jdbc.driver.OracleDriver");// forname은 오라클 드라이버를 사용할것이라고 명시
			Connection conn = DBManager.getConnection();// 자바와 연결된 상태

			String sql = "INSERT INTO tbl_study VALUES(?, ?, ?)";//물음표들을 사용했을때 동적인것이다.
			PreparedStatement pstmt = conn.prepareStatement(sql);// 값을 동적으로 바꿀수 있게해준다.
			pstmt.setInt(1, num);
			pstmt.setString(2, "name");
			pstmt.setInt(3, age);
			
			int result = pstmt.executeUpdate();// 자바가 sql한테 명령하는 부분, executeupdate가 실행하는것
			if(result > 0) {
				System.out.println("등록성공");
			}else {
				System.out.println("등록실패");
			}
					
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}
	}
}
