package day06.this_;

public class Employee extends Person {

	Employee(){
		
	}

	Employee(String name, int age, String department){
		this.name = name;
		this.age = age;
		this.department = department;
	}
	
	String department;//부서
	
	String info() {
		return "이름: " + name + ", 나이: " + age + ", 부서 : " + department;
	}
	
	
}
