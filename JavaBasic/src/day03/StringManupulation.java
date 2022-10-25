package day03;

import java.util.Arrays;

public class StringManupulation {

	public static void main(String[] args) {
		
		//문자열 다루기
		/*
		 * 컴퓨터는 문자열을 모르기 때문에 데이터타입을 이용해서 표현한다.
		 */
		
//		String str = new String(new char[] {'A', 'B', 'C'});
//		
//		System.out.println(str);
		
		String str = "안녕하세요~";//문자열을 배열일거다.라고 생각하기. 안[0] 녕[1] 하[2] 세[3] 요[4] ~[5]
		
		//1. 문자열의 길이를 확인
//		System.out.println(str.length());//6
		
		int len = str.length();//.이랑 ()를 꼭 사용해야한다!
		System.out.println(len);//6
		
		//2. 문자열을 한글자 자르기
		char c = str.charAt(0);
		System.out.println(c);//안
		
		//3. 문자열의 위치 확인 indexOf, lastIndexOf - 찾은 문자의 위치반환
		int a = str.indexOf("녕");
		System.out.println("찾은위치: " + a);//1번째 인덱스 녕[1]
		
		int b = str.lastIndexOf("녕");//같은 문자가 들어있으면 제일 마지막 인덱스에 위치한 값을 출력
		System.out.println("찾은위치: " + b);//1번째 인덱스 녕[1]
		
		int d = str.indexOf("sdf");
		System.out.println("찾는 문자가 없다면" + d);//-1
		
		
		//4. 문자열변경 -replace
		//str.replace("찾을문자", "변경할문자");
		String e = str.replace("안", "헐");
		System.out.println(e);//헐녕하세요~ 
		System.out.println(str);//안녕하세요~ ->원본문자는 바뀌지 않는다.
		
		//5. 대소문자 변경 toUpperCase, toLawerCase
		str = "abcDeFg"; //원래 있던 변수에 새로운 값 대입을 치환한다고 표현
		String f = str.toUpperCase();
		System.out.println("변경문자 : " + f);//전부 다 대문자로 임시바꿈
		System.out.println("원본문자 : " + str);//원본문자는 바뀌지 않는다.
		
		//6. 문자열의 공백제거 trim,replace
		str = "  010-1234-5678   ";
		String g =str.trim();
		System.out.println("변경문자 : " +g);
		System.out.println("원본문자 : " + str);
				
		str = " 안 녕 하 세 요 개 천 절 날 은 쉽니다.   ";
		String h = str.trim();
		System.out.println(h);//앞뒤공백만 제거
		
		//trim과 같이 replace를 활용하면 가운데 공백도 제거할 수 있다.
		String i = str.replace(" ", "");
		System.out.println(i);
		
		
		//7. String.valueOf() -> 기본타입을 문자로 변경
		System.out.println(10 + 20);//30
		System.out.println("" + 10 + 20);//1020
		System.out.println(String.valueOf(10) + 20);//1020 //char,실수형에도 사용할 수 있다.
		
		
		//8. 문자열자르기★
		str = "010-1234-5678";
		//substring(인덱스 기준으로 자르고싶은 부분만)
		String j = str.substring(3);//인덱스 미만 절삭
		System.out.println(j);//-1234-5678
		
		String k = str.substring(3, 5); //인덱스 이상 ~ 인덱스 미만 추출
		System.out.println(k);//-1
		
		//split(특정문자 기준으로 잘라서 배열로 담아줌)★//charAt()대신 간편하게 문자열을 자를 수 있다.
		String[] l = str.split("");//특정문자 미지정
		System.out.println(Arrays.toString(l));//[0, 1, 0, -, 1, 2, 3, 4, -, 5, 6, 7, 8]
		
		String[] arr = str.split("-");//특정문자 미지정
		System.out.println(Arrays.toString(arr));//[010, 1234, 5678]
		
		
		//toCharArray(문자열을 캐릭터로 분할시켜서 담음)
		char[] arr2 = str.toCharArray();
		System.out.println(Arrays.toString(arr2));
		
		
		
		
	}
	
}
