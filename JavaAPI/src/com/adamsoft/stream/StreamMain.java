package com.adamsoft.stream;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.OptionalDouble;

public class StreamMain {

	public static void main(String[] args) {
		//숫자형태의 문자열의 리스트
		ArrayList<String> list = new ArrayList<>();
		list.add("1");
		list.add("6");
		list.add("7");
		list.add("4");
		list.add("3");
		list.add("9");


		//최종연산을 이용해서 출력
		//forEach는 매개변수 1개를갖고 리턴이 없는메서드를 매개변수로 받음
		//Collection 의 모든 데이터를 매개변수에 대입해서 내용을 수행 

		//list안의 데이터를 순차적으로 i(아무 변수)에 대입해서 {} 안의 내용을 수행 
		//최종작업만 수행해서 데이터 출
		//		list.stream().forEach(i -> { System.out.println(i);});

		//데이터 3개만 출력
		//		list.stream().limit(3).forEach(e -> { System.out.println(e);});

		//데이터정렬 후 출력(오름차순)
		//		list.stream().sorted().forEach(o ->{ System.out.println(o);});

		//데이터 정렬 후 출력(내림차순)
		//sorted메서드에 내림차순 정렬을 위한 Comperator 인터페이스를 구현한 클래스의 객체를 설정하면 됩니다.
		//Comparator인터페이스는 매개변수가 2개이고 정수를 리턴하는 메서드 1개만 존재합니다.

		//		list.stream().sorted(new Comparator<String>() {
		//
		//			@Override
		//			public int compare(String o1, String o2) {
		//				// TODO Auto-generated method stub
		//				return o2.compareTo(o1);
		//			}
		//			
		//		}).forEach(p ->{System.out.println(p);});

		//람다(함수 인터페이스)를 활용한 내림차순
		//		list.stream().sorted((o1,o2) -> o2.compareTo(o1)).forEach(w ->{System.out.println(w);});

		//데이터를 정수로 변환해서 정렬
		//중간처리 메서드 중에는 Int로 리턴해주는 mapToInt라는 메서드가 존재하고,
		//이 메서드를 사용할때는 변환에 사용하는 메서드를 설정만 해줌
		//클래스이름 :: 메서드이름 
		//문자열을 정수로 변환해서 합계 구하기 
		//		int re = list.stream()
		//		.mapToInt(Integer :: parseInt)
		//		.sum();
		//		System.out.println(re);

		//filter: 조건에 맞는 데이터만 추출
		//조건에 맞는 추출하고자 할때는 하나의 매개변수를 받아서 boolean을 리턴하는 람다를 만들어서 대입 
		//홀수의 합을 구하라. 
//		int re2 = list.stream()
//				.mapToInt(Integer :: parseInt)
//				.filter(t -> t % 2 == 1)
//				.sum();
//		System.out.println(re2);

		//홀수의 평균을 구하라.
		/*
		 * 자바에서는 OptionalDouble 이 됩니다.
		 * optional이 붙으면 null을 저장할 수 있는 자료형이 되며,
		 * isPresent 라는 메서드를 이용해서 null여부를 판단하고
		 * get이라는 메서드를 이용해서 값을 가져옵니다.
		 */
		OptionalDouble re3 = list.stream()
//		.mapToDouble(Double :: parseDouble)
		.mapToInt(Integer :: parseInt)		
		.filter(q -> q % 2 == 1)
		.average();
		
		
		//연산을 정상적으로 수행한 경우 ( 성공과 실패를 알려주는 isPresent() ) 
		if(re3.isPresent()) {
			System.out.println(re3.getAsDouble());	
		}else {
			System.out.println("연산에 실패했습니다.");
		}
		
		//숫자의 경우는 크기비교가 가능해서 별도의 인스턴스를 대입하지 않아도 정렬이되고,
		//내림차순을 하고자하는 경우 reverse옵션 설정해주면 됩니다.
		list.stream()
		.map(Integer :: parseInt)
		.filter(Comparator.reverseOrder())
		.forEach(u -> System.out.println(u));

	}
}
