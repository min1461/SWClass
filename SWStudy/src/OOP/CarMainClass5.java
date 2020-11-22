package OOP;
/*
 * Overriding (재정의)
 * Object		// 모든 클래스의 상위 클래스
 * toString()
 */
class Car5 {
	private String color;
	private int door;// 속성
	
	public Car5(String color, int door) {//2형식 메서드
		// TODO Auto-generated constructor(생성자) stub
		this.color = color;
		this.door = door;
	}

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

	public String toString() {
		return "자동차 색은 말하자면 "+color+"이고"
				+ "문의 갯수는 "+door+"개이다.";
	}
}

public class CarMainClass5 {
	public static void main(String[] args) {
		Car5 avante = new Car5("보라",6);
		System.out.println(avante.toString());
//					||
		System.out.println(avante);		// 디폴트생성자를 이용한 출력문
	}
}