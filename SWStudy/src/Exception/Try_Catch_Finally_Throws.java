package Exception;

/*
 * java.lang.ArithmeticException : 0으로 나눌수 없어서 오류!
 */
//		try {}				// 에러 발생 예상지점
//		catch{}				// 에러 발생시 표시
//		finally {}			// 에러 발생시 무조건 실행
//		throws 에러명			// 에러 동작
import java.util.Scanner;

public class Try_Catch_Finally_Throws {
	public static int division(int num1, int num2) throws ArithmeticException {
		// throw[s]는 try catch를 대신에 쓸수있고 s를 붙여야 함
		// throws 쓰면 catch에서 Exception e을 안써도됨
		int div = num1 / num2;
		if (num2 == 0) {
			System.out.println("0으로 나눌수 없음");
//			throw new ArithmeticException();
		}
		return div;
	}

	public static void main(String[] args) {
		try { // 0으로 나눔
			Scanner in = new Scanner(System.in);

			System.out.print("첫번째수는 : ");
			String str = in.nextLine();
			// 빈칸 포함 한줄 다 입력
			// i love you 한줄 다 읽음
			// but, next()는 i만 입력~~~
			int num1 = Integer.parseInt(str);

			System.out.print("두번째수는 : ");
			String str2 = in.nextLine();
			int num2 = Integer.parseInt(str2);
			int bada = division(num1, num2);
			System.out.println(bada);
			System.out.println("================");

			System.out.println(num1 / num2);
		} catch (Exception e) {
			System.out.println("에러 내용은 ");// 에러내용 표시
			System.out.println("0이 아닌 정수를 입력하세요.");
			System.out.println(e);// .toString()
			// java.lang.ArithmeticException: / by zero
			System.out.println(e.getMessage());
			// by zero
			// oracle : ora-01031, c언어 : errno 4069, 자바 : message

		} finally { // 생략가능
			System.out.print("산술 연산 문제 해결");
			// DB접속close, 파일close를 해주어야 함.
		}
	}
}