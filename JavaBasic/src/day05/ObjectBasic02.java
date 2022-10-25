package day05;


public class ObjectBasic02 {

	
	public static void main(String[] args) {
		
		System.out.println("=== 1번 계산기 ===");
		Carculator cal = new Carculator();
		
		System.out.println(cal.add(1));
		System.out.println(cal.add(2));
		System.out.println(cal.add(3));
		
		System.out.println("=== 2번 계산기 ===");
		Carculator cal2 = new Carculator();
		
		System.out.println(cal2.add(100));
		System.out.println(cal2.add(200));
	}
	
	
}
