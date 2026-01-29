package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class MemberDelete {
	public static void delete(Connection conn, Scanner sc) {
		System.out.print("삭제할 회원번호 : ");
		int id = sc.nextInt();
		
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
			
		try {			
			// -------------------------------------------------
			String sql = "delete from members where id = ?"; 								
			pstmt = conn.prepareStatement(sql);			
			pstmt.setInt(1, id);		
			int result = pstmt.executeUpdate(); // 0, 1
			if(result > 0) {
				System.out.println("삭제성공 - " + result);
			} else {
				System.out.println("삭제실패 - " + result);
			}
			// -------------------------------------------------			
		} catch(Exception e) {
			System.out.println("데이터 베이스 접속 실패 또는 로딩 실패ㅠ");
		} finally {
			try {
				if (rs != null) { rs.close(); }
				if (pstmt != null) { pstmt.close(); }
//				if (conn != null) { conn.close(); }			
				} catch(Exception e) {
					e.printStackTrace();								
			}
		}
	}

}
