package Overloadings;
	/*
	 * ★반환 타입값이 다른것은 오버로딩이 아니다!
	 * private static int kaja(int i, int j){}
	 * private static String kaja(int i, int j){}
	 */
public class Overloadings {
	public static void main(String[] args) {
		int aa=100;
		double bb=23.5;
		int x=200;
		double y=300.7;
		kaja();		//	받은 인자값이 없는 kaja() 메서드.				- 1형식 메서드		타입을 비교하기 어려움
		kaja(aa);	//	받은 인자값을 출력하는 kaja(int aa) 메서드.		- 2형식 메서드		타입이 int
		kaja(x);	//	받은 인자값을 출력하는 kaja(int aa) 메서드.		- 2형식 메서드		타입이 int
		kaja(bb);	//	받은 인자값을 출력하는 kaja(double bb) 메서드.		- 2형식 메서드		타입이 double
	}
	
	private static double kaja(double bb) {	// kaja의 인자 갯수 = 1
		System.out.println(bb);				// 받은 인자값을 출력
		return bb;
	}

	private static String kaja() {			// kaja의 인자 갯수 = 0
		System.out.println("값이 없음");
		return null;
	}

	private static int kaja(int aa) {		// kaja의 인자 갯수 = 1
		System.out.println(aa);				// 받은 인자값을 출력
		return aa;
	}
}