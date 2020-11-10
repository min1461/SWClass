package Quiz;

import java.util.Scanner;

public class Q07_MethodScore2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] arr = new int[5];
		for (int i = 0; i < 5; i++) {
			System.out.println(i + "번째 인덱스의 점수를 입력하시오.");
			int score = in.nextInt();
			arr[i] = score;
		}
		for(int i=arr.length-1;i>=0;i--) {
			System.out.println("인덱스["+i+"]의 점수는 "+arr[i]+"점이다.");
		}
	}
}
