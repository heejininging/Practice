package day08.poly.basic2;

public class Teacher extends Person {

	Teacher(){
		
	}
	
	Teacher(String name, int age, String subject){
		super(name,age);
		this.subject = subject;
	}
	String subject;//과목
	
	String info() {
		return "이름: " + name + ", 나이: " + age + ", 과목 : " + subject;
	}
}
