package day02;

import java.util.Scanner;

public class MultiForEx03 {
	
	public static void main(String[] args) {
		
		//입력받은 수까지 소수를 출력.
		//나누어 떨어지는 수가 1과 자기자신인 수
		//예시 - 5 -> 2,3,5
		//입력받은 수까지 반복하고, 각 수를 자기자신까지 나누면서 약수의 개수가 2개인 수
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수>");
		int num = scan.nextInt();
		
		
		for(int i =1; i <= num; i++) {
			
			int  count = 0;//초기값
			
			for(int j =1; j <= i; j++) {
				if(i % j == 0) {
					count++;//계속 누적이 됌 그래서 반복문 바깥에 초기값을 설정해두어야 정확한 카운트가
				}
			}
			if(count == 2) {
				System.out.println(i);
		}
		
		}
		
	}

}
