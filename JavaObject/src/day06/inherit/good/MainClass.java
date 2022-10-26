package day06.inherit.good;

public class MainClass {

	public static void main(String[] args) {
		
		Person p = new Person();//부모클래스
		p.age = 10;
		p.name = "부모님";
		System.out.println(p.info());//반환이 있는 값이므로 출력문 안에다가 입력
		
		Student student = new Student();
		student.age = 20;
		student.name = "자식1";
		student.studentId = "1234";
		System.out.println(student.info());

		Teacher t = new Teacher();
		t.age = 30;
		t.name = "자식2";
		t.subject = "과학";
		System.out.println(t.info());
		
		
		
		
	}
}
