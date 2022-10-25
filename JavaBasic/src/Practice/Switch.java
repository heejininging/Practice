package Practice;

public class Switch {

	public static void main(String[] args) {
	
		/*
		 * 랜덤의 정수값을 출력하여 시간을 설정하고,
		 * 현재 시간에 따른 "출근","회의,"업무","외근"중 어떤 결과값이 나올지 알아보기
		 */
		
		int time = (int)(Math.random()*4) +1;
		System.out.println("현재시간 :" + time );
		
		switch (time) {
		case 1:
			
			break;//case문마다 존재해야함. 없다면 조건식이 연달아 실행.

		default://else와 비슷한 의미로 실행할 문장이 없을 경우의 값 출력.
			break;
		}
		
	}
}
