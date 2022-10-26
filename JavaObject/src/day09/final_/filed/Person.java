package day09.final_.filed;

public class Person {

	/*
	 * final변수는 초기값을 변경할 수 없기 때문에
	 * 직접 초기값을 지정하거나 or 생성자를 통해서 초기화를 해야합니다.
	 */
	
	public final String nation = "대한민국";//초기값 지정
	public final String ssn;
	public String name;
	
	//생성자 생성 후 초기화
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
	
	
}
