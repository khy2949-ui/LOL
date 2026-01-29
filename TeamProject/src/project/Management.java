package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class Management {	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);	
			
			String dbUrl = "jdbc:mysql://localhost:3306/library?serverTimezone=Asia/Seoul";
			String dbUsr = "library";
			String dbPwd = "1234";
			
			Connection conn = null;
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn = DriverManager.getConnection(dbUrl, dbUsr, dbPwd);
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			
			while (true) {
				System.out.print("선택(0:종료, 1:회원 등록, 2:회원정보 수정, 3:회원 삭제, 4:회원정보 조회) : ");
				String menu = sc.nextLine();
				if(menu.equals("0")) {
					break;
				} else if (menu.equals("1")) {
					MemberInsert.insert(conn, sc);				
				} else if (menu.equals("2")) {
					MemberUpdate.update(conn, sc);
				} else if (menu.equals("3")) {
					MemberDelete.delete(conn, sc);
				} else if (menu.equals("4")) {
					MemberView.view(conn, sc);
				}
				sc.nextLine();
			}
			System.out.println("--- 프로그램 종료 ---");
					
	}

}
