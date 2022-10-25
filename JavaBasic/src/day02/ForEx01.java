package day02;

public class ForEx01 {

	public static void main(String[] args) {
		
		//1~10 합계
		
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			
			sum += i;
		} System.out.println(sum);
		
		System.out.println("------------------------");
		
		//10부터 1까지 반복 - 역순이라고 생각하고 조건식을 세워야함
		
		for(int a = 10; a >= 1; a--) {
			
			System.out.print(a + " ");//10 9 8 7 6 5 4 3 2 1 
		}
		
	}
	
}
