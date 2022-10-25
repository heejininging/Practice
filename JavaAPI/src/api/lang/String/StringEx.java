package api.lang.String;

import java.util.Arrays;

public class StringEx {

	public static void main(String[] args) {
		
		String s = "홍길동";
		
		
		char c = s.charAt(0);
		System.out.println(c);
		
		//길 문자를 찾으면 위치반환, 못 찾으면 -1반환
		int index = s.indexOf("길");
		System.out.println("'길' 시작위치 " + index);
		
		//replace - 원본문자는 유지가 된다.
		
		//1. 원본문자 자체를 변경하는 방법
//		s = s.replace(s, "");
		//2. 일부 문자만 변경하는 방법
		String re = s.replace("길", "");
		System.out.println(re);
		System.out.println("원본문자열 : " + s);
		
		//substring
		String s2 = "오늘은 날씨가 추워요";
		String result = s2.substring(4);//미만절삭
		System.out.println(result);
		
		String result2 = s2.substring(4, 7);//이상 미만 절삭
		System.out.println(result2);
		
		//trim - 앞뒤공백제거
		System.out.println("  홍길동       ".trim());
		
		//split
		String[] result3 = s2.split(" ");
		System.out.println(result3);
		System.out.println(Arrays.toString(result3));
		
		//매개변수 2개주면 배열의 크기 제한
		String[] result4 = "010-1234-5678".split("-", 2);
		System.out.println(result4);
		System.out.println(Arrays.toString(result4));
		
		//문자열 포함여부
		if(s.contains("홍")) {
			System.out.println("홍이 포함됨");
		}
		
		String result5 = String.copyValueOf(new char[] {'a','b','c'});
		System.out.println(result5);
				
		
		String result6 = String.valueOf(3);
		System.out.println("바뀐 문자열 : " + result6);
		
	}
	
}
