package day04;

public class MethodEx01 {
		//main 밖 (1)
	public static void main(String[] args) {
		//메서드는 메서드 내부에 생성할 수 없다.
		//(1 main 밖,2 클래스 안)에서 메서드 생성가능

//		01.
		//메서드의 호출 : 이름()
		int result = calsum();
		System.out.println(result); //55
//		System.out.println(calsum()); //55

		//호출을 여러번 할 수 있다.
		int result2 = calsum();
		System.out.println(result2);//55

//		02.
		String result3 = ranStr();
		System.out.println(result3);//ABCDEFGHIJKLMNOPQRSTUVWXYZ
		
//		03.
		String result4 = ranStr2();
		System.out.println(result4);//랜덤한 가위,바위,보 출력
		
	}//메인 끝

	//클래스 안 (2)
	
	//01.반환은 있고 매개변수는 없다. - 1~10까지의 합
	static int calsum() {
		
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			sum += i;
		}

		return sum;//반환해주기(정수형이라면 가능)
	}

	
	
	//02.반환은 있고 매개변수는 없다. - 문자열의 결과 반환
	static String ranStr() {

		String str = "";
		for(char c = 'A'; c <= 'Z'; c++) {
			str += c;
		}
		return str;
//		return null; //string의 기본값 null(아무것도 없다)
	}

	
	//03.반환은 있고 매개변수는 없다 -return키워드의 활용
	static String ranStr2() {
		
		double d = Math.random();

		if(d > 0.66) {
			return "가위";
		}else if(d > 0.33) {
			return "바위";
		}else {
			return "보";
		}
		
		
		/*String str ;
		if(d > 0.66) {
			str = "가위";
		}else if(d > 0.33) {
			str = "바위";
		}else {
			str = "보";
		}
		
		return str;
		*/
	}





}
