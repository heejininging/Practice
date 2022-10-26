package day08.poly.basic;

//하나의 클래스 파일에 여러 클래스 선언이 가능합니다.
//단, 파일명과 동일한 클래스가 public이어야 합니다.
class A extends Object{}//조부모
class B extends A{}//부모, A의 자식
class C extends A{}//부모, A의 자식
class D extends B{}//B의 자식
class E extends C{}//C의 자식

public class Basic {//사용자클래스
	
	//다형성(클래스 형변환) - 자식의 주소가 부모에 저장되는 성질
	//멤버변수
	
	A a = new B();
	A a1 = new C();
	A a2 = new D();
	A a3 = new E();
	
	//다향성은 상속을 전제조건으로 한다.
//	B b = new C();

	//Object형에는 모든 클래스를 저장할 수 있습니다. (단, 오브젝트는 자동으로 형변환되므로 필요한 경우에만 사용)
	Object obj = 1;
	Object obj1 = 3.14;
	Object obj2 = "문자열 저장";
	Object obj3 = new A();
}
