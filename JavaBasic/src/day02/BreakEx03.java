package day02;

public class BreakEx03 {

	public static void main(String[] args) {

//		//중첩반복문의 탈출
//		boolean flag = false;
//		
//		for(char c = 'A'; c <= 'Z'; c++) {
//			
//			
//			for(char l = 'a'; l <= 'z'; l++) {
//			
//				System.out.println(c + "-" + l);
//			
//				if( l == 'f' ) {
//					flag = true;
//					break;
//				}
//			}
//			
//				if (flag) break; //flag가 true라면 탈출. 외부반복은 한 바퀴만
//		}
	
		//label : 빠져나가고 싶은 반복문 앞에 이름 지정 + : -> break 이름 ;
		ex:for(char c = 'A'; c <= 'Z'; c++) {
			
			
			for(char l = 'a'; l <= 'z'; l++) {
			
				System.out.println(c + "-" + l);
			
				if(l == 'f')break ex;
			}
		}

	}
}
