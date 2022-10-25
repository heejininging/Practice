package day03;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInsert {

	public static void main(String[] args) {
		//[문자의 배열]		
		
		//배열의 한계점 - 크기가 고정
		//입력받은 문자열을 배열에 순서대로 저장
		Scanner scan = new Scanner(System.in);
		
		String arr[ ] = new String [100];
		
		int count = 0;//인덱스를 나타내는 변수
		
		//"그만" 문자가 들어오기 전까지 입력.
		while(true) {
			
			System.out.print(">");
			String menu = scan.nextLine();

			if(menu.equals("그만")) {
				break;
			}
			
			arr[count] = menu;//인덱스 0부터 입력한 값 저장
			count++;//인덱스 수 증가
		}
		
		//출력도 반복되지 않게 입력해줘야함
		String str = "[";
		
		
		for(int i = 0; i < count; i++) {//인덱스의 미만으로 조건설정
			str += arr[i];//"[" + arr[i]
			if(i == count-1) {
				str += "]";
				break;
			}
			str += ", "; // "[" + ", "
		}
		
		System.out.println(str);//[3, 4, 5, 6] 입력한만큼만 출력
		System.out.println(Arrays.toString(arr));//[3, 4, 5, 6, null, null, null, null, null,...] 반복된 출력
		
	}
}
