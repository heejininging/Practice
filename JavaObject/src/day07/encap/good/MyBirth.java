package day07.encap.good;

public class MyBirth {

	private int year;
	private int month;
	private int day;
	private String ssn;
	
	/*
	 * 은닉된 변수에 접근할 때 클래스설계자가 만들어 놓은
	 * getter/setter메서드를 사용합니다.
	 * 
	 * ★규칙
	 * 메서드명이 get시작(값을 얻는다.)
	 * 메서드명이 set시작(값을 저장한다.)
	 * 
	 * set메서드
	 * 1. 값을 저장하는 메서드
	 * 2.public으로 선언하고 set + 멤버변수명으로 저장
	 */
	
	
	public void setYear(int year) {
		
		//유효값 검증
		if(year > 2022 || year < 1900) {
			System.out.println("년도는 1900~2022년 까지 입니다.");
		}else {
			System.out.println("저장완료");
			this.year = year;
		}
	}
	
	public void setMonth(int month) {
		
		if(month >= 1 && month <= 12) {
			System.out.println("저장완료");
			this.month = month;
		}else {
			System.out.println("월은 1월부터 12월까지 입력할 수 있습니다.");
		}
	}
	
	public void setDay(int day) {
		
		if(day < 1 || day > 31) {
			System.out.println("일자는 1일부터 31일까지 입력할 수 있습니다.");
		}else {
			System.out.println("저장완료");
			this.day = day;
		}
		
	}
	
	public void setSsn(String ssn) {
		String s = ssn.replace("-", "");//replace는 메서드이므로 반환값을 설정해야함
		
		if(s.length() > 13) {
			System.out.println("주민등록번호는 13자리까지만 입력가능합니다.");
		}else if(s.length() < 13){
			System.out.println("주민등록번호를 더 입력하세요.");
		}else {
			System.out.println("저장완료");
			this.ssn = ssn;
			
		}
	
	}
	
	/*
	 * get메서드
	 * 1. 값을 조회하는 메서드
	 * 2. public으로 선언하고 get + 멤버변수명으로 저장 
	 * 3. 반환값이 반드시 있다.
	 */
	
	public int getYear() {
		return year;
	}
	
	public int getMonth() {
		return month;
	}
	
	public int getDay() {
		return day;
	}
	
	public String getSsn() {
		return ssn;
	}
	
	public void info() {
		System.out.println("생일은 " + year +"년 " + month + "월 " + day + "일 입니다.");
	}
	
}
