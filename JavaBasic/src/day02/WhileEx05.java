package day02;

import java.util.Scanner;

public class WhileEx05 {

	public static void main(String[] args) {
		
		/*
		 * 반복문 안에서의 입력
		 * 
		 * 1개의 정수를 받아서 반복의 횟수를 결정
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("반복횟수>");
		int num = scan.nextInt();
		
		int sum = 0; //누적변수
		int i = 1;
		while(i <= num) {
			
			System.out.print(">");
			int a = scan.nextInt();
			sum += a;
			//입력받은 수 num의 a만큼의 누적합계
			
			i++;
		}
		
		System.out.println("누적 합계 :" + sum);
		
		
	}
	
}
