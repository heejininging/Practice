package day01;

public class Variable {
	
	public static void main(String[] args) {
		
		/*
		 * 변수는 선언과 초기화 과정이 있습니다.
		 * 선언방법
		 * 타입 이름;
		 * 
		 * int - 정수를 저장하는 타입
		 * String - 문자열을 저장하는 타입
		 */
		
		//선언
		int num;
		//초기화 - 숫자를 지정해주는 과정
		num = 10;
		
		System.out.println(num);
		
		//선언과 초기화를 동시에
		int num2 = 20;
		System.out.println(num2);
		
		//변수의 값을 변경, 위에서부터 아래로 실행됨
		num2 = 100;
		System.out.println(num2);
		
		//변수에는 다른 변수의 값을 넣을 수도 있습니다.
		int result = num2;
		System.out.println(result);
		
		//변수에는 연산의 결과도 저장할 수 있습니다.
		int result2 = num + num2;
		System.out.println(result2);
		
		//int는 숫자를 저장하는 대표적인 타입
		//int str = "10";//x
		//String str ="10";//ㅇ 스트링 앞에 꼭 대문자로 작성해야함
		
		//변수는 타입이 다르면 바로 저장할 수 없음
//		int num3 = str;
		
		
		
		
		
		
		
		
	}

}
