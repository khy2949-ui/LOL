package study_260108;

public class JavaClasses2 {

	public static void main(String[] args) {

		Movie movie = new Movie();
		// new Movie() 생성자 메서드
		
		System.out.println(movie.title);

		movie.title = "아바타 불과재";
		movie.dir = "제이크";
		movie.year = 2026;
		movie.limitAge = 12;
			System.out.println(movie.title);
			
			
			Movie movie2 = new Movie("굿포츈",2026);
			
			System.out.println( movie2.title );
			System.out.println(movie2.year);
			
			// Music 클래스의 객체 생성하여
			// 음악제목, 가수, 재생시간(총 몇분) 저장되게하기
			// 매개변수 있는 생성자 메서드로 데이터 저장하고
			// 출력하기
			
		Music music = new Music("Thunder","세븐틴",2);
		
			System.out.println("음악제목 : "+music.MusicName);
			System.out.println("가수 : "+music.singer);
			System.out.println("재생시간 : "+music.time+"분");
			
			
			
	}

}
