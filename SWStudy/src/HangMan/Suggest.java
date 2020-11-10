package HangMan;

import java.util.Scanner;

public class Suggest {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] question = { "A", "P", "P", "L", "E" };// 정답제시
		String[] half = new String[question.length];// 중간정답출력배열생성
		int[] samechar = new int[question.length];// 각문자의 중복값 설정
		for (int i = 0; i < question.length; i++) {// 초기정답출력 및 중간정답출력을 위한 배열
			half[i] = "_";
		}
		for (int i = 0; i < question.length; i++) {// 초기정답출력 및 중간정답출력을 위한 배열
			int count = 0;
			for (int j = i + 1; j < i; j++) {
				if (question[i] == question[j]) {
					count++;
					samechar[j] = count;
				}
			}
		}
		int sw = 0; // 스위치
		for (int i = 0;; i++) {
			System.out.print("글자 입력 : ");
			String answer = in.nextLine();
			for (int j = 0; j < half.length; j++) { // 중간배열중에
				if (question[j].equals(answer)) { // 입력한 값이 정답과 같은 글자가 있으면
					if (samechar[j] == 1) {
						System.out.print("이 글자는 이미 입력한 글자입니다.");
					} else {
						half[j] = answer;
						System.out.print(half[j]);
						sw++;
						samechar[j] = 1;
					}
				} else {
					System.out.print(half[j]);
				}
			}
			if (sw == question.length) {
				System.out.println("");
				System.out.println("★★★★★★★★\n정답입니다.\n★★★★★★★★");
				break;
			}
			System.out.println("");
		}

	}
}
