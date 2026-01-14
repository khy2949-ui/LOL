package study_260114;

public class MainMethod {

	public static void main(String[] args) {
		
		DBConnect connect = new DBConnect();
		
		GameMember[] gameMembers = connect.findAll();
		
		System.out.println( gameMembers[2] );

		DBConnect2 connect2 = new DBConnect2();
		
		Item[] items = connect2.findAll();
		
		System.out.println( items[0] );
		
		
		
		
	}

	
	
}
