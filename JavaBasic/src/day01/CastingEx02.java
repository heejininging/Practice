package day01;

public class CastingEx02 {

	public static void main(String[] args) {
	
		/*
		 * 크기가 큰 타입을 작은 타입으로 변환할 때 (type) 캐스팅을 이용해서
		 * 명시적형변환을 해야합니다.
		 */
		
		int i = 70;
		char c = (char)i;
		short s = (short)i;
		
		//실수는 항상 정수보다 크다.
		double d = 3.14;//실수를 표현하는 타입
		int k = (int)d;//정수를 표현하는 타입
		
		System.out.println(k);//3
		
		/*
		 * 캐스팅(형변환)을 할 때 주의할 점
		 * 해당 값을 받을 수 없는 범위가 들어오면 잘려나간 값(쓰레기값)
		 * 이 저장이 됩니다.
		 */
		int a = 1000;
		byte b = (byte)a; //8bit의 숫자만 들어갈 수 있음
		System.out.println(b);//-24
	
		/*
		 * char,short 는 크기가 같지만(2byte)
		 * 문자형과 숫자형이기 때문에, 형변환이 필요함.
		 */
		
		char cc = 'A';
		short ss = (short)cc;
		System.out.println(ss);//65
		System.out.println(cc);
}	
}
