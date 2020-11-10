package Stars;
	/*
 * 12345
 * 12345
 * 12345
 * 12345
 * 12345
 */

//배열들어가면 번호가 붙는데 0번부터 붙기때문에 for문을 공부할때 애초에 0부터 시작하는걸로 공부하시는게 편합니다.
public class Q05 {
	public static void main(String[] args) {
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j < 5; j++) {
				System.out.print(j);
			}
			System.out.println("");
		}
	}
}
