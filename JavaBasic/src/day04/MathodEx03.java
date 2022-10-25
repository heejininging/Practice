package day04;

public class MathodEx03 {

	public static void main(String[] args) {
		
	
		/*
		 * 반환유형 (return type)
		 * 1. 반환유형은 메서드가 돌려주는 값에 대한 타입.
		 * 2. 반환유형이 있는 메서드는 호출구문이 값이 되기 때문에 메서드의 매개값으로 사용될 수 있습니다.
		 * ex) println( 메서드 호출 ) 
		 * 3. 모든 메서드는 return을 만나면 강제종료 됩니다.
		 * 4. return문 아래에는 코드를 작성할 수 없습니다.
		 */
	
//	01. 1,2,3 모두 같은 값 출력
		//1)
		int result = add(3,5);
		System.out.println("결과 : " + result);//8
		//2)
		System.out.println( add(3, 5) );//8
		//3)
		int result11 = add( add(1, 2), add(2, 3) );//8

//	02.
		//int r = sub(1, 2);
		//System.out.println( sub(1, 2) );
		sub(1, 2); //void형 메서드의 특징
		
		noReturn("hello");
		noReturn("bye");
	
	
	}
	
	//01.반환 o, 매개변수 o
	static int add(int a , int b) {
		int result = a + b;
		return result;
		//return a + b ;
	}
	
	//02.반환 x, 매개변수 o - return이 없음(결과값을 돌려주는것이 아니고 실행만 해준다./단순실행)
	static void sub(int a, int b) {
		System.out.println("a - b =" + (a-b));
	}
	
	
	//void형에서 return - 종료
	static void noReturn(String s) {
		
		if(s.equals("hello")) {
			System.out.println("실행종료");
			return;//종료
		}
		
		System.out.println(s);
	}
	
	
	
	
}
