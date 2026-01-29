package exam08;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class MemberList2 {
	public static void main(String[] args) {
		
		List<MemberDTO> list = new ArrayList<>();
		
		String dbUrl = "jdbc:mysql://localhost:3306/javaExample?serverTimezone=Asia/Seoul";
		String dbUsr = "javaUser";
		String dbPwd = "1234";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
				
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(dbUrl, dbUsr, dbPwd);
			// -------------------------------------------------			
			String sql = "select * from member order by no desc";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {				
				MemberDTO memberDTO = new MemberDTO(); // new 라는 연산자는 새로 만들라는 뜻
				memberDTO.setNo(rs.getInt("no"));
				memberDTO.setId(rs.getString("id"));
				memberDTO.setPassword(rs.getString("password"));
				memberDTO.setName(rs.getString("name"));
				memberDTO.setPhone(rs.getString("phone"));
				memberDTO.setCreatedDate(rs.getDate("createdDate"));
				
				list.add(memberDTO);				
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
		
		// [주소, 주소, 주소, 주소, 주소, 주소, 주소]
		
		for(int i=0; i<list.size(); i++) {
//			MemberDTO dto = list.get(i);
			// String id = dto.getId();
			// System.out.printf("%s \t %s \t %s \t %s \t %s\n",dto.getNo(), dto.getId(), dto.getName(), dto.getPassword(), dto.getCreatedDate());
//			System.out.printf("%s \t %s \t %s \t %s \t %s\n",list.get(i).getNo(), list.get(i).getId(), list.get(i).getName(), list.get(i).getPassword(), list.get(i).getCreatedDate());
			System.out.println(i + ". " + list.get(i)); 
		}
		
	}
}
