package day09.inter.basic3;

public class PetHouse {

	
	//1. IPet타입을 매개변수로 받아서 기능을 출력하는 메서드
		
		public static void helloPet(IPet i) {
			i.play();
		}
		
	
	//2. IPet[]타입을 매개변수로 받아서, 배열 내부 Pet들의 play 기능을 실행하는 static 메서드
		
		public static void arrPet(IPet[] arr) {

			//향상된 반복문
			for(IPet a : arr) {
				a.play();
			}
			
			//일반 반복문
//			for(int i = 0; i < arr.length; i++) {
//				arr[i].play();
//			}
		}



}
