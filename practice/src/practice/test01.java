package practice;

import java.util.Scanner;

public class test01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("값을 입력하세요 > ");
		
		String num1 = sc.nextLine();
		String num2 = sc.nextLine();
		String num3 = sc.nextLine();
		
		int x1 = Integer.parseInt(num1.split(" ")[0]);
		int y1 = Integer.parseInt(num1.split(" ")[1]);
		
		int x2 = Integer.parseInt(num2.split(" ")[0]);
		int y2 = Integer.parseInt(num2.split(" ")[1]);
		
		int x3 = Integer.parseInt(num3.split(" ")[0]);
		int y3 = Integer.parseInt(num3.split(" ")[1]);
		
		//로직처리
		
		//출력
		System.out.println(x3 + " " + y1);
		
		
		
	}
}
