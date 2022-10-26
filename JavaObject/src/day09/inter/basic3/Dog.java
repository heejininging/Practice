package day09.inter.basic3;

public class Dog extends Animal implements IPet{

	public void eat() {
		System.out.println("갱아지는 사료를 먹어용");
	}
	
	public void play() {
		System.out.println("강아지는 방에서 놀아요");
	}
}
