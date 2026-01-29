package exam30;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class StudentDAO {
	String dbDRv = "com.mysql.cj.jdbc.Driver";
	String dbUrl = "jdbc:mysql://localhost:3306/javaExample?serverTimezone=Asia/Seoul";
	String dbUsr = "javaUser";
	String dbPwd = "1234";
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	private void dbClose(ResultSet rs, PreparedStatement pstmt, Connection conn) {
		try {
			if (rs != null) { rs.close(); }
			if (pstmt != null) { pstmt.close(); }
			if (conn != null) { conn.close(); }			
		} catch(Exception e) {					
			e.printStackTrace();								
		}
	}
	public List<StudentDTO> getSelectAll() {
		List<StudentDTO> list = new ArrayList<>();		
	
			
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(dbUrl, dbUsr, dbPwd);
			// -------------------------------------------------			
			String sql = "select * from student order by hakbun desc";			
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				StudentDTO dto = new StudentDTO();
				dto.setHakbun(rs.getInt("hakbun"));
				dto.setName(rs.getString("name"));
				dto.setSsn(rs.getString("ssn"));
				dto.setAddress(rs.getString("address"));
				dto.setCreatedDate(rs.getDate("createdDate"));
				list.add(dto);
			}			
			// -------------------------------------------------			
		} catch(Exception e) {
			System.out.println("드라이버 로딩 실패 실패 또는 접속 실패ㅠ");
		} finally {			
			dbClose(rs, pstmt, conn);
		} 
				
		return list;
		
		public StudentDTO getSelectOne(StudentDTO paramDTO) {
			StudentDTO dto = new StudentDTO();		
			
			
		}	
			
		public int setInsert(StudentDTO dto) {
			int result;
		}
				
		return 0;
		
		
		
		
	}
}
