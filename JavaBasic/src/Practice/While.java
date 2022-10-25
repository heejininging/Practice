package Practice;

public class While {

	public static void main(String[] args) {
		
		//금액을 가장 큰 금액부터 나누어서 각 동전별로 몇 개가 나와야하는지 출력.
		int[] arr = {1000, 500, 100, 50, 10};
		int money = 17780;
		
		/*
		 * 몫,나머지
		 * 1번째
		 * 17780 / 1000 = 17
		 * money = 17780 % 1000 ->780
		 */
		
		/*
		 * 2번째
		 * 780 / 500 1개
		 * money = 780 % 500 -> 280
		 */
		
		int a = 0;
		while(a < arr.length) {
			
//			System.out.println(arr[a]); 를 출력해보면 배열길이 안의 내용이 출력
			System.out.println( arr[a] + "원:" + money / arr[a] + "개");
			money %= arr[a]; //money = money % arr[i]
			
			a++;
			
		}
		
		System.out.println(a);
	}
	
}
