package day01;

public class TypeInteger {

	public static void main(String[] args) {
		
		//byte, short, int, long
		//2진수로 계산되는데 칸의 맨 앞쪽은 부호로 0이면 양수 1이면 음수
		byte a = 127;
		byte b = -128;
				
		short c = 32767;
		short d = -32768;
		
		int e = 2147483647;
		int f = -214783648;
		
		long g = 123123123123123123L; //long은 정수의 맨 뒤에 L을 붙임
	    System.out.println(g);
	    
	    /*
	     * 2진수 저장할 때는 0b를 붙임
	     * 8진수 저장할 때는 0을 붙임
	     * 16진수 저장할 때는 0x를 붙임
	     */
	    
	    int bin = 0b1010; //2진수 2^1 + 2^3
	    int octa = 064; //8진수
	    int hexa = 0xAC00; //16진수
	    
	    System.out.println("이진수 1010은 :" + bin + "입니다.");//문자열과 변수를 더할 수 있다.
	    System.out.println("팔진수 64는:" + octa + "입니다.");
	    System.out.println("십육진수 AC00은:" + hexa + "입니다.");
	    
	    System.out.println("--------------------------------------");
	    
	    float f1 = 3.14F; //float을 나타낼때는 F를 붙임
	    double d1 = 3.14;
	    
	   System.out.println(f1);
	   System.out.println(d1);
	    
	    float f2 = 3.1415923333F;//소숫점 밑으로 7자리까지 유효 *그 이후의 숫자는 신뢰성x
	    double d2 = 3.1415923333;//소숫점 밑으로 15자리까지 유효 *그 이후의 숫자는 신뢰성x
	    
	    System.out.println(f2);//3.1415923
	    System.out.println(d2);//3.1415923333
	    
	    System.out.println(f2+d2);
		
	    System.out.println("---------------------------------------");
	    //e표기법
	    float f3 = 314.15e-2F;//10^-2
	    double d3 = 0.031415e2;//10^2
	    
	    System.out.println(f3);
	    System.out.println(d3);
	    
	    System.out.println("-----------------------------------------");
	    boolean bool1 = true;
	    boolean bool2 = false;
	    
	
	    System.out.println(bool1);
	}
	
}
