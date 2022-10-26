package day09.inter.basic;

public interface Inter1 {//뷰모클래스
	//인터페이스는 객체생성이 불가능합니다.
	//상수, 추상메서드 + a(default, static 메서드)
	
	//인터페이스 변수를 선언하면 ->public 상수로 선언된다.(꼭 변수의 초기값을 줘야함)
	double PI = 3.14;
	
	//인터페이스 메서드를 선언하면 ->public 추상메서드가 된다.
	void method01();
	
}
