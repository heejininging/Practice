package practice;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String n = sc.nextLine();
		int num = Integer.parseInt(n);
		
		int sum = 0;
		for(int i = 0; i <= 9; i++) {
			sum += num%10;
			num = num/10;
		}
		
		System.out.println(45 - sum);
	}
}

//
//package practice;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class Quiz02 {
//	public static void main(String[] args) {
//
//		//부족한숫자
//		Scanner sc = new Scanner(System.in);
//		System.out.println("값 입력 > ");
//		String num = sc.nextLine();
//
//		
//		
//		//로직처리
//		for(int i = 0; i <= 9; i++) {
//			String num1 = Integer.toString(i);
//			System.out.println(num1);
//			for(int x = 0; x < num.length(); x++) {
//				char t = num.charAt(x);
//				String a = String.valueOf(t);
//				if(num1.equals(a)) {
//					
//				}else {
//					System.out.println(a);
//				}
//			}
//		}
//	}
//
//}
//
//
//
//
