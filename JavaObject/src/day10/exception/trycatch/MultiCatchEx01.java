package day10.exception.trycatch;

public class MultiCatchEx01 {

	public static void main(String[] args) {
		
		//main에 args사용방법
		//run -> run cinfigration -> argment탭에 -> ${string_prompt}
		
		
		try {
			String data1 = args[0];
			String data2 = args[1];
			
			//Integer.parseInt 정수로 치환
			int n1 = Integer.parseInt(data1);
			int n2 = Integer.parseInt(data2);
			
			System.out.println("두 수의 합: " + (n1 + n2));
			
			String s = null;
			s.charAt(0);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("매개값은 2개를 입력하세요.");
		} catch (NumberFormatException e) {
			System.out.println("매개값은 숫자로 입력하세요.");
		} catch(Exception e) {// = (NullPointerException e)
			//Exception은 어떤 실행 예외던 처리가능 (예외의 부모이기 때문)
			//ctrl + t : 예외처리 상속관계 표기
			System.out.println("기타 예외입니다.");
		}
		
	}
	
}
