package Generic;

class GenericEx <T>{
	private T [] data;
	
	//...은 variable args(가변인수)로 갯수에 상관없이 매개변수를 받고자 할 때 사용, 받은 매개변수들은 배열로 만들어진다.
	public GenericEx(T...n) {
		this.data = n;
	}
		
	//배열의 데이터를 순차적으로 접근해서 출력하는 메서드
	public void display() {
		for(T temp : data) {
			System.out.println(temp);
		}
	}
	
}


public class Generics {

	public static void main(String[] args) {
		//제너릭이 적용된 클래스의 인스턴스 만들기
		GenericEx <String> g1 = new GenericEx<String>("Karina", "Suzi", "IU");
		g1.display();
		GenericEx <Integer> g2 = new GenericEx<>(100,200,400,300);
		g2.display();
	}
	
}
