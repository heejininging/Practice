package day08.poly.instanceof_;

public class Employee extends Person {


	Employee(String name, int age, String department){
		super(name,age);
		//위의 구문과 아래의 주석구문은 같은 구문이다. 결과는 같음. this를 해서 불러오는것과 super로 불러오는것은 같음.
		//super();
		//this.name = name;
		//this.age = age;
		this.department = department;
	}
	
	String department;//부서
	
	String info() {
//		super.메서드() - 오버라이딩 된 메서드에서 부모님의 원형메서드가 필요할 때 사용가능
		
		String result = super.info();
		return result + ", 부서 : " + department;
		
//		return super.info() + ", 부서 : " + department;
	}
	
	
}
