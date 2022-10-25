package day02;

public class MultiForEx02 {
	
	public static void main(String[] args) {
		
		//회전할 때마다 횟수가 변하는 중첩반복문
		/*
		 *      *
		 *     ***
		 *    *****
		 *   *******
		 *  *********
		 */
		
		
		int star = 5;//공백을 찍기위한 변수(행의 수)
		
		for(int i = 1; i <= star; i++) {
			//공백을 찍는 반복문
			for(int j = 1; j <= star -i; j++) {
				System.out.print(" ");
			}
			//별을 찍어주는 반복문
			for(int e = 1; e <= (i*2)-1; e++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		System.out.println("------------------------------");
		
		/*            d  공백h  별g
		 * *********  1   0    9
		 *  *******   2   1    7
		 *   *****    3   2    5
		 *    ***     4   3    3
		 *     *      5   4    1
		 */
		int star1 = 5;
		
		for(int d = 1; d <= star1; d++ ) {
			
			for(int h = 1; h <= d-1; h++) {//행(세로)
				System.out.print(" ");
			}
			for(int g = 1; g <= 2*(star1-d) +1; g++) {
				System.out.print("*");
			}
			System.out.println();
////			for(int g = 9; g >= d*2-1; g--) {
//				System.out.print("*");
//			}
			
		}
		
			
	}

}
