package day09.inter.inherit;

public class MainClass {

	public static void main(String[] args) {
		
		//인터페이스 클래스를 상속받은 나 자신으로 생성하거나, 부모타입에 저장해도 같다.
//		MyClass me = new MyClass();
//		Inter3 in = new MyClass();//인터페이스 부모타입에 저장해도 구조는 비슷함
		
		//inter2의 기능만 사용할 수 있다. 오버라이드 된 메서드 실행
		Inter2 m2 = new MyClass();
		m2.some3();
		m2.some4();
		
		
		//inter1의 기능만 사용할 수 있다.
		Inter1 m1 = new MyClass();
		m1.some1();
		m1.some2();
		
		Inter3 m3 = new MyClass();
		m3.some1();
		m3.some2();
		m3.some3();
		m3.some4();
		m3.some5();
		
		
	}
}
