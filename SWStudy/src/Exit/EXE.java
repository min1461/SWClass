package Exit;

public class EXE {
	/*
	 * GUI 채팅프로그램 ip주소 192.168.7.139 / port번호 34567
	 * 
	 * 이클립스 메모장 ~ notepad.exe (filename) 리눅스 cp aa.txt bb.txt ==> commandline
	 * argument(명령행 인자) cp.exe aa.txt
	 */

	/*
	 * Run configrations (인자 넣어주기)
	 */
	public static void main(String[] args) {

		if (args.length != 2) {
			System.out.println("정신차려");
			System.out.println("사용법은 명령 숫자 숫자");
//			return;	// 강제종료
//			java:
			System.exit(-1);
//			c: exit(-1)
//			c#: 
		}
		System.out.println(Integer.parseInt(args[0]) + Integer.parseInt(args[1]));
	}
}