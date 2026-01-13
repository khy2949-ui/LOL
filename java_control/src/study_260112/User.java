package study_260112;

public class User {

	// 사용자 정보 (이름, 아이디, 비밀번호, 전화번호)
	
	private String name;
	private String id;
	private String password;
	private String hp;
	public User(String name, String id, String password, String hp) {
		super();
		this.name = name;
		this.id = id;
		this.password = password;
		this.hp = hp;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getHp() {
		return hp;
	}
	public void setHp(String hp) {
		this.hp = hp;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", id=" + id + ", password=" + password + ", hp=" + hp + "]";
	}
	
	
	
}
