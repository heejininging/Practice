package day02;

import java.util.Scanner;

public class WhileEx04 {//반복문 내가 원하는 한계만큼의 합

	public static void main(String[] args) {
		
		//정수를 입력받는다.
		//입력받은 정수까지의 합.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수>");
		int num = scan.nextInt();
		
		int sum = 0;
		int i = 1;
		while(i <= num) { //입력받은 수까지 반복
			sum += i;
			
			i++;
			
		}
		
		System.out.println(num + "까지의 합 :" + sum);
	}
	
}
