package day06.super_;

public class Mother extends Person{

	
	//생략
	Mother(){
		super();//아무것도 적지 않아도 자동으로 부모클래스의 생성자호출 (기본생성자가 있어야함)
		//Main 클래스에 Mother 생성자를 호출해도 Person의 생성자를 상속받아서 호출
	}
	
	
}
