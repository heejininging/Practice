package day02;

public class WhileEx03 {

	public static void main(String[] args) {
		
		//1~100가지의 정수 중 3의 배수의 개수 구하기
	int count = 0;//개수를 체크할 변수★
		
	int a = 1;
	while(a <= 100) {
		
		if(a % 3 == 0) { //a는 3의 배수이다
			count++;//3의 배수의 갯수만 구하는거므로 정답일때 서식을 넣어줌
		}
		
		a++;
		
	}
	
	System.out.println("3의 배수의 갯수 : " + count);
	
	}
	
}
