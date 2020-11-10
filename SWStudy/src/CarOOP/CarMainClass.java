package CarOOP;

class Car {
	String color;
	int door;

	public void drive() {
		System.out.println("부릉부릉");
	}
}

public class CarMainClass {
	public static void main(String[] args) {
		Car avante = new Car();
		avante.door = 2;
		avante.color = "black";
		avante.drive();
		System.out.println(avante.door);
		System.out.println(avante.color);
	}
}