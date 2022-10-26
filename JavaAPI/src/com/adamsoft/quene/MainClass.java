package com.adamsoft.quene;

import java.sql.Date;
import java.util.Comparator;
import java.util.PriorityQueue;

import com.adamsoft.stack.PersonVo;

public class MainClass {

	
	public static void main(String[] args) {
//		PriorityQueue는 데이터를 정렬된 순서대로 꺼낼 수 있도록 해주는 클래스
		
		//정수를 저장하는 PriorityQuene를 만들어서 출력
		PriorityQueue<Integer> intQuene =
				new PriorityQueue<>();
		//데이터 저장 - 정렬을 하면서 저장한것이 아니고 tree구조로 저장됌
		intQuene.offer(100);
		intQuene.offer(70);
		intQuene.offer(90);
		
		//데이터 꺼내기
		System.out.println(intQuene.poll()); 
		System.out.println(intQuene.poll());
		System.out.println(intQuene.poll());
		
		//에러랑 예외를 구분하자
		
		//PersonVo 클래스를 저장하는 우선순위 Quene
		//이 상태에서 만들면 PersonVo의 크기를 비교할 수 없기 때문에 예외발생
		//PriorityQueue<PersonVo> persons = new PriorityQueue<>();
		
		
		/*
		 * PersonVo 클래스에 Comparable 인터페이스를 implements하고
		 * compareTo라는 메서드를 재정의해서 해결할 수 있고
		 */
		/*
		 * Comparator 인터페이스를 대입받을 수 있는 경우에는 comparator 인터페이스를 구현한
		 * 클래스의 인스턴스를 이용해서 생성해도 된다.
		 */
		//정렬을 할때는 크기비교를 할 수 있어야한다.
		PriorityQueue<PersonVo> persons =
				new PriorityQueue<>(new Comparator<PersonVo>() {

					@Override
					public int compare(PersonVo o1, PersonVo o2) {
						
						return o1.getName().compareTo(o2.getName());
					}
					
				});
		
		persons.offer(new PersonVo(
				"아담", new Date(200,10,11), "01011112222", 1));
		persons.offer(new PersonVo(
				"수지", new Date(100,11,11), "01033334444", 2));
		persons.offer(new PersonVo(
				"자바", new Date(150,04,07), "01055556666", 3));
		
		System.out.println(persons.poll());
		System.out.println(persons.poll());
		System.out.println(persons.poll());
		
	}
}
