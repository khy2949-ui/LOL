package exam05;

import java.time.LocalDate;
import java.util.Scanner;

public class _Exec {
	public static void main(String[] args) {
		// 이름, 주민번호
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("주민번호 : ");
		String ssn = sc.nextLine();
				
		String imsi = ssn.substring(7, 8);
		
		String gender = "여자";
		if(imsi.equals("1") || imsi.equals("3")) {
			gender = "남자";
		}
				
		String temp = ssn.substring(0,2);

		int birthYear;
		if(imsi.equals("1") || imsi.equals("2")) {	//1900
			birthYear = 1900 + Integer.parseInt(temp);
		}else {	//2000
			birthYear = 2000 + Integer.parseInt(temp);
		}
		
		// 현재 날짜 정보 가져오기
		int year = LocalDate.now().getYear();
		int age = year - birthYear;
		
		System.out.printf("나이 : %s\n",age);
		System.out.printf("성별 : %s\n",gender);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
