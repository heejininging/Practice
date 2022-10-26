package com.adamsoft.stack;

import java.util.Date;
import java.util.Stack;

public class MainClass {

	public static void main(String[] args) {
		//PersonVO 인스턴스를 저장할 수 있는 Stack을 생성
		Stack <PersonVo> stack = new Stack<>();
		//Stack에 데이터 저장 - push
		stack.push(new PersonVo("카리나", new Date(100,3,11), "01011112222", 1));
		stack.push(new PersonVo("아이유", new Date(121,5,21), "01033334444", 2));
		
		//Stack에서 데이터 꺼내기
		System.out.println(stack.pop()); //PersonVo [name=아이유, birthday=Mon Jun 21 00:00:00 KST 2021, phone=01033334444, num=2]
		System.out.println(stack.pop()); //PersonVo [name=카리나, birthday=Tue Apr 11 00:00:00 KST 2000, phone=01011112222, num=1]
		
		//데이터가 없는 상태에서 pop을 수행해서 Underflow발생 - 예외발생
		System.out.println(stack.pop());
		/*
		 * Exception in thread "main" java.util.EmptyStackException
			at java.base/java.util.Stack.peek(Stack.java:101)
			at java.base/java.util.Stack.pop(Stack.java:83)
			at com.adamsoft.stack.MainClass.main(MainClass.java:18)
		 */
	}
}
