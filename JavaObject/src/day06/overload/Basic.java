package day06.overload;

public class Basic {

	/*
	 * 오버로딩 - 같은 이름의 메서드를 여러개 만드는 것
	 * 
	 * 규칙
	 * 1. 반환유형 or 접근제어자는 영향을 미치지않는다.
	 * 2. 매개변수타입 or 종류 or 순서 중 한개만 다르면 됩니다.
	 * 
	 */
	
	//1.
	void input(int a) {
		System.out.println("정수 1개 입력");
	}

	//허용x
//	int input(int a) {
//		return 0;
//	}

	//2. 오버로딩한 메서드
	void input(String s) {
		System.out.println("문자열 1개 입력");
	}
	
	void input(String s, int a) {//매개변수 갯수가 다르기때문에 가능
		System.out.println("문자열 1개, 정수 1개 입력");
	}

	void input(int a , String s) {
		System.out.println("매개변수 위치를 바꿔도 가능");
	}
	
	void input(double a , double b, int c) {
		System.out.println("실수 2개, 정수 1개 입력");
	}
	
	
	
	
}
