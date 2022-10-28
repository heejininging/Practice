package com.adamsoft.stream;

import java.util.ArrayList;

public class LoopingMain {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		list.add("java");
		list.add("python");
		list.add("C");
		list.add("C++");
		list.add("js");
		list.add("last");
		
		//전체데이터 출력 - 실행속도는 가장 빠르지만 list의 데이터갯수가 변경되면 수정을 해야한다.
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		System.out.println(list.get(4));
		
		System.out.println("--------------------");
		//반복문 이용 - list의 데이터갯수를 이용해서 순회를 하면 list 데이터갯수가 변경되도 수정을 할 필요가 없다.
		for(int i =0 ; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("--------------------");
		//변하지 않는 메서드의 호출결과를 반복문에서 여러번 호출하는것은 자원낭비 ( 그래서 변수에 호출을 한번만 주고 변수를 사용 )
		int len = list.size();
		for(int i =0 ; i < len; i++) {
			System.out.println(list.get(i));
		}
		System.out.println("--------------------");
		//모든 데이터를 순회하는 경우라면 빠른 열거를 사용하는것이 효율적
		for(String all : list) {
			System.out.println(all);
		}
		System.out.println("--------------------");
		//빠른열거는 반복자를 외부에 만들어서 사용하는데 Stream API는 내부반복자를 사용한다.
		list.stream().forEach(all -> {
			System.out.println(all);
		});
	}
	
}
