package day08.static_.var;

public class MainClass {

	public static void main(String[] args) {
		
		Count c1 = new Count();
		c1.a++;
		c1.b++;
		System.out.println("일반변수1 : " + c1.a);
		System.out.println("정적변수1 : " + c1.b);
		
		Count c2 = new Count();
		c2.a++;
		c2.b++;
		System.out.println("일반변수2 : " + c2.a);
		System.out.println("정적변수2 : " + c2.b);
		
		Count c3 = new Count();
		c3.a++;
		c3.b++;
		System.out.println("일반변수3 : " + c3.a);
		System.out.println("정적변수3 : " + c3.b);
		
		//지금 c1.b , c2.b 는 마지막에 증가한 값을 전부 다 똑같이 갖게 된다. (값 - 3)
		
		//static은 객체 생성없이 바로 접근가능하다.
		//Count클래스에 있는 static변수 b에 바로 접근가능
		Count.b++; //4
	}
	
}
