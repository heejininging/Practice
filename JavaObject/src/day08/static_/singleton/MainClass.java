package day08.static_.singleton;

public class MainClass {

	public static void main(String[] args) {
		
//		Singleton s = new Singleton();

		Singleton s = Singleton.getInstance();
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		System.out.println(s == s1 && s1 == s2); //true
		
		//동일한 변수가 사용된다. static을 사용해서.
		s.site = "이순신";
		System.out.println(s.site); //이순신
		System.out.println(s1.site); //이순신
		System.out.println(s2.site); //이순신
	}
	
}
