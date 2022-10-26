package day09.final_.filed;

public class MainClass {

	public static void main(String[] args) {
		
		Person hong = new Person("123123-123123", "홍길동");
		//final을 맴버변수에 지정햇을 경우 값의 변경 금지
//		hong.nation = "434525-4342342";
		
		
		Person park = new Person("222222-222222", "박찬호");
		
		System.out.println(hong.ssn);
		System.out.println(park.ssn);
		
		///////////////////////////
		//상수의 사용
		System.out.println(Constant.EARTH_RADIUS);
		System.out.println(Constant.PI);
		System.out.println(Math.PI);
		System.out.println(Math.E);
		
		
		
	}
	
	
}
