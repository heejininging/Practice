package Collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class CollectionTest2 {

	public static void main(String[] args) {
		//문자열을 저장하는 ArrayList생성
		ArrayList <String> al = new ArrayList<>();
		
		//샘플 데이터 추가
		al.add("one");
		al.add("Three");
		
		//1970년 1월 1일 자정부터 지나온 시간을 밀리초 단위의 정수로 가져오기
		long start = System.currentTimeMillis();
		//두번째에 데이터를 n개 추가
		for(int i = 0; i < 10000; i++) {
			al.add(1, "Two");
		}
		long end = System.currentTimeMillis();
		System.out.println(end - start);
	
		
		//문자열을 저장하는 LinkedList 생성
		LinkedList <String> li = new LinkedList<>();
		
		//샘플 데이터 추가
		li.add("One");
		li.add("Three");
		
		start = System.currentTimeMillis();
		for(int j = 0; j < 10000; j++) {
			li.add(1, "Two");
		}
		end = System.currentTimeMillis();
		System.out.println(end - start);
		System.out.println(li);
	
	
	}
	
}
