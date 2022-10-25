package day03;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayUpdate {

	public static void main(String[] args) {
		
		//배열값의 수정
		//탐색 -> 변경 -> 결과출력
		String [] arr = {"어피치", "라이언", "제이지", "네오", "무지", "튜브"};
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("찾을 이름>");
		String name = scan.next();
		
		boolean f = false;
		for(int i = 0; i < arr.length; i++) {
			
			if(name.equals(arr[i])) {
				
				System.out.print("변경할 이름>");
				String n = scan.next();
				arr[i] = n;//수정
				
				f = true;
			}
			
		}
			//찾음 못 찾음 구분
			if(f) {
				System.out.println("별명이 수정되었습니다.");
			}else {
				System.out.println("별명이 존재하지 않습니다.");
			}
			
			System.out.print(Arrays.toString(arr));
	}
	
}
