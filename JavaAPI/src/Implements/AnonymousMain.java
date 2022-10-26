package Implements;

//인터페이스 : 상속하는것이 아니고 implements로 구현한다.
interface Star {
	public void attack();
}

//인터페이스를 구현한 클래스 생성
class Protoss implements Star{

	@Override//추상메서드 implements -> instance
	public void attack() {
		System.out.println("공격");
		
	}
	
}
//여러번 호출이 필요하면 클래스를 따로 구현하고, 한번 사용하는 경우에는 인스턴스를 클래스에 바로 생성한다.
public class AnonymousMain {

	public static void main(String[] args) {
		//인터페이스를 implements한 클래스를 만들고 인스턴스를 만든 후 호출
		Protoss p = new Protoss();
		p.attack();
		
		//인터페이스를 implements한 클래스를 만들지 않고 인스턴스를 클래스에 바로 생성해서 호출
		Star z = new Star() {

			@Override
			public void attack() {
				System.out.println("바로 공격");
				
			}};
			
			z.attack();
		System.out.println("=========================================");	
		
		//다형성
		Star s = new Protoss();
		s.attack();
		
		s = new Star() {

			@Override
			public void attack() {
				System.out.println("다양하게 공격");
				
			}};
			
		s.attack();
		System.out.println("=========================================");
		
		//변수를 만들지 않고 인스턴스만 생성해서 메서드 호출 - 익명객체(람다식)
		new Star() {
			@Override
			public void attack() {
				System.out.println("직접 공격");
			}
		}.attack();
		
		
	}
}
