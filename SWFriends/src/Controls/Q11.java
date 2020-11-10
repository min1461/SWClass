package Controls;

import java.util.Scanner;

public class Q11 {
	/*
	 * 세 과목의 성적을 입력 받아 합계와 평균을 구하고 평균이 90이상이면 "A"…60미만이면"F"를 출력하시오.
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("국어점수 : ");
		int kor = in.nextInt();
		System.out.print("수학점수 : ");
		int mat = in.nextInt();
		System.out.print("영어점수 : ");
		int eng = in.nextInt();
		
		float avg = (float)(kor+mat+eng)/3;
		
		if(avg>=90) {
			System.out.printf(String.format("%.1f",avg)+"점수이며 등급은 A");
		}else if(avg>=80) {
			System.out.printf(String.format("%.1f",avg)+"점수이며 등급은 B");
		}else if(avg>=70) {
			System.out.printf(String.format("%.1f",avg)+"점수이며 등급은 C");
		}else if(avg>=60) {
			System.out.printf(String.format("%.1f",avg)+"점수이며 등급은 D");
		}else {
			System.out.printf(String.format("%.1f",avg)+"점수이며 등급은 F");
		}
	}
}