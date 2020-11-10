package Quiz;

import java.util.Scanner;

public class Q05_Score {
	public static void main(String[] args) {
//		int kor = 100;
//		int eng = 80;
//		int mat = 70;
//		int soc = 60;
//		int sci = 50;
//		int count = 5;
		int count = 0;
		int sum = 0;
		int i=0;
		int end=-1;

//		sum = kor + eng + mat + soc + sci;
//		System.out.printf("총점은 %d 점 이고, 평균은 %.2f 점 이다.", sum, avg);
		Scanner in = new Scanner(System.in);

		int[] score = new int[count];
		for (i = 0;;i++) {
			System.out.println(i + 1 + "과목의 점수를 입력하시오.");
			int NewClass = in.nextInt();
			if (NewClass == end) {
				break;
			} else {
				score[i] = NewClass;
				sum += NewClass;
			}
		}
		double avg = sum / i;
		System.out.printf("총점은 %d 점 이고, 평균은 %.2f 점 이다.", sum, avg);
	}
}
