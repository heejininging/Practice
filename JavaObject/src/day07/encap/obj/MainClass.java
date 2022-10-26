package day07.encap.obj;

public class MainClass {

	public static void main(String[] args) {
		
		Hotel hotel = new Hotel();
		
		//setter의 사용방법은 아래의 두개와 같다.

		//hotel.setChef(new Chef());
		Chef chef = new Chef();
		hotel.setChef(chef);
		
		//getter의 사용방법(같은 타입으로 반환을 한다.) int - int, String - String, class - class
		Chef c = hotel.getChef();		
		c.cooking();//요리사
		
		
		System.out.println(chef == c);//true
		
	}
}
