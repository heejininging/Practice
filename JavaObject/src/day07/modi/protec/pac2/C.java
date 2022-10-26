package day07.modi.protec.pac2;

import day07.modi.protec.pac1.A;
//상속가능
public class C extends A{
	
	public C () {//패키지가 다르므로 접근 불가능
//		A a = new A();
//		a.s = "홍길동"; 
//		a.method();
		
		
		//패키지가 다르더라도 super키워드를 통한 접근은 가능
		super();
		super.s = "홍길동";
		super.method();
		
	}

}
