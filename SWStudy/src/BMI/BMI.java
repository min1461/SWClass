package BMI;

import java.util.Scanner;

public class BMI {
	/*
	 * 비만도 몸무게/(키의 제곱)
	 * 35이상 고도비만, 30이상 비만, 25이상 과체중, 20이상 보통, 20이하 저체중
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("키 : ");
		int height = in.nextInt();
		double mheight = height*0.01;
		System.out.print("몸무게 : ");
		int weight = in.nextInt();
		double bmi = weight/Math.pow(mheight, 2);
		
		String result;
		if(bmi>=35) 					result = "고도비만";
		else if(bmi>=30)				result = "비만";
		else if(bmi>=25)				result = "과체중";
		else if(bmi>=20)				result = "보통";
		else							result = "저체중";
		System.out.print("BMI 기분표상 " + result + "이다.");
	}
}
