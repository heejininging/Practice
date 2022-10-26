package day07.encap.good;

public class MainClass {

	public static void main(String[] args) {
		
		MyBirth b = new MyBirth();
		
		b.setYear(2022);//값 저장완료 - 값을 추출해내는 과정
		int year = b.getYear(); //추출한 값을 조회하는 과정
		System.out.println("년도 : " + year);
	
		b.setMonth(12);
		int month = b.getMonth();
		System.out.println("월 : " + month);
		
		b.setDay(31);
		int day = b.getDay();
		System.out.println("일 : " + day);
		
		b.setSsn("123456-7899999");
		String ssn = b.getSsn();
		System.out.println("주민번호 : " + ssn);
		
		b.info();
		
	}
	
}
