package day04;

public class MethodEx05 {

	public static void main(String[] args) {
		
		//메서드의 동기적 실행 (순서대로)
		test01();//1-3-4-2
		//메서드의 재귀적 실행 (메서드를 계속 반복실행)
		recursive(1);
		
		//재귀적 예시 1,2는 동일한 값이지만 다른 방법
		//재귀적 예시 1)
		int sum = 1;
		for(int i = 1; i <= 5; i++) {
			sum *= i;
		}
		System.out.println(sum);
		
		//재귀적 예시 2)
		int result = fac(5);
		System.out.println(result);
	}
	
	static void test01() {
		System.out.println("1번 메서드 실행");//1
		test02();
		System.out.println("1번 메서드 종료");//2
	}
	
	static void test02() {
		System.out.println("2번 메서드 실행");//3
		
		System.out.println("2번 메서드 종료");//4
	}
	
	static void recursive(int a) {
		//재귀적 함수는 탈출의 구문을 반드시 명시한다.
		if(a == 10) return;//조건식과 리턴 - 탈출식
		
		System.out.println(a + "번 호출");
		
		a++;//1증가
		recursive(a);
		
	}
	// 재귀적 예시 2)
	static int fac(int a) {
		
		if(a == 1) return 1; //f(1) = 1
		
		return a * fac(a-1);
	}


}
