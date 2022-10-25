package Collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class CollectionTest3 {

	public static void main(String[] args) {
		//100000개의 데이터를 가진 ArrayList와 LinkedList 생성
		ArrayList<Integer> al = new ArrayList<>();
		for(int i = 0; i < 100000; i++) {
			al.add(i);
		}
		
		LinkedList<Integer> li = new LinkedList<>();
		for(int i = 0; i < 100000; i++) {
			li.add(i);
		}
		
		//ArrayList에서 100000개의 데이터를 읽는데 걸리는 시간 //248
		//데이터를 가저오는 메서드는 get(인덱스)
		long start = System.currentTimeMillis();
		for(int i = 0; i < 100000; i++) {
			System.out.println(al.get(i));
		}
		long end = System.currentTimeMillis();
		System.out.println(end - start);
	
		//LinkedList에서 100000개의 데이터를 읽는데 걸리는 시간 //5884
//		start = System.currentTimeMillis();
//		for(int j = 0; j < 100000; j++) {
//			System.out.println(li.get(j));
//		}
//		end = System.currentTimeMillis();
//		System.out.println(end - start);
	}
	
}
