package Quiz;

public class Q06_MethodScore {
	/*
	 * 배열의 대표명은 그 배열의 시작번지이다.
	 * *Call by value(값에 의한 호출)	Call by reference(참조에 의한 호출)
	 */
	public static void main(String[] args) {
		int[] jumsoo3 = { 30, 70, 100, 90, 20 };
		kaja100(jumsoo3);
//		System.out.println(jumsoo3);
	}

	private static void kaja100(int[] jumsoo555) {
		System.out.println(jumsoo555[0]);
//		System.out.println(jumsoo555);
		/*
		 * jumsoo555와 jumsoo3의 주솟값은 같다.
		 */
	}
}