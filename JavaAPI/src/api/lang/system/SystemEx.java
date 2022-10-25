package api.lang.system;

public class SystemEx {

	public static void main(String[] args) {
		
		System.out.println("출력");
		
//		System.exit(0);
//		System.gc();
		
		//1970/1/1이후 ~ 현재까지의 지나온 시간을 밀리초로 환산
		long start = System.currentTimeMillis();
//		System.out.println(start);
		
		long sum = 0;
		for(long i = 1; i < 1000000000L; i++) {
			sum += i;
		}
		
		long end = System.currentTimeMillis();
//		System.out.println(end);
		
		//밀리초 단위로 계산되는 시간 출력
		System.out.println((end - start) * 0.001 + "초 소요됨");
		
	}
	
	
	
}
