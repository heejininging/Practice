package RandomClass;

import java.util.Random;
import java.util.UUID;

public class RandomTest {

	public static void main(String[] args) {
		//seed를 사용하지않는 경우와 사용하는 경우의 차이
		//여러번 실행해보고 확인
		
		//java에서는 seed를 설정하지 않으면 seed가 랜덤
		Random r = new Random();
		System.out.println(r.nextInt());//양수와 음수 랜덤출력

		//seed를 설정하면 고정된 숫자가 return
		r = new Random(42);
		System.out.println(r.nextInt());//-1170105035
		
		r = new Random();
		//배열내에 존재하는 요소만 랜덤하게 추출
		int[] ar = { -1, 1, 2, 3, 4, 5 };
		String[] monster = {"슬라임", "멧돼지", "발록", "슬라임"};
		for(int i = 0; i<10; i++) {
//			System.out.println(r.nextInt(6) +1);//0~5까지의 숫자에서 +1을 하면 1~6
//			System.out.println(ar[r.nextInt(ar.length)]);
			System.out.println(monster[r.nextInt(monster.length)]);
		}
		
		//랜덤한 문자열 추출
		System.out.println(UUID.randomUUID().toString());
		
	}
	
}
