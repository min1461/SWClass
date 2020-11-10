package Controls;

import java.util.Scanner;

public class Q12 {
	public static void main(String[] args) {
		String str = "Hello, World!!!";
		char[] arr = new char[str.length()];
		for(int i=0;i < str.length();i++) {
			arr[i] = str.charAt(i);
		}
		Scanner in = new Scanner(System.in);
		System.out.println("몇번째 글자 인가?");
		int num = in.nextInt();
		System.out.println(num+"번째글자는"+"'"+arr[num-1]+"'이다.");
	}
}
