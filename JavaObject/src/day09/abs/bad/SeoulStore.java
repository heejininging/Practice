package day09.abs.bad;

public class SeoulStore extends Store{

	//부모님 클래스에 있는 3개의 메서드를 반드시 오버라이딩 해야하는데, 하지 못했을 경우.
	public void apple() {
		System.out.println("서울의 사과는 500원");
	}
	
	public void melon() {
		System.out.println("서울의 멜론은 600원");
	}
	
}
