package day06.this_;

public class Student extends Person {
	
	Student(){}
	
	Student(String name, int age, String studentId){
		this.name = name;
		this.age = age;
		this.studentId = studentId;
	}
	
	String studentId;//학번
	
	String info(){
		return "이름: " + name + ", 나이: " + age + ", 학번 : " + studentId;
	}
}
