package day02;

import java.util.Arrays;

public class ForEx04 {

	public static void main(String[] args) {
		
		//변수의 swap
		
		int x = 10;
		int y = 5;
		
		int temp = x;
		x = y;
		y = temp;
		
		System.out.println("x의 값" + x + ", y의 값" + y);//x의 값5, y의 값10
		
		//배열의 swap - 배열을 1번 랜덤하게 섞는다.
		int [] arr = { 1,2,3,4,5,6,7,8,9,10 };
		
		int ran = (int)(Math.random() * 9) + 1;
		int temp1 = arr[0];
		arr[0] = arr[ran];
		arr[ran] = arr[temp1];
		
		System.out.println(Arrays.toString(arr));//[10, 2, 3, 4, 5, 6, 7, 8, 9, 2]

		
		
		
	}
	
}
