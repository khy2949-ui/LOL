package study_260112;

public class MainMethod {

	public static void main(String[] args) {
		
		Student student = new Student();
		
		student.name="이순신";
		student.age="34";
		// student.tall = 175;	-private 접근제어자
		
		System.out.println(student);
		
		Student student2 = new Student("김유신","45",172);
		System.out.println(student2);
		
		
		BingoGame bingogame = new BingoGame("홍길동",20,3,5,1);
		
		System.out.println(bingogame);
		
		
		bingogame.setUser("김춘추");
		System.out.println(bingogame);
		
		System.out.println(bingogame.getUser());
	}

}
