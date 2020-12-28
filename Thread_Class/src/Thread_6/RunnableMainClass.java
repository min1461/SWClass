package Thread_6;

class ThreadClass extends Thread{
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("슈퍼 가자");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class RunnableClass implements Runnable {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("백화점 가자");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class RunnableMainClass {
	public static void main(String[] args) {
		// 같은 클래스 안에 쓰레드 2개
		ThreadClass th1 = new ThreadClass();
		Thread th2 = new Thread(new RunnableClass());

		th1.start();
		th2.start();
	}
}
