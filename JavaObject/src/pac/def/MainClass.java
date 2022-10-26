package pac.def;

import java.util.Scanner;

//import pac.abc.Apple;//패키지명을 포함한 클래스명
//import pac.abc.Banana;
import pac.abc.*;//패키지에 있는 클래스를 많이 사용해야하는 경우 하위폴더 뒤에 아스타링크(*)


public class MainClass {

	public static void main(String[] args) {
		
		Melon m = new Melon();
		Apple a = new Apple();//오류로 밑줄이 쳐지면 ctrl + space로 불러온다.
		Banana b = new Banana();
		
		Scanner scan = new Scanner(System.in);
		int a1 = scan.nextInt();//scan의 메서드
		
		
	}
}
