package day06.super_;

public class Person {//부모클래스

	String name;
	int age;
	
	
	Person () {//멤버변수와 매개변수 명의 중복이 없을 경우 오류가 뜨지 않는다.
		this("홍길동", 1);
	}
	
	Person(String name){
		this(name,1);
	}
	
	Person(String name, int age){
		super();
		this.name = name.toUpperCase();	
		this.age = age;
		
//		System.out.println("100개짜리 생성자가 호출됨"); - 여러개의 출력문을 모든 생성자에 적용하고 싶을 경우
	}
	
	String info() {
		return "이름: " + name + ", 나이: " + age;
	}
	
}
