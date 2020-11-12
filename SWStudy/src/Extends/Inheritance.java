package Extends;

public class Inheritance {
	public static void main(String[] args) {
		parents p1 = new parents();
		p1.money();
		
		child c1 = new child();
		c1.money();
		c1.car();
		
		System.out.println(c1.diamond);
		
		// p1.car(); 부모는 차가없음 (자녀가 차를 갖고있다.)
	}
}