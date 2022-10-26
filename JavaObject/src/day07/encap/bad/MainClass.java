package day07.encap.bad;

public class MainClass {

	public static void main(String[] args) {
		
		//변수를 public으로 만들어두면 잘못된 값이 저장될 수 있습니다.
		
		MyBirth b = new MyBirth();
		b.year = 2022;
		b.month = 10;
		b.day = 11;
		b.ssn = "아무값";
		
		b.info();
		
	}
	
}
