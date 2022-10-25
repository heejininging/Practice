package day04;

public class MathodEx02 {

	
	public static void main(String[] args) {
		
		/*
		 * 매개변수 (parameter)
		 * 1. 매개변수는 메서드를 호출할 때 필요한 값을 전달하는 매개체
		 * 2. 매개변수는 몇 개 받을지 메서드를 선언할 때 결정해줍니다.
		 * 
		 */
//		01.
		int result = calsum(10);
		System.out.println(result);// 1+2+3...+int end(10) = 55
		
		int result2 = calsum(100);//int end에 () 소괄호 값 대입
		System.out.println(result2);// 1+2+....+100 = 5050
		
//		02.
		int result3 = calsum2(10, 20);
		System.out.println("10~20까지의 합 : " + result3);//10+11+12...+20 = 165
		
		
		
	}
	
	//01. 반환 o, 매개변수 o
	 static int calsum(int end) {//매개변수에는 타입과 이름만 적을 것
	
		int sum = 0;
		
		for(int i = 1; i <= end; i++) {
			sum += i;
		}
		
		return sum;
	
	}
	
	
	//02. 반환 o, 매개변수 o - 매개변수가 여러개(,콤마를 활용하여 나열한다.)
	 static int calsum2(int start, int end) {//result3 소괄호 값 참고
		 int sum = 0;
		 for(int i = start; i <= end; i++) {
			 sum += i;
		 }
		 return sum;
	 }
	
	 
	
	
}
