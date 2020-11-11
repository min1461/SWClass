package OOP;
/*
 * 받는인자값이 있는 메서드 생성
 */
class Car3 {
	private String color;
	private int door;// 속성

	public Car3(String color, int door) {//2형식 메서드
		// TODO Auto-generated constructor(생성자) stub
		this.color = color;
		this.door = door;
	}

	// getter + setter
	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setDoor(int door) {
		this.door = door;
	}

	public int getDoor() {
		return door;
	}

	public void drive() {// 메소드
		System.out.println("부릉부릉");
	}
}

public class CarMainClass3 {
	public static void main(String[] args) {
		Car3 avante = new Car3("빨강스", 4);
		avante.drive();
		System.out.println(avante.getColor());
		System.out.println(avante.getDoor());
		avante.setColor("파랑");
		avante.setDoor(2);
		System.out.println(avante.getColor());
		System.out.println(avante.getDoor());
	}
}