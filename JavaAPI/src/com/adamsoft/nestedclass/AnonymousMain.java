package com.adamsoft.nestedclass;

import java.util.Arrays;
import java.util.Comparator;

//메서드가 한개인 인터페이스 
interface Sample{
	//추상메서드 선언 
	public void display();
}

//인터페이스를 구현한 클래스
class SampleImpl implements Sample{
	//추상메서드에 출력문을 넣기 위해 오버라이딩 
	@Override
	public void display() {
		System.out.println("클래스를 만들어서 사용한 메서드");
		
	}
	
}

public class AnonymousMain {

	public static void main(String[] args) {
		//인터페이스를 구현한 클래스의 인스턴스를 생성해서 메서드 호출
		Sample sample = new SampleImpl();
		sample.display();
		//인스턴스를 여러개 만들어야한다면 클래스를 만드는 것이 효율적
		
		System.out.println("--------------------------------------");
		
		//인스턴스가 1개만 필요하다면 클래스를 만들지 않는것이 효율적
//		Sample 인터페이스를 anonymous로 사용
		new Sample() {
			public void display() {
				System.out.println("클래스를 생성하지 않고 사용한 메서드");
			}
			
		}.display();
		
		//배열의 정렬
		String[] arr = {"wow", "fantastic", "unvilibable", "dynamic"};
		
		//배열의 내림차순정렬 
		//Arrays.sort(배열, 비교를 위한 comparator<T> 인터페이스를 구현한 클래스의 객체) 를 호ㅍ출해야함
		Arrays.sort(arr, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
			
		});
		//배열의 요소를 빠르게 확인
		System.out.println("Arrays.toString을 이용한 빠르게 확인");
		System.out.println(Arrays.toString(arr));
		//배열의 요소를 하나씩 확인
		System.out.println("향상된 for문 을 이용한 배열요소 하나씩 확인");
		for(String one : arr) {
			System.out.println(one);
		}
	}
}
