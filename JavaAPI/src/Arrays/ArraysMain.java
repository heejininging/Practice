package Arrays;

import java.util.Arrays;

public class ArraysMain {

	public static void main(String[] args) {
		String[] singer = {"장원영", "카리나", "지젤", "민지", "태연", "아이유", "수지"};
		
		//이분검색수행 - sort를 하지않아 잘못된 결과가 리턴됨
		int result = Arrays.binarySearch(singer, "태연");
		System.out.println(result);//-8 , 정렬을 먼저 하지않아서 값이 없다고 음수가 출력됌
		
		//데이터 정렬
		Arrays.sort(singer);
		System.out.println(Arrays.toString(singer));
		result = Arrays.binarySearch(singer, "태연");
		if(result >= 0) {
			System.out.printf("%s는(은) %d번째 존재\n", "태연", result+1);
		}else {
			System.out.printf("%s는(은) 존재하지 않음\n", "태연");
		}
		
		
	}
}
