package day09.inter.basic3;

public class MainClass {
	
	public static void main(String[] args) {
		
		System.out.println("----오버라이딩 된 자식클래스----");
		Dog d = new Dog();
		d.eat();
		d.play();
		
		System.out.println("----부모클래스----");
		Animal d1 = new Dog();
		d1.eat();

		System.out.println("----인터페이스 부모클래스----");
		IPet d2 = new Dog();
		d2.play();
		
		System.out.println("--------------------------");
		//Animal클래스에는 eat메서드만 사용가능
		Animal baduk = new Dog();
		Animal nabi = new Cat();
		Animal hodol = new Tiger();
		
		//1.Animal배열에 저장
		Animal[] arr = {baduk, nabi, hodol};
		
		for(Animal a : arr) {
			a.eat();
		}
		
		System.out.println("------------------------");
		//2. 바둑이는 현재 Animal이지만 생성된 클래스가 인터페이스 상속을 받고 있다면, 상호형변환이 됩니다.
		IPet i1 = (IPet)arr[0];
		IPet i2 = (IPet)nabi;
		IPet i3 = new GoldFish();
		IPet[] arr2 = {i1, i2, i3};
				
		for(IPet i : arr2) {
			i.play();
		}
		
		System.out.println("-------------------");
		PetHouse.helloPet(i1);
		PetHouse.helloPet(i2);
		PetHouse.helloPet(i3);
		PetHouse.arrPet(arr2);
	}

}
