package day03;

import java.util.Scanner;

public class ArraySearch2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//순차탐색과 문자열 비교
		String[]arr = {"홍길동", "이순신", "카카오", "네이버", "박찬호" };
		
		String name = scan.next();
		
//		if( name.equals("홍길동") ) {//문자열 비교에 == 은 사용하지 않음
//			//name == "홍길동" (x)
//			System.out.println("같음");
//		}
		
		int index = -1;
		
		for(int i = 0; i < arr.length; i++) {
			
			if( name.equals(arr[i]) ) {
				index = i;
				break;
			}
			
		}
//		System.out.println("인덱스의 위치 : " + index);
		if(index == -1) {
			System.out.println(name + "은 없습니다.");
		}else {
			System.out.println(name + "은 " + index + "번째에 위치합니다.");
		}
		
		
		
		
	}
}
