package Programmers;

public class OneOrI {
	public static int Solution(int n) {
		int answer = 1;
		for (int i = 3; i <= n; i++) { // 1~n까지의 숫자 for문
			int count = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					count++;
					if (count > 0) {
						break;
					}
				}
			}
			if (count == 0) {
				answer++;
			}
		}
		return answer;
	}


	public static void main(String[] args) {

		System.out.println(Solution(10000));
	}
}
