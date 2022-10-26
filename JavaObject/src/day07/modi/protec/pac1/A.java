package day07.modi.protec.pac1;

public class A {

	/*
	 * protected는 기본적으로 같은 패키지에서만 사용할 수 있습니다. (default동일)
	 * 단. 패키지가 다르더라도 상속관게에서 super을 통한 접근은 가능함.
	 *
	 */
	
	//멤버변수
	protected String s;
	//생성자
	protected A () {
		
	}
	//메서드
	protected void method() {
		
	}
	
}
