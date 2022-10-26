package day07.modi.member.pac1;

public class B {

	//A의 기능을 사용하고 싶을 경우 : A가 생성되어 있어야 함
	
	public B() {
		A a = new A();// A생성
		a.var1 = 1;
		a.var2 = 2;
//		a.var3 = 3; //private는 사용 불가능
		
		a.method01();
		a.method02();
//		a.method03();//private는 사용 불가능
		
	
	}
	
	
}
