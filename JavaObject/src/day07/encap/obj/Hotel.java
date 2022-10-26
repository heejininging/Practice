package day07.encap.obj;

public class Hotel {//사용자클래스

//	public String str = new String("");
	private Chef chef; //= new Chef();//클래스로 멤버변수를 생성할 수 있다.
	
	//기본생성자
	public Hotel() {}
	
	//생성자 - chef라는 class를 받는 생성자.
	public Hotel(Chef chef) {
		this.chef = chef;
	}

	//getter, setter (메서드)
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	
	public Chef getChef() {
		return chef;
	}
	
}
