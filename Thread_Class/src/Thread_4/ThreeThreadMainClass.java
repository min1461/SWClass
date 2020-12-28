package Thread_4;

class ThreeThreadClass extends Thread {
	String fruit;

	public ThreeThreadClass(String fruit) {
		this.fruit = fruit;
	}

	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(fruit+" "+i+"개 주세요");
			try {
				Thread.sleep((long) (Math.random() * 1000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class ThreeThreadMainClass {
	public static void main(String[] args) {
		ThreeThreadClass ttc1 = new ThreeThreadClass("사과");
		ThreeThreadClass ttc2 = new ThreeThreadClass("배");
		ThreeThreadClass ttc3 = new ThreeThreadClass("감");

		ttc1.setPriority(ttc1.MIN_PRIORITY);// 1
		// ttc1.setPriority(2)//1~10
		ttc2.setPriority(ttc2.NORM_PRIORITY);// default : 5
		ttc3.setPriority(ttc3.MAX_PRIORITY);// 10

		System.out.println(ttc1.getPriority() + "\t" + ttc2.getPriority() + "\t" + ttc3.getPriority());

		ttc1.start();
		ttc2.start();
		ttc3.start();
	}
}