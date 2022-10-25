package Arrays;

public class RecursionFibonacci {

	public static void main(String[] args) {
		
		System.out.println(fibonacci(100));  
		//출력시간이 오래 걸린다.
		//재귀를 이용한 피보나치는 시간이 오래걸린다. (코딩테스트에 안씀)
	}
	
	//n번째 피보나치 수열의 값을 리턴해주는 메서드
	public static int fibonacci(int n) {
		//첫번째와 두번째는 1
		if(n == 1 || n == 2) {
			return 1;
		}
		//세번째부터는 첫번째 두번째의 합
		else {
			return fibonacci(n-1) + fibonacci(n-2);
		}
	}
	
	
}
