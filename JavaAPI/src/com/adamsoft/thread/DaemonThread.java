package com.adamsoft.thread;

public class DaemonThread {

	public static void main(String[] args) {
		Thread th = new Thread(() -> {
			for(int i = 0; i < 10; i++) {
				try {
					Thread.sleep(100);
					System.out.println(i);
				} catch (Exception e) {
					System.out.println(e.getLocalizedMessage());
				}
			}
		});
		
		//Daemon Thread 로 설정 - 다른작업이 없으면 자동으로 종료
		th.setDaemon(true);
		th.start();
		
		try {
			Thread.sleep(500);
			System.out.println("메인 종료");
		} catch (Exception e2) {
			System.out.println(e2.getLocalizedMessage());
		}
	}
}
