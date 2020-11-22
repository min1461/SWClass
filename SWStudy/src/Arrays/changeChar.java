package Arrays;

/*-
 * toCharArray() : char를 배열화 시키는 명령어
 */
public class changeChar { // 문자 위치 바꾸기!
	public static void main(String[] args) {
		// run configrations
		ChangeChar(args); // 메서드 활용
	}

	public static void ChangeChar(String[] str) {
		System.out.print("str : ");
		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i]); // run configurations으로 입력
		}
		System.out.println("");
		char[] ch = str[0].toCharArray(); // str을 ch배열에 char를 각각 넣어줌

		// 배열 위치 바꿔주기(지그재그) - 1번째와 3번째 글자 바꿔주기 * 0번부터 시작
		char tmp = ch[1];
		ch[1] = ch[3];
		ch[3] = tmp;

		System.out.print("ch : ");
		for (int i = 0; i < str[0].length(); i++) { // 바꿔서 출력
			System.out.print(ch[i]);
		}
		System.out.println();

		String str2 = new String(ch); // 잘라진 배열 ch를 문자열(String)로 바꾸기
		System.out.println("str2 : " + str2); // 출력
	}
}