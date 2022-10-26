package day10.exception.throw_;

public class ThrowEx01 {

	public static void main(String[] args) {
		
		try {
			System.out.println( calc(10) );
			System.out.println( calc(-10) );
	
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println( e.getMessage() );//예외 생성시에 만들어진 메세지를 확인 할 수 있음.
		
		}
				
	}
	
	//잘못된 값이 전달되면 예외를 만들어서 메서드를 강제종료
	public static int calc(int n) throws Exception{
		
		if(n <= 0) {
			throw new Exception("0이상으로 값을 전달하세요."); //예외 강제생성 - 예외를 생성하면 예외처리 구문이 필요합니다. (try - catch, throws)		
		}
		
		int sum = 0;
		for(int i = 0; i <= n; i++) {
			sum += i;
		}
		
		return sum;
	}
	
	
	
	
	
}
