package day09.inter.basic3;

public class Cat extends Animal implements IPet{

	public void eat () {
		System.out.println("야용이는 생선을 먹어용");
	}
	
	public void play() {
		System.out.println("야옹이는 캣휠에서 놀아요");
	}
}
