package OOP;
/*
 * getter,setter
 */
class Car2 {
	private String color;
	private int door;// 속성

	// getter + setter
	public void setColor(String color) { // getter로 부터 String Color를 받는다.
		this.color = color; // 자기자신을 참조하는 객체를 가르키기 위한 접미사(?)
	}

	public String getColor() { // getter로 부터 String Color를 받는다.
		return color; // 자기자신을 참조하는 객체를 가르키기 위한 접미사(?)
	}

	public void setDoor(int door) { // getter로 부터 String Door를 받는다.
		this.door = door; // 자기자신을 참조하는 객체를 가르키기 위한 접미사(?)
	}

	public int getDoor() { // getter로 부터 String Door를 받는다.
		return door; // 자기자신을 참조하는 객체를 가르키기 위한 접미사(?)
	}

	public void drive() {// 메소드
		System.out.println("부릉부릉");
	}
}

public class CarMainClass2 {
	public static void main(String[] args) {
		Car2 avante = new Car2();
		avante.setColor("파랑");
		System.out.println(avante.getColor());
		avante.setDoor(4);
		System.out.println(avante.getDoor());
	}
}