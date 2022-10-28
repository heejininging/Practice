package com.adamsoft.thread;

//Thread 클래스로부터 상속받는 클래스를 생성
class ext extends Thread{
	//아래의 어노테이션은 상위클래스나 인터페이스에서 제공하는 메서드가 아닌 경우에 에러를 발생시켜준다.
	@Override //어노테이션 
	public void run() {
		//1초마다 Thread 클래스라는 문장을 10번 출력
		for(int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
				System.out.println("Thread 클래스");
			} catch (Exception e) {
				System.out.println(e.getLocalizedMessage());
			}
		}
	}
}

//Runnable 인터페이스를 구현한 클래스를 생성 
class RunImpl implements Runnable{

	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
				System.out.println("Runnable 인터페이스");
			} catch (Exception e) {
				System.out.println(e.getLocalizedMessage());
			}
		}
		
	}
	
}

public class ThreadCreate {

	public static void main(String[] args) {
		/*
		 * 스레드 클래스로부터 상속받은 클래스( ext )를 이용해서 스레드를 생성하고 실행 
		 * 
		 *start를 호출하면 상속받은 클래스에 들어있는 메서드 ( run ) 실행
		 */
		Thread th1 = new ext();
		th1.start();
		
		/*
		 * Runnable 인터페이스를 implements한 클래스( RunImpl ) 를 이용해서 스레드를 생성하고 실행 
		 */
		Thread th2 = new Thread(new RunImpl());
		th2.start();
		
		//Runnable 인터페이스를 Anonymous Class를 이용해서 사용 
		Thread th3 = new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i = 0; i < 10; i++) {
					try {
						Thread.sleep(1000);
						System.out.println("Anonymous 활용");
					} catch (Exception e) {
						System.out.println(e.getLocalizedMessage());
					}
				}
				
			}
			
		}); th3.start();
		
		//람다를 활용해서 Runnalble 인터페이스 활용 
		Thread th4 = new Thread(() -> {
			for(int i = 0; i < 10; i++) {
				try {
					Thread.sleep(1000);
					System.out.println("Lambda 활용");
				} catch (Exception e) {
					System.out.println(e.getLocalizedMessage());
				}
			}
		}); th4.start();
		
	}
}
