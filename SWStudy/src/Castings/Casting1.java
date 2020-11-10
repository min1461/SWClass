package Castings;

public class Casting1 {
	public static void main(String[] args) {
		short sh1 = 1234;
		int int1 = sh1;
		System.out.println(sh1);
		// 묵시적 형변환 (implicit conversion)
		
		int int2 = 234567;
		short sh2 = (short) int2; // short형으로 형변환
		// 개발자 책임하에 자료형을 바꿔줌
		// 범위가 넘어가면 2의보수법에 의해 음수가 출력됨;
		// 명시적 형변환
		System.out.println(sh2);
	}
}