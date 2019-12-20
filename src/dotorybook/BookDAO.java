package dotorybook;
//dao 3  객체들 생성하고 메서드 일곱게 만들기
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class BookDAO {
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	ArrayList<BookDTO> list = new ArrayList<>();
	
	public void bookInsert(BookDTO bDto) {
		try {
			conn = DBManager.getConnection();
			String sql = "INSERT INTO tbl_book(bno, bname, price, company, writer) "
						+ "VALUES(seq_book.NEXTVAL, ?,?,?,?)";//시퀀스 북도 하나로 카운트
			// 인서트 쿼리문은 INSERT INTO 테이블명(매개변수) 
			// 밸류스(위값의 매개변수와 각각 매칭);
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, bDto.getBname());
			pstmt.setInt(2, bDto.getPrice());
			pstmt.setString(3, bDto.getCompany());
			pstmt.setString(4, bDto.getWriter());
			
			int result = pstmt.executeUpdate();// 값을 받아서 데이터베이스에 업데이트시,
											   // 매개변수를 받지않는다.
			if(result>0) {
			System.out.println("●●"+bDto.getBname()+"등록했습니다!!!");
			System.out.println("●●등록성공");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			
		}
		
	}
	public void bookUpdate(BookDTO bDto) {
		try {
			conn = DBManager.getConnection();
			String sql = "UPDATE tbl_book SET bname = ?,"+ "price = ?," + 
						"company = ?," + "writer = ? "
								+ "WHERE bno=?" ;
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, bDto.getBname());
			pstmt.setInt(2, bDto.getPrice());
			pstmt.setString(3, bDto.getCompany());
			pstmt.setString(4, bDto.getWriter());
			pstmt.setString(5, bDto.getBno());
			int result = pstmt.executeUpdate();
			if(result > 0) {
				System.out.println("수정성공!!");
			}else {
				System.out.println("수정실패....");
			}

						
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void bookDelete(String bno) {
		try {
			conn = DBManager.getConnection();
			String sql = "DELETE tbl_book " + "WHERE bno = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, bno);
			
			int result = pstmt.executeUpdate();
			if(result > 0) {
				System.out.println("삭제성공!!");
			}else {
				System.out.println("삭제실패....");
			}
	
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			
		}
	}
	public void bookSelect() {
		try {
			conn = DBManager.getConnection();
			String sql = "SELECT * FROM tbl_book";//전체 다 출력할거니까
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();//셀렉트문만 쿼리
			
			while(rs.next()) {
				     String bno = rs.getString("bno"); 
				     String bname = rs.getString("bname"); 
				     int price = rs.getInt("price"); 
				     String company = rs.getString("company"); 
				     String writer = rs.getString("writer"); 
				     Date regdate = rs.getDate("regdate");
				     BookDTO bDto = new BookDTO(bno, bname, price, company, writer, regdate);
				     list.add(bDto);
			}
			for(BookDTO line : list) {
				System.out.print(line.getBno() + "\t");
				System.out.print(line.getBname() + "\t");
				System.out.print(line.getPrice() + "\t");
				System.out.print(line.getCompany() + "\t");
				System.out.print(line.getWriter() + "\t");
				System.out.print(line.getRegdate() + "\t");
				System.out.println();
				
				
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			
		}
		
	}
	public void bookSerach(String bname) {
		try {
		conn = DBManager.getConnection();
		String sql = "SELECT * FROM tbl_book "
					+"WHERE bname LIKE ?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1,"%"+ bname + "%");
		rs = pstmt.executeQuery();
		
		while(rs.next()) {
			String bno = rs.getString("bno");
			bname = rs.getString("bname");
			int price  = rs.getInt("price");
			String company = rs.getString("company");
			String writer = rs.getString("writer");
			Date regdate = rs.getDate("regdate");
			BookDTO bDto = new BookDTO(bno, bname, price, company, writer, regdate);
			list.add(bDto);
		}
		for(BookDTO line : list) {
			System.out.println(line.toString());
		}
		
				
		
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void madeby() {}
	
	
	
	
	
}//class
