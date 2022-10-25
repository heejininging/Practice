package api.lang.object;

public class MainClass {

	public static void main(String[] args) {
		
		Person p = new Person("홍길동");
		
		//toString
		String str = p.toString();
		System.out.println(str);
		
		//반환이 있는 경우
		System.out.println(p.toString());

		
		//equals()
		Person p2 = new Person("홍길동");
		boolean bool = p.equals(p2);
		System.out.println(bool);
		
		//clone() - 객체복사
		try {
			Object obj = p.clone();
			Person p3 = (Person)obj;
			
			System.out.println("복사된 객체의 name : " + p3.getName());
			System.out.println(p3 == p);
			
		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
		}
		
		
		
		
		
		
	}
	
}
