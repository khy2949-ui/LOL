package study_260108;

public class JavaClasses {

	public static void main(String[] args) {
		
		User u = new User();
		User u2 = new User();
		User u3 = u;
		
		u.age = 30;
		System.out.println(u.age);
		u.name = "이순신";
		u.job = "군인";
		System.out.println(u.name);
		System.out.println(u.job);
		
		// 책 이름, 저자, 출판년도를 저장할 수 있는 클래스 정의
		// 객체 생성하여 데이터 넣고 출력하기
		
		Book book = new Book();
		
		
		book.name = "어린왕자";
			System.out.println("책 이름 : "+book.name);
		book.writer = "앙투안 드 생택쥐페리";
			System.out.println("책의 저자 : "+book.writer);
		book.year = 1943;
			System.out.println("출판년도 : "+book.year+"년");
		
//		System.out.println(book.name+" "+book.writer+" "+book.year);
		
	}

}


class Book { // Book 클래스
	
	String name;
	String writer;
	int year;
	
}




class User{ // User 라는 클래스 정의
	
	int age;
	String name;
	String job;
	
}



/*
	자바 클래스
	
	데이터 저장 방법 - 변수, 배열, 구조체, 클래스


*/