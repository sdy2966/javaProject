package threads;

import java.awt.Toolkit;

class WorerThread extends Thread {

	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i< 5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class BeepPrintExample {
	public static void main(String[] args) {
		//스레드 상속받아서 새로운 워커스래드 클래스 생성.
//		Thread thread = new WorkerThread();
//		thread.start();
		
		// Runnable I/F 구현하는 클래스를 Thread(new Runnable())의 생성자 매개값.
		Thread thread = new Thread(new New Thread());
		thread.start();
		
		
		//Runnable I/F 구현하는 익명클래스를 생성.(가장 추천)
		thread = new Thread(new Runnable());
		
	
		for (int i=0; i<5; i++) {
			System.out.println("또로롱"); 
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
				
	}
}
