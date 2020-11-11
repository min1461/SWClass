package OOP;
/*
 * 디폴트 생성자
 */
class Car4 {
	private String color;
	private int door;// 속성

//	public Car4() {		//	디폴트 생성자 - 메서드 생략 가능하지만 한줄(public Car4(){})로 작성하기도 함.
//	}					//	생성자 중복(constructor overloading)

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

public class CarMainClass4 {
	public static void main(String[] args) {	// start
		Car4 avante = new Car4();				// 객체생성 + 디폴트 생성자 가동 : 초기치
//				 :
//				다양한 로직 가동
//				 :								
												// 소멸자(destructor) 가동 : 객체 정리
	}											// end
}