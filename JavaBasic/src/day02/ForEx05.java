package day02;

public class ForEx05 {
	
	public static void main(String[] args) {
		
		//이중포문(중첩 반복문)
//		for(int i = 1; i <= 10; i++) {
//			for(int j = 1; j <= 10; j++) {
//			}
//		}
		
		//2단에서 9단까지 구구단을 세로로 출력
		for(int dan = 2; dan <= 9; dan++) { 
			
			System.out.println("구구단" + dan + "단");
			
			for(int num = 1; num <= 9; num++) {
				
//				System.out.println(dan + " x " + num + " = " +  dan*num);
				System.out.printf("%d x %d = %d\n" , dan, num, dan*num);
			}
			
			System.out.println("-----------------------");
		}
		
		
	}

}
