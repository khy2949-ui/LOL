package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MemberList {
	public static void main(String[] args) {
		
		String dbUrl = "jdbc:mysql://localhost:3306/library?serverTimezone=Asia/Seoul";
		String dbUsr = "library";
		String dbPwd = "1234";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		// 예외처리
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(dbUrl, dbUsr, dbPwd);
			// -------------------------------------------------			
			String sql = "select * from members order by id desc";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String birth = rs.getString("birth");
				String phone = rs.getString("phone");
				String email = rs.getString("email");
				String password = rs.getString("password");
				System.out.printf("%s \t %s \t %s \t %s \t %s \t %s\n",id, name, birth, phone, email, password);
			}			
			// -------------------------------------------------			
		} catch(Exception e) {
			System.out.println("데이터 베이스 접속 실패 또는 로딩 실패ㅠ");
		} finally {
			try {
				if (rs != null) { rs.close(); }
				if (pstmt != null) { pstmt.close(); }
				if (conn != null) { conn.close(); }			
				} catch(Exception e) {					
					e.printStackTrace();								
			}
		}
		System.out.println("-- 프로그램 종료 --");
		

	}

}
