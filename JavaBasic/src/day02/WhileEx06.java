package day02;

public class WhileEx06 {
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10};//{0,1,2,3,4,5,6,7,8,9}번째 배열
		
		int i = 0; //배열의 시작은 0부터 이므로 변수의 값을 0으로 주어진다.
		int sum = 0; //누적변수
		while(i < arr.length) {//length는 배열의 길이를 구하는 뜻
			
			
			sum += arr[i];
			
			i++;
		}
		
		System.out.println("배열요소의 합 :" + sum);
	}

}
