package day08.poly.basic;

public class MainClass {

	public static void main(String[] args) {
		
		
		Child c = new Child();
		c.method01();//상속
		c.method02();//오버라이드
		c.method03();
		
		System.out.println("==다형성==");
		/*
		 * 자식이 부모에 저장되는데, 부모님처럼 사용되지만 
		 * 단, 자식의 오버라이딩 된 메서드가 실행됩니다.
		 */
		Parent p = c;//Parent p = new Child();
		p.method01();
		p.method02();//다형성을 적용해도 child에서 메서드가 오버라이드되면 자식의 메서드로 출력
//		p.method03();//
		System.out.println(p == c);//true 동일한 주소값을 나타냄
		
		System.out.println("==클래스 캐스팅==");
		//다형성이 적용되면, 자식이 가지고 있던 본래의 기능을 사용할 수 없기 때문에,클래스 캐스팅을 사용합니다.
		
		Child cc = (Child)p;//다시 child의 메서드를 사용할 수 있게 캐스팅ㅍ형변환
		cc.method01();
		cc.method02();
		cc.method03();
		
		System.out.println("==주의할 점==");
		//객체가 다형성이 적용되지 않았으므로 캐스팅되지 않는다.
		Parent pp = new Parent();//자식이 부모에 저장되지 않았기 때문에 부모를 자식으로 형변환할 수 없다.
		Child ccc = (Child)pp;
		
		
		
		
		
		
		
	}
	
}
