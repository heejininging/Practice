package day02;

public class EnhanceForEx {

	public static void main(String[] args) {
		
		int [] arr = {1,2,3,4,5};
		
		//일반 for문
//		for(int a = 0; a < arr.length; a++) {
////			System.out.println(a);//인덱스 값이 출력됌
//			System.out.println(arr[a]);//인덱스 안의 값이 출력됌
//		}
//		
//		//향상된 for문 ★
//		for(int i : arr) {
//			System.out.println(i);
//		}
		
		System.out.println("-----------------------");
		
//		String[] sArr = {"월", "화", "수", "목", "금", "금", "금" };
//		
//		for(String s : sArr) {
//			System.out.print(s);
//		}
		
		System.out.println("-------------------------");
		//배열 요소들의 합계와 평균을 소수 2자리만 출력
		int[] score = { 34, 54, 23, 53, 65 };
		
		
//		int sum = 0;
//			for(int p : score) {
//			sum += p;
//			System.out.println(sum);
//		
//			}
//			int b = score.length;
//			for(int n : arr) {
//				System.out.println(sum % n);
//				
//			}
			
		int sum = 0;
		for(int i : score) {
			sum += i;
		}
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + (double)sum / score.length);
		
		System.out.printf("소숫점 둘째까지의 평균 : %.2f\n" , (double)sum / score.length);
		
	}
	
}
