package exam30;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class _Exec {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);				
		while(true) {
			System.out.print("선택(1:목록, 2:상세보기, 3:등록, 4:수정, 5:삭제, 기타:등록):");
			String menu = sc.nextLine();
			StudentDTO dao = new StudentDTO();
			switch(menu) {
			case "1":
				//StudentDTO dao = new StudentDTO();
				List<StudentDTO> list = dao.getSelectAll();
				System.out.println("학번 \t 이름 \t 주민번호 \t 연락처 \t 주소 \t 등록일");
				System.out.println("----------------------------------------");
				for(int i=0; i<list.size(); i++) {
					list.get(i).display();
				}
				break;
			case "2":
				dto.inputField("view");
				StudentDTO resultDTO = dao.getSelectOne(dto);
				resultDTO.display();
				break;
			case "3":
				StudentDTO dto = new StudentDTO();
				dto.inputField("chuga");
				//StudentDAO dao = new StudentDAO();
				int result = dao.setInsert(dto);
				System.out.println("result : " + result);				
				break;
			case "4":
				System.out.println("- 수정 -");
				break;
			case "5":
				dto.inputField("sakje");
				break;
			default:
				System.out.println("-프로그램 종료-");
				return;
			}
		}

	}

}
