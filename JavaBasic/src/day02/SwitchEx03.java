package day02;

import java.util.Scanner;

public class SwitchEx03 {

	public static void main(String[] args) {
		
		String[] arr = {"안녕", "hello", "사요나라", "@$"};
		
		/*
		 * Math.random()을 이용해서 배열의 인덱스 범위(0~3)까지 랜덤수를 만듭니다.
		 * 랜덤수를 배열의 index에 적용해서 출력된 단어가 한국어, 영ㅇ, 일본어, 알수없는언어
		 * 인지 처리해보세요.
		 */
		
		int num = (int)(Math.random() *4);
		System.out.println("선택된 단어 :" + arr[num]);
		
		//정수, 문자여야합니다.
		switch(num) {
		
		case 0:
			System.out.println(arr[0]);
		
			break;
			
		case 1 :
			System.out.println(arr[1]);
			
			break;
			
		case 2 : 
			System.out.println(arr[2]);
			
			break;
			
		case 3 :
			System.out.println(arr[3]);
		}
	
		
		
		
		
		}
	}
	

