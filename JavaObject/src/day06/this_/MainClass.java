package day06.this_;

public class MainClass {

	public static void main(String[] args) {
		
		Person p = new Person();//부모클래스
		System.out.println(p.info());//반환이 있는 값이므로 출력문 안에다가 입력
		
		Person p1 = new Person("honggilja");
		System.out.println(p1.info());
		
		Person p2 = new Person("홍길동" , 20);
		System.out.println(p2.info());

		Person p3 = new Person("leesunsin", 30);
		System.out.println(p3.info());
		
		Teacher t = new Teacher("이순신", 20, "프로그램");
		System.out.println(t.info());
		
		
		
	}
}
