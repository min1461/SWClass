package Exception;

/*
 * java.lang.ArithmeticException : 0으로 나눌수 없어서 오류!
 */
//		try {}				// 에러 발생 예상지점
//		catch{}				// 에러 발생시 표시
//		finally {}			// 에러 발생시 무조건 실행
import java.util.Scanner;

public class what {
	public static void main(String[] args) {
		try { // 0으로 나눔
			Scanner in = new Scanner(System.in);

			System.out.print("첫번째수는 : ");
			String str = in.nextLine();
			// 빈칸 포함 한줄 다 입력
			// i love you 한줄 다 읽음
			// but, next()는 i만 입력~~~
			int num = Integer.parseInt(str);

			System.out.print("두번째수는 : ");
			String str2 = in.nextLine();
			int num2 = Integer.parseInt(str2);
			System.out.print(num / num2);
			System.out.println("");
		} catch (Exception e) {
			System.out.println("에러 내용은 " + e);// 에러내용 표시
		} finally {
				System.out.print("산술 연산 문제 해결");
		}
	}
}