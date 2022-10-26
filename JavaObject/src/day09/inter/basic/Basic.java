package day09.inter.basic;
//인터페이스를 구현할 클래스 생성
//인터페이스는 implements키워드로 상속을 받습니다.
public class Basic /*extends Object*/ implements Inter1, Inter2{//인터페이스 클래스를 받는 자식클래스

	public void method01() {
		System.out.println("오버라이딩 된 inter1 메서드");
	}
	
	public void method02() {
		System.out.println("오버라이딩 된 inter2 메서드");
	}
}
