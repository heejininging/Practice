package day07.modi.member.pac2;

import day07.modi.member.pac1.A;

public class C {
	
	public C() {
		A a = new A();// A생성
		a.var1 = 1; //public만 사용가능
//		a.var2 = 2; //default는 사용 불가능 (같은 패키지가 아니어서)
//		a.var3 = 3; //private는 사용 불가능 (같은 클래스가 아니어서)
		
		a.method01();
//		a.method02();//default는 사용 불가능 (같은 패키지가 아니어서)
//		a.method03();//private는 사용 불가능
		
	}

}
