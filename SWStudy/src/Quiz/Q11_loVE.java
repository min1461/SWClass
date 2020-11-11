package Quiz;
/*
 * Character.toUpperCase
 * Character.toLowerCaser
 */
public class Q11_loVE {

	public static void main(String[] args) {
		String word = "loVE"; // 스트링 문자 POWER
		kaja(word);
	}

	private static void kaja(String moonja) {
		for (int i = 0; i < moonja.length(); i++) {
			if (Character.isLowerCase(moonja.charAt(i))) {
				System.out.print(Character.toUpperCase(moonja.charAt(i)) + "\t");
			} else {
				System.out.print(Character.toLowerCase(moonja.charAt(i)) + "\t");
			}
		}
	}
}
