package day01;

public class SystemOut {

	public static void main(String[] args) {

		/*
		 * 단축키
		 shift + end, home으로 커서를 마지막,처음 으로 문장을 선택가능
		 * 정렬키
		 ctrl + a 전체선택 후 ctrl + i 문자열 정렬
		 * 행삭제
		 ctrl + d (delet대신 사용하기 편함)
		 * 행복사
		 ctrl + alt + 방향키
		 * 코드이동 ★꿀꿀팁
		 alt + 방향키
		 * 빠른 주석/제거
		 ctrl + /
		 */


		//문자와 숫자
		System.out.print("1");//문자는 쌍따옴표를 붙여준다.
		System.out.print("\n");
		System.out.print(1);//숫자
		System.out.print("\n");

		//sysout이라고 적고 ctrl + space 출력문 자동생성, enter누르면 생성 (가장 많이 사용하는 형식)
		System.out.println("안녕하세요");
		System.out.println("반갑습니다");

		//형식을 지정하는 출력문 printf
		//문자형식을 미리지정하고, 필요한 출력값을 지정하는 형태
		/*서식문자
		 %s -문자열을 입력받음.
		 %d -정수를 입력받음.
		 %f -실수를 입력받음. (%.2f - 소숫자리수를 의미함)
		 /n -줄바꿈
		 \t -8칸 간격 들여쓰기 출력
		 */
		System.out.printf("안녕하세요 제 이름은 %s 입니당~~!\n","홍길동");
		System.out.printf("오늘은 %d월 %d일 입니다\n", 9,20);
		System.out.printf("파이의 값음 %.2f 입니다\n",3.14);
		System.out.printf("%d x %d = %d\t%d x %d = %d", 2,1,2,2,2,4);


	}


}
