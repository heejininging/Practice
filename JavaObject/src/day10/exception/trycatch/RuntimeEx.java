package day10.exception.trycatch;

import day06.inherit.good.Person;

public class RuntimeEx {

	public static void main(String[] args) {
		
		// 실행예외 (runtime)
		String s = null;
		
		if(s != null) {
			s.charAt(0);			
		}
		
		// ArrayIndexOut
		int[]arr = {1,2,3};
		arr[5] = 10;
		
		//ClassCast
		Object o = new Object();
		Person p = (Person) o;		
	
		//numberformat
		String m = "홍길동";
		Integer.parseInt(m);
	
	
	
	

	
	}
	
	
}
