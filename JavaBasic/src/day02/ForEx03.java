package day02;

import java.util.Arrays;

public class ForEx03 {

	public static void main(String[] args) {
		
//		for문으로 배열의 사용.
//		int [ ] arr = {1,2,3,4,5,6,7,8,9,10};
//		
//		for(int i =0; i < arr.length; i++) {
//			System.out.println(arr[i]);//위의 중괄호 값이 출력됌
//		}
		
		//100개의 크기를 갖는 int배열에 3의 배수만 순서대로 저장.
		int[] arr = new int[100];//배열의 생성 []는 배열의 갯수
		
		int a = 0; //3의 배수를 나타낼 변수 
		for(int i = 0; i < arr.length; i++) {//인덱스 번호가 0부터 시작이기 때문에 변수값 0으로 지정
			
			a += 3;// a = a + 3; 을 인덱스 []의 번호 수까지 반복
			arr[i] = a;
			
		}System.out.println(Arrays.toString(arr));
		
	}
}
