package day08.poly.basic2;

import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {
		
		//다형성을 적용한 배열
		Student s = new Student("홍길동", 11, "22323");
		Teacher t = new Teacher("홍길자", 30, "프로그램");
		Employee e = new Employee("홍길순", 40, "취업지원팀");
		
		//부모타입의 배열에 클래스타입을 한번에 담음
//		Object[] arr = {s,t,e};
		Person[] arr = {s,t,e};
		
		for(Person p : arr) {
			System.out.println(p.info());//오버라이딩된 메서드 실행
		}
		
		System.out.println("===================================");
		
		//클래스 생성자를 이용한 출력
		MainClass c = new MainClass();
		c.printInfo(e);
		c.printInfo(t);
		c.printInfo(s);
		
		System.out.println("==============================");
		
		//static을 이용한 출력
		printInfo(s);
		printInfo(t);
		printInfo(e);
	
		//house객체 생성
		House house = new House();
		house.setPerson(s);//스튜던트 저장
		house.setPerson(t);
		house.setPerson(e);
		
		Person[] ar = house.getArr();
		System.out.println(Arrays.toString(ar));
		
//		for(Person p : ar) {
//			if(p == null) break;//길이가 100만큼 반복되지 않게 하는 조건문
//			System.out.println(p.info());
//		}
	
	}
	
	public static void printInfo(Person p) {//부모타입 매개변수
		System.out.println(p.info());
	}
	
	
	
	
}



	