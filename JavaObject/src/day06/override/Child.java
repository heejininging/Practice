package day06.override;

public class Child extends Parent {
	
	//오버라이딩 된 메서드
	int method02() {//메서드를 부모와 동일하게 만들면 덮어씌워짐 (왼쪽에 삼각형모양 - 오버라이딩)
		System.out.println("자식의 오버라이딩 된 2번 메서드");
		return 100;//리턴값은 아무렇게 정의내려도 됨
	}

	//자신의 메서드
	void method03() {
		System.out.println("자식의 3번 메서드");
	}




}
