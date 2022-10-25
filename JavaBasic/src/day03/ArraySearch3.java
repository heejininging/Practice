package day03;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySearch3 {

	public static void main(String[] args) {
		
		//이진탐색 - 절반으로 나눠가며 찾아가는 과정
		//조건 - 순서대로 나열된 데이터

		Scanner scan = new Scanner(System.in);
		
		int arr[] = { 30, 50, 80, 100, 110, 250, 300, 500 };
		
		int num = scan.nextInt();
		
//		System.out.println(Arrays.binarySearch(arr, num));
		
		int low = 0;
		int high = arr.length -1;//7
		
		while(low <= high) {
			
			int mid = (low + high) / 2;
			
			if(num == arr[mid]) {
				System.out.println("인덱스 위치 : " + mid);
				break;
			}
			
			if(num > arr[mid]) {//입력값이 중간값보다 큰경우
				low = mid+1;
				
			}else {//입력값이 중간값보다 작은경우
				high = mid-1;
			}
			
		}
		if(low > high) {
		
			System.out.println("찾는 값은 없습니다.");//while반복문의 반복횟수를 넘었을 경우 출력문이므로 while문 바깥에 입력
		}
		
		
	}
	
}
