package day08.static_.basic;

public class Calculator { //사용자클래스
	
	//계산시마다 다른값을 지닌다면 일반변수
	//계산시마다 똑같은 값이라면 정적변수
	private String model;
	private int result;
	public static double pi = 3.14; // 항상 똑같은 값, 정적변수
	
	//일반 멤버변수를 사용하는 메서드는 static이면 안된다.
	//return의 값은 일반 멤버변수, 그래서 static pi 정적변수는 메서드에 사용불가능
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	
	/*
	 * 일반 변수를 사용하지 않고, 범용성 있게 사용할 메서드는 static을 붙이면 좋다.
	 */
	public static double circle(int r) {
		return Math.PI *r *r;
	}
	
	
	
}
