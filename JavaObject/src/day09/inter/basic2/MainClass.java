package day09.inter.basic2;

public class MainClass {

	public static void main(String[] args) {
		
		//인터페이스 실행
		BasicInter basic = new Basic();
		
		basic.insert(0);//호출
		basic.info();
		basic.delete(0);
		
		/*
		 * 출력값
		 * insert
		 * info
		 * delete
		 */
		
		
	}
}
