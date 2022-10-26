package day09.inter.basic2;

public class Basic implements BasicInter{

	//인터페이스에 있는 메서드들을 가져와서 오버라이딩해서 사용
	public void insert(int a) {
		System.out.println("insert");
	}

	public void info() {
		System.out.println("info");
	}

	public String getInfo() {
		System.out.println("getinfo");
		return "get!";
	}

	public int delete(int a) {
		System.out.println("delete");
		return 0;
	}
}
