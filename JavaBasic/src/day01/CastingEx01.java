package day01;

public class CastingEx01 {

	public static void main(String[] args) {
		
		byte b = 10;
		
		int s = b; //byte -> int형으로 자동형변환
		short i = b; //byte -> short형으로 자동형변환
		long l = b; //byte -> long형으로 자동형변환
		
		System.out.println(b);
		
		char c = '가';
		int j = c; //char -> int형으로 자동형변환
		
		System.out.println("가의 유니코드 숫자값:" + j);//가의 유니코드 숫자값:44032
		
		int k = 1000;
		double d = k; //int -> double(소숫점표현)
		System.out.println(d);//1000.0
		
		int g = 65;
		char f = (char)g;
		System.out.println(f);
		
	}
}
