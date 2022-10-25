package day01;

public class OperatorEx02 {

	public static void main(String[] args) {
		
		//2항 연산자 - 항이 2개인 연산자
		int i = 7 / 3; //몫2
		int j = 7 % 3; //나머지 1
		int k = 7 * 3; //곱 21
		
		//비교연산
		System.out.println(i == j);//false , 같지않으므로 틀림
		System.out.println(i != j);//true , 같지않으므로 맞음
		System.out.println(i >= 1);
		System.out.println(i < j);
		System.out.println(k != 21);
		
		//짝수 홀수 구분, 2의 배수 확인
		System.out.println(k % 2 != 0);
		System.out.println(k % 2 == 0);
		//7의 배수 확인
		System.out.println(k % 7 == 0);
		
		

	}
	
}
