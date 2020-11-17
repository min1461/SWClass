package SuperS;
/* java		C#			this.		this()//생성자가 다른생성자를 호출할때.
 * Super() 	base()
 * Super.	base.
 */
class Parent7 {
	int don;

	public Parent7(int don) {// 인자있는 생성자
		this.don = don;
		System.out.println("내자식이 "+don+"있데!!");
	}

	public Parent7() {// 인자가 없는 생성자
		System.out.println("돈 없어!");
	}
}

class Child7 extends Parent7 {
	public Child7() {
		System.out.println("돈 많아!");
	}
	public Child7(int don) {// 인자있는 생성자
		super(don); // 상위클래스의 don인자를 받을수 있는 메서드로 간다.
		System.out.println(don+"억 있다구요!");
		System.out.println(super.don+"억 있다구요!");
	}
}

public class CarBaseSuper {
	public static void main(String[] args) {
//		Child7 c7 = new Child7();
		Child7 c8 = new Child7(30);
	}
}