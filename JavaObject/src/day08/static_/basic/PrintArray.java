package day08.static_.basic;

public class PrintArray {

	private PrintArray() {
		
	}
	
	static String toArray(int[] i) { //배열을 매개변수로 받겠다.
		
		String str = "[";
		
		for(int a = 0; a < i.length; a++ ){//int a : i)//배열이 주어지면 반복문을 무조건 돌려야함
			str += i[a];//str += i;
			            //str += ", ";
			if(a == i.length-1) {
				str += "]";
				break;
			}
			
			str += ", ";
		}
		return str;
		
	}
	
	static String toArray(char[] i) {
	String str = "[";
		
		for(int a = 0; a < i.length; a++ ){//int a : i)//배열이 주어지면 반복문을 무조건 돌려야함
			str += i[a];//str += i;
			            //str += ", ";
			if(a == i.length-1) {
				str += "]";
				break;
			}
			
			str += ", ";
		}
		return str;
	}
	

	
	static String toArray(String[] i) {
	String str = "[";
		
		for(int a = 0; a < i.length; a++ ){//int a : i)//배열이 주어지면 반복문을 무조건 돌려야함
			str += i[a];//str += i;
			            //str += ", ";
			if(a == i.length-1) {
				str += "]";
				break;
			}
			
			str += ", ";
		}
		return str;
}
	
	
}

