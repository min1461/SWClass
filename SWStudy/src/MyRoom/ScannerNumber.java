package MyRoom;

import java.util.Scanner;

public class ScannerNumber {
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		System.out.print("숫자넣어봐 : ");
		int 	i2 	= 	Integer.parseInt(sc1.next());//	문자->숫자
		sc1.close();
		System.out.println(i2);
		//자료형 	이름	=	자료형.parse자료형(Scanner이름.next메서드);
		/* "30" > 30 */
	}
}