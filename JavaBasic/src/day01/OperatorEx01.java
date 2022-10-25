package day01;

public class OperatorEx01 {

	public static void main(String[] args) {
		 
		//단항 연산자
		int i = -3;
		int j = -i;//3
		System.out.println(j);//수학과 같은 공식으로 --는 +로 변형
		
		//++,-- (증감연산자)
		int k = 1;
		
		k++;
		System.out.println(k);//2
		k--;
		System.out.println(k);//2-1=1
		
		//증감연산자는 a++, ++a 의미가 조금 다름.
		k = 1;
		int h = k++;//먼저 k값을 대입을 하고 이후에 증가. (먼저 대입, 이후 증가)
		System.out.println("k값:" + k);//2
		System.out.println("h값:" + h);//1
		
		k = 1;
		int g = ++k;//+를 먼저 왼쪽 변수에 증가시키고 이후에 값 대입.(먼저 증가, 이후 대입)
		System.out.println("k값:" + k);//2
		System.out.println("g값:" + g);//2
		
		k = 1;
		System.out.println(++k);
		System.out.println(k++);
		
		System.out.println("----------------------------------------------------------------------");
		
		//~ 연산자 - 2진수값을 반대로
		byte b = 10; //0000 1010
		System.out.println(~b); //1111 0101
		//2진수의 보수관계 
		System.out.println(~b + 1);//-10
		
		System.out.println("------------------------------------------------------------------------");
		
		//논리반전 연산자
		System.out.println(!true);//false
		
		boolean bool = !false;
		System.out.println(bool);//true
		
		int a = 33;
		System.out.println(a != 33);//false
		System.out.println(a == 33);//true
		
		
		
	}
}
