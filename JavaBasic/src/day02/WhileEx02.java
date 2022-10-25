package day02;

public class WhileEx02 {

	public static void main(String[] args) {
		
		//100번 화전하는 반복문에서 짝수만 출력
		int a = 1;
		while(a <= 100) {
			
			if(a % 2 == 0) {
				System.out.print(a + " ");
			}
			a++;
		}
		
		System.out.println(); //소괄호를 공백으로 두면 줄바꿈 출력
		
		
		//100번 화전하는 반복문에서 짝수만 출력
		
		int j =2;
		while(j <= 100) {
			
			System.out.print(j + " ");
			
			j+=2;//2씩 더하는 경우 j+2 (x)
			
		}
		
		System.out.println();
		
		
		
		
		
	}
}
