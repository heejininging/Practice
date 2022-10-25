package day05;

public class PhoneMain {

	public static void main(String[] args) {
		//객체1(기본생성자는 필수로 생성하기)
		Phone red = new Phone(); 
		red.info();
	
		//객체2
		Phone blue = new Phone("가로본능");//외부에서 받은 값을 초기값으로.
		blue.info();
			
		//객체3
		Phone black = new Phone("세로본능", 3000);
		black.info();
		
		//위와 같이 하나의 생성자로 여러개를 만드는 것을 오버로드라고 한다.
	
		//객체4
		Phone white = new Phone(4000, "큐리텔");
		white.info();
		
		
		//모든 멤버변수를 매개변수로 받는 생성자를 만들고
		//초록, 10000, 아이폰을 전달해서 객체생성
	
		Phone green = new Phone(10000, "아이폰", "초록");
		green.info();
	}
	
		
	
}
