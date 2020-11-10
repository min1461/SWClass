package Controls;

import java.util.Scanner;

public class Whiles {
	/*
	 * 정수를 입력받아 max 값, 과목수,평균값을 출력하는 프로그램을 작성하시오
	 * (단, 과목수는 모름, 점수 입력시 -1이 들어오면 EOP(end-of-file)을 의미한다.
	 */
		/*
		 * while (true)
		 * 	{ 문장들;(statement);
		 * 	if(조건){ continue; } 
		 * 	if(조건){ break; } }
		 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int max = 0;
		int count = 0;
		int sum = 0;
		int scan = 0;
		while (scan!=-1) {
			System.out.print("점수: ");
			scan = in.nextInt();
			if (scan == -1) {
				System.out.println("과목입력을 끝내겠습니다.");
				break;
			}else if (scan > 100)	{
				continue;
			}else if (scan > max)	{
				max = scan;
			}
			count++;		// 누적스탭
			sum += scan;
		}
		double avg = (double)sum/count;
		System.out.println("최고점 : " + max);
		System.out.println("과목수 : " + count);
		System.out.printf("평균 : %.2f", avg);
	}
}