package Str_Ex;

public class StrEquals {

	public static void main(String[] args) {
		
	
	String str1 = "홍길자";
	String str2 = "홍길자";
	String str3 = new String("홍길자");//new키워드를 사용해서 객체를 직접 힙영역에 생성
	
	//3개의 값 모두 홍길자로 출력
	System.out.println(str1);
	System.out.println(str2);
	System.out.println(str3);
	
	/*
	 * 같은 클래스 내부에서 문자열을 선언하면 동일한 위치를 참조한다.(동일한 문자일 경우)
	 */
	System.out.println(str1 == str2); //true
	
	/*
	 * 하지만, 다른 클래스에서 넘어오는 String은 다른 위치를 가지게 됩니다.
	 * 그래서 문자열의 비교시에는 == 대신에 String클래스가 제공해주는 .equals()를 사용합니다.
	 */
	System.out.println(str1 == str3); //false - 동일한 문자여도 다른영역에 저장되어 거짓으로 표기
	System.out.println(str1.equals(str3));//true - equals를 사용해서 동일한 문자이므로 참으로 표기
	
	
	
	
	}
	
}
