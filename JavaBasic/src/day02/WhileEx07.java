package day02;

public class WhileEx07 {
	
	public static void main(String[] args) {
		
		//최댓값을 찾아라
		int[] arr = {50,30,40,60,70,90,100,110,20};
		
		
		int max = arr[0]; //최댓값을 저장할 변수
		
		int i =0;
		while(i < arr.length) {//반복하면서 크기비교, 
			if(max < arr[i]) {
				max = arr[i];
			}
			i++;
		}
		
		
		System.out.println("최댓값 :" + max);

	System.out.println("-----------------------------------------------");
	
	//arr의 최솟값을 찾아라
		int min = arr[0]; //최솟값을 저장할 변수
	
		int b = 0;
		while(b < arr.length) { //꼭! 배열의 길이보다 작게 반복해야함
			if( min > arr[b]) { //만약 b가 최솟값보다 작으면
				min = arr[b]; //b가 최솟값으로 변경됌
			}
			b++;
		}
	
		System.out.println("최솟값 :" + min);
	
	
	
	}

}



