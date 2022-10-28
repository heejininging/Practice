package com.adamsoft.nestedclass;
//private 사용 불가능 
public class Outer {
	//내포클래스 - 다른 클래스 안에 만들어진 클래스 (private 사용가능)  
	class Inner {
		public int num;
	}
	
	//내포클래스 안에 static 멤버가 있으면 인스턴스 생성없이 사용할 수 있도록 static을 추가 
	//java17버전은 자동으로 변환시켜주므로 static을 붙여도되고 안 붙여도된다. 
	static class staticInner {
		public int num;
		public static int share;
	}
	
	//한개의 로컬클래스로 여러개의 메서드를 사용하려면 , 바깥에 클래스를 선언하고 메서드에서 사용한다. 
	/*
	 * class LocalInner{
			public int num;
		}
		
		public void method() {}
		public void method1() {}
		
	 */
	
	public void method() {
		//메서드 안에 만들어진 클래스 - LocalInner 
		//메서드 안에서만 사용이 가능한 클래스 
		class LocalInner{
			public int num;
		}
	}
	
}
