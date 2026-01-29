package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class logIn {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("이메일 입력 : ");
		String email = sc.nextLine();
		System.out.print("비밀번호 입력 : ");
		String password = sc.nextLine();
		
		sc.close();
		
		String dbUrl = "jdbc:mysql://localhost:3306/library?serverTimezone=Asia/Seoul";
		String dbUsr = "library";
		String dbPwd = "1234";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(dbUrl, dbUsr, dbPwd);
			// -------------------------------------------------
			String sql = "select * from members where email = ?"; 								
			pstmt = conn.prepareStatement(sql);			
			pstmt.setString(1, email);			
			rs = pstmt.executeQuery(); // 0, 1
			if(rs.next()) {
				String dbPassword = rs.getString("password");
				if (dbPassword.equals(password)) {	
					System.out.println("로그인 성공!");
				} else {
					System.out.println("이메일 또는 비밀번호를 잘못 입력되었습니다.");
				}			
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
