\package Abstraction;
/* 추상화 (abstraction)
 * 가독성, 다형성 (polymorphism)
 * 			과일
 * 사과		 배		 감
 * interface(구현) 나 abstract(추상)
 * 모두 전제조건이 "상속에 있어서" 
*/
class Apple extends Fruit {
	public void eat() {
		System.out.println("아삭아삭 사과를 먹자");
	}
}

class Pear extends Fruit {
	public void eat() {
		System.out.println("과즙뿜뿜 배를 먹자");
	}
}

class Persimmon extends Fruit {
	public void eat() {
		System.out.println("못 먹는 감 난공불락");
	}
}

abstract class Fruit { // abstract 추상클래스가 됨
	public void good() {
		System.out.println("먹으면 좋아\n");
	}

	public abstract void eat();// 추상 메서드
}

public class Abs {
	public static void main(String[] args) {
		Fruit f1 = new Apple();
		f1.eat();
		f1.good();
		
		Fruit p1 = new Pear();
		p1.eat();
		p1.good();
		
		Fruit pe1 = new Persimmon();
		pe1.eat();
		pe1.good();
		/*
		 * eat()메서드를 통해 각각 다른 출력문을 호출할수 있다. -> 다형성
		 */
	}
}