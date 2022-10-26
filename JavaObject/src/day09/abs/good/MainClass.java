package day09.abs.good;

public class MainClass {

	public static void main(String[] args) {
		
		//1. 추상클래스는 객체 생성이 안됩니다.
		// 반드시 자식으로 구체화 됩니다.
		
//		Store ss = new Store();//추상클래스 생성 안되는 예시
		
		Store s = new SeoulStroe();
		s.apple();
		s.melon();
		s.orange();
		System.out.println(s.getName());//상속받은
		
		Store s1 = new BusanStore();
		s1.apple();
		s1.melon();
		s1.orange();
		
		
		
		
		
	}
	
	
	
}

