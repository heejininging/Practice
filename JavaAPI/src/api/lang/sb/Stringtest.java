package api.lang.sb;

public class Stringtest {

	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
		
//		String str = "";
//		for(int i = 1; i < 300000; i++) {
//			str += "A";
//		}
	
//		StringBuffer를 사용해서 객체생성 시간 단축
		StringBuffer sb = new StringBuffer("");
		for(int i = 1; i < 300000; i++) {
			sb.append("A");
		}
		
		
		
		
		long end = System.currentTimeMillis();
		
		System.out.println( (end - start) * 0.001 );
		
		
	}
	
}
