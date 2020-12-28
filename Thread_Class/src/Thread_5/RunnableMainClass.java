package Thread_5;

class RunnableClass implements Runnable {
	public void run() {
		System.out.println("I love you");
	}
}

public class RunnableMainClass {
	public static void main(String[] args) {
		//같은 클래스 안에 쓰레드 2개
		RunnableClass r1 = new RunnableClass();
		Thread th1 = new Thread(r1);
		Thread th2 = new Thread(new RunnableClass());
		
		th1.start();
		th2.start();
	}
}
