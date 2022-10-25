package day01;
import java.util.Arrays;

public class ArrayEx {

	public static void main(String[] args) {
		
		//배열은 선언 , 생성, 초기화 과정을 거칩니다.
		
		//1. 배열의 선언
		int[] arr;
		
		//2. 배열의 생성
		arr = new int[5];
		
		System.out.println(arr);//주소값이 출력됌 배열이 만들어진 위치
		
		System.out.println(arr[4]);//배열의 초기화 이전의 출력은 값이 나오지 않는다. 0
		//3. 배열의 초기화
		//arr[인덱스] = 값
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		//arr[5] = 60; *주의해야함 값의 크기는 0부터 시작하므로 지정해준 값의 -1이 최대공간임
		System.out.println(arr[4]);//배열의 초기화 후에는 값이 나온다. 50
		
		//4. 배열의 사용
		System.out.println("배열의 첫번째 상잣값:" + arr[0]);
		System.out.println("배열의 세번째 상잣값:" + arr[2]);
		
		System.out.println("---------------------------------------------");
		
		//5. 배열의 모습을 문자열로 확인하는 명령문 ★외워야함
		System.out.println( Arrays.toString(arr));//[10, 20, 30, 40, 50]
		
		//6. 배열의 길이 확인하는 명령어 ★외워야함
		System.out.println("배열의 크기 :" + arr.length);//배열의 크기 :5
		
		//7. 배열의 선언과 생성을 동시에 ★외워야함
		byte[] arr2 = new byte[10]; 
		
		//배열의 초기값을 지정하지 않으면 각 타입의 기본값으로 자동초기화
		System.out.println(Arrays.toString(arr2));//[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
		//0(int), 0.0(double), null(string)
		//그래서 반복문에 배열을 같이 사용할 경우 초기값을 반복문에 넣어주어야 번복되지 않음
		
		//8. 배열의 선언 생성 초기화를 동시에 ★외워야함
		int[] arr3 = {1,2,3,4,5,6,7,8,};

		System.out.println(Arrays.toString(arr3));//[1, 2, 3, 4, 5, 6, 7, 8]
		
		
		System.out.println("------------------------------------");
		
		/*
		 * 1. 스트링 배열을 생성하고 월,화,수,목을 저장
		 * 
		 * 2. 크기가 3인 int 배열을 생성하고 1~10중 랜덤값을 저장
		 */
		
		//1.
		char[] arr4;
		arr4 = new char[4];
		arr4[0]='월';
		arr4[1]='화';
		arr4[2]='수';
		arr4[3]='목';
		System.out.println(Arrays.toString(arr4));
		
		//2.
		int[] arr5 = new int[3];
//		System.out.println(Math.random());
		
		System.out.println("-------------------------------------------");
		
		//1.
		String[] arr6 = {"월", "화", "수", "목"};
		System.out.println(Arrays.toString(arr6));
		
		//2.
		int[] arr7 = new int[3];
		arr7[0] = (int)(Math.random() * 10) + 1;
		arr7[1] = (int)(Math.random() * 10) + 1;		
		arr7[2] = (int)(Math.random() * 10) + 1;
		System.out.println(Arrays.toString(arr7));
		
		
		
	}
	
}
