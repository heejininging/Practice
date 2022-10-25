package day03;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDelete {

	public static void main(String[] args) {
		
		//배열에서 삭제개념은 없습니다.
		//index의 값을 지울수는 없다.
		//지워진 것처럼 표현은 할 수 있는데 뒤의 원소들을 앞으로 가져와야함
		//지우고싶은 인덱스 값부터 ~ 앞으로 당기면 맨 뒷자리가 공백이므로 length의 -1
		/*int[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		//5를 지워진것처럼 표현하기
		for(int i = 4; i < arr.length-1; i++) {
			arr[i] = arr[i+1];
		}
		
		System.out.println(Arrays.toString(arr));
		*/
		Scanner scan = new Scanner(System.in);
		
		String [] arr = {"어피치", "라이언", "제이지", "네오", "무지", "튜브"};
		
		System.out.print("삭제할 이름>");
		String name = scan.next();
		
		int count = arr.length;//삭제가 일어날 때 하나씩 감소
		
		for(int i = 0; i < count; i++) {
			
			if(name.equals(arr[i])) {
			for(int j = i; j < count-1;j++) {//i번째의 원소 뒤를 앞으로 당긴다.
				arr[j] = arr[j+1];//찾은 위치에서 뒤 원소를 앞으로 당긴다.
			}
				count--;//갯수 감소, 배열 마지막 부분의 공간이 공백이기 때문에 지워준다.
			}
		}
		
			//출력
			String str = "[";
			
			for(int i = 0; i < count; i++) {
				str += arr[i];
				if(i == count-1) {
					str += "]";
					break;
				}
				str += ", ";
			}
			
			System.out.println(str);
	}
	
}
