package Quiz;

import java.util.Scanner;

public class Q01_MoonWeight {
	public static void main(String[] args) {
		/*
		 * 달에서 내 몸무게는 지구에서의 몸무게의 약 17%라고 한다.
		 * 지구에서의 내 몸무게를 저장한 후 이를 달에서의 몸무게로 변환하여 출력하시오
		 */
		Scanner in = new Scanner(System.in);
		System.out.print("몸무게를 입력하시오 : ");
		double weight = in.nextDouble();
		in.close();
		
		double moonweight = weight * 0.17;
		System.out.println("지구에서 나의 몸무게 : " + weight);
		System.out.println("달에서의 나의 몸무게 : " + moonweight);
	}
}