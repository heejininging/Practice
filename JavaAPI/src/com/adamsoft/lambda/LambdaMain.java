package com.adamsoft.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaMain {
 
	public static void main(String[] args) {

		
		//배열의 정렬
		String[] arr = {"wow", "fantastic", "unvilibable", "dynamic"};
	
		
		//Comparator인터페이스는 메서드가 1개ㅂ밖에 없으므로 람다로 표현하는것이 가능
		//람다를 만들 때는 인터페이스 이름과 메서드 이름은 중요하지 않음
		//매개변수의 갯수와 리턴타입만 확인하면 된다.
		//매개변수는 2개이고 리턴타입은 정수입니다.
		//매개변수가 1개이면 () 생략가능
		//리턴하는 문장만 존재한다면 {}와 리턴 세미콜론 생략가능 
		//메서드의 매개변수로 코드(함수)를 대입한것처럼 보이도록함
		//메서드의 매개변수로 코드(함수)를 대입할 수 있는 방식을 함수형 프로그래밍이라고 한다.
		Arrays.sort(arr,(o1, o2) -> o2.compareTo(o1));
		
		
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
