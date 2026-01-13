package study_260113;

public class Method3 {

	public static void main(String[] args) {
		
//		int[] a = new int[5];
//		a[0] = 20;
//		a[2] = 50;
//		
//		User[] users = new User[5];
//		
//		// User클래스 객체 생성
//		users[0] = new User("lee","1234","이성계","010-1234-5678"); 
//		
////		users[0].setName("이순신");
//
//		System.out.println(users[0].getName());
		
		User[] users = {
				new User("lee","1234","이성계","010-1234-5678"),
				new User("9yu","0406","김민규","010-1997-0406"),
				new User("yang","0105","양요섭","010-1990-0105"),
				new User("doodoo","0704","윤두준","010-1989-0704"),
				new User("hoon","1004","정일훈","010-1994-1004")
		}; 
		
		UserService us = new UserService();
//		us.findId(users);
//		
//		us.findPassword(users);
		
		us.Login(users);
	}

}
