package day09.inter.inherit;

public class MyClass implements Inter3{

	@Override
	public void some1() {
		System.out.println("inter1의 some1 오버라이드");
		
	}

	@Override
	public void some2() {
		System.out.println("inter1의 some2 오버라이드");
		
	}

	@Override
	public void some3() {
		System.out.println("inter2의 some3 오버라이드");
		
	}
	
	public void some5() {
		System.out.println("inter3의 some5 오버라이드");
	}

	
	
}
