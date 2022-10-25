package day02;

import java.util.Scanner;

public class ForEx02 {

	public static void main(String[] args) {
		
		//정수를 입력받고, 입력한 정수가 소수인지 판별
		//소수 -> 나누어 떨어지는 수가 1과 자기자신인 수 (조건 - 약수가 두개인 수)
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수>");
		int a = scan.nextInt();
		
		int count = 0;//카운트 변수
		for(int i = 1; i <= a; i++) {//1,2,3,4..무한으로 값을 넣어서 반복
			
			if(a % i == 0) {
				count++;//조건이 맞으면 카운트변수의 값 증가 
			}
		}
			System.out.println(count == 2 ? a +"는 소수" : a +"는 소수가 아님");//3항 연산자
		
	}
	
}
