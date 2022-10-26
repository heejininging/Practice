package day08.poly.basic2;


public class House {//사용자클래스
	
	//배열을 전달하라는 말 xxx
	/*
	 * 1. 멤버변수로 크기가 100개인 Person배열을 선언
	 * 2. 배열의 순서를 사용할 count변수 선언
	 * 3. void setPerson(???) 모든 자식클래스를 받을 수 있도록 선언하세요.
	 *    기능 - 멤버변수에 매개변수를 순서대로 저장되는 기능
	 *    
	 * 4. 메인클래스에서는 3명의 Person을 전달하세요.
	 */

	//1.접근제어자를 같이 사용하면 좋을 것 같다!
	private Person[] arr = new Person[100];
	
	//2.
	private int count = 0;

	
	
	//3.

	public void setPerson(Person p) {//p의 값을 arr에 순서대로 넣어야한다.
		arr[count] = p;
		count++;
		
//		for(int i = 0; i < arr.length; i++) {
//			this.arr = arr;
//			count++;
//		}
	}
	
	public Person[] getArr() {
		return arr;
	}
	
	
	
	
	
	
}

