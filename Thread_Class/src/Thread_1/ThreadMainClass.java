package Thread_1;

class ThreadClass extends Thread{// 상속을 바로 하고있음 // 다른 상속이 없는 경우
	public void run() {
		System.out.println("쓰레드 가동");
	}
}

public class ThreadMainClass {
	public static void main(String[] args) {
		ThreadClass tc1 = new ThreadClass();
		tc1.start();
		System.out.println("Go Go 쓰레드");
	}
}
