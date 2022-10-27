package practice;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		int D = scan.nextInt();
		int E = scan.nextInt();
		int F = scan.nextInt();
		int X = scan.nextInt();
		
		int taka = B * (A - C);
		
		int aoki = E * (D - F);
		
		int a = taka * X;
		int b = aoki * X;
		
		if(a > b) {
			System.out.println("Takahashi");
		}else {
			System.out.println("Aoki");
		}
		
		
		
	}
}
