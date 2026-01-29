package exam04;

public class Student { // 변수 안에 값을 넣음
	String name;
	int score;
	
	Student(String name, int score){  // 매개변수가 있는 생성자 (클래스 이름과 같음)
		this.name = name;
		this.score = score;		
	}

	@Override
	public String toString() {
		return name + "(" + score + ")";
	}
	
	
	
}
