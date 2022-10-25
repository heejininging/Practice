package api.lang.math;

public class MathEx {

	public static void main(String[] args) {
		
		//올림
		double d = Math.ceil(1.3);
		System.out.println(d);//2.0
		
		//내림
		double d1 = Math.floor(1.2);
		System.out.println(d1);//1.0
		
		//반올림
		double d2 = Math.round(3.14);
		System.out.println(d2);//3.0
		
		//루트값
		double d3 = Math.sqrt(16);
		System.out.println(d3);//4
		
		//절대값
		double d4 = Math.abs(-4);
		System.out.println(d4);//4
		
		//대소비교
		int d5 = Math.max(5, 3);
		System.out.println(d5);//5
		
		
		
	}
	
	
}
