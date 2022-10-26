package day10.exception.trycatch;

public class TryCatchEx01 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 0;
		
		System.out.println(a + b);
		
		try {			
			System.out.println(a / b);
			System.out.println("이 곳에 위치한 문장을 실행이 되지 않는다.");
		} catch (Exception e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}
		

		System.out.println(a - b);
		
			
		
		
		
		
	}
	
}
