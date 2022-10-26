package day08.static_.basic;

import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {
		
		//ctrl 메소드 클릭하면 클래스에서 생성한 메서드로 이동함
		
		int [] arr = {1,2,3,4};
		
		System.out.println(Arrays.toString(arr));
		System.out.println(PrintArray.toArray(arr));
		
		char [] arr2 = {'가','나','다'};
		
		System.out.println(Arrays.toString(arr2));
		System.out.println(PrintArray.toArray(arr2));
		
		
		String [] arr3 = {"안","녕","히"};
		System.out.println(Arrays.toString(arr3));//문자열에서 문자열 출력
		System.out.println(PrintArray.toArray(arr3));
		
		
	}

	
}
