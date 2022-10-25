package day05;

//대량생산을 목적으로 하는 class는 main이 없습니다.
public class Pen {

	//클래스에서 속성을 나타내는 것을 멤버변수라고 부릅니다.(field)
	//선언만 가능
	String color;
	int price;
	String company;
	
	//class에서 기능을 나타내는것을 메서드로 부릅니다.
	void write() {
		System.out.println(color + "글씨를 씁니다.");
	}
	
	
	void info() {
		System.out.println("===펜의 정보===");
		System.out.println("색상" + color);
		System.out.println("가격" + price);
		System.out.println("제조사" + company);
		
	}
}
