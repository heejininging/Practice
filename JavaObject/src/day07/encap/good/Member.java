package day07.encap.good;

public class Member {

	//회원정보저장
	private String id;
	private String pw;
	private String name;
	private String email;
	private String addr;
	private int age;
	//많은 생성자를 만들어야하는 경우 alt + shift + s
	
	public Member(String id, String pw, String name, String email, String addr, int age) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.email = email;
		this.addr = addr;
		this.age = age;
	}

	//기본생성자 ctrl + space + enter
	public Member() {
	}
	
	//많은 get,set을 만들기는 힘들다. 자동완성키로 alt + shift + s , 또는
	// source탭
	public String getId() {
		return id;
	}

	
	public void setId(String id) {
		this.id = id;
	}

	
	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
	

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
