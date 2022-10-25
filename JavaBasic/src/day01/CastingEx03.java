package day01;

public class CastingEx03 {

	public static void main(String[] args) {
		
		//연산에서의 형변환
		char c = 'C'; //67
		int i = 2;
		
		System.out.println(c+i);//69
		//c가 문자형의 타입으로 표현되어도 연산이 들어가게되면 정수로 형변환
		
		
		//1. 서로 다른 타입의 연산에서는 큰 타입을 따라감.
		char cc = (char)(c+i);
		int ii = c+i;
		
		System.out.println(cc);//유니코드 E
		System.out.println(ii);//69
		
		int j = 10;
		double d = 3.14;
		double result = j + d;
		
		System.out.println(result);//13.14
		
		//2. int형보다 작은 타입의 연산의 결과는 int가 됩니다.
		byte b1 = 100;
		byte b2 = 10;
		byte b3 = (byte)(b1 + b2);//형변환을 한 경우
		int b4 = b1 + b2;
		
		System.out.println(b4);
		
		short s1 =100;
		byte s2 = 10;
		
		short s3 = (short)(s1 + s2);//형변환을 한 경우
		//short s5 = s1 + s2;
		//작은 타입의 연산결과인데 형변환을 안하면 값x
		int s4 = s1 + s2;
		
		System.out.println(s3);
		System.out.println(s4);
		
		
		
		
	}
	
}
