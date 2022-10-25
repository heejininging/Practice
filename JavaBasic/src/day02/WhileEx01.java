package day02;

public class WhileEx01 {
	
	public static void main(String[] args) {
		
//		int a = 1; //제어변수 : 반복문의 횟수를 결정할 변수
//		while(a <= 10) {
//			
//			System.out.println("hi");// 단순하게 출력가능
//			System.out.println("hi" + a);// 제어변수가 몇번 출력되었는지 한눈에 확인
//			
//			a++; //제어변수 조작을 통해 반복의 조건식이 언젠가 false가 되도록 처리
//			
//		}
		
		
		//누적
		int sum = 0; // 누적할 변수
		
		int i =1;
		while(i <= 10) {
			
			
			sum += i;     //sum = sum + i;
			i++;	
			
		}
		
		
		
		
	}

}
