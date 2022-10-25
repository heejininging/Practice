package day02;

public class ContinueEx01 {

	public static void main(String[] args) {
		
//		for(int i = 1; i <= 10; i++) {
//		
//			if(i % 2 == 1) {//홀수 공식
//				continue;//다음 반복문으로 pass
//			}
//			System.out.println(i);//짝수 출력
//		}

		int i = 0;
		while(i <= 10) {

			i++;//증감식을 앞에 넣어줘서 무한루트가 되지 않게한다.
			
			if(i % 2 == 1) continue;//조금 더 빠르게 반복문을 끝낼 수 있다.
//				return;//메인의 종료
			System.out.println(i);
			
		}
		
		System.out.println("프로그램 정상종료");
		
		
	}
}
