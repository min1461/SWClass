package Methods;

import java.util.Scanner;

public class Methods2 {
	private static String BMI(double mheight,double weight) {
		double bmi = weight/Math.pow(mheight, 2);
		
		String result;
		if(bmi>=35) 					result = "고도비만";
		else if(bmi>=30)				result = "비만";
		else if(bmi>=25)				result = "과체중";
		else if(bmi>=20)				result = "보통";
		else							result = "저체중";
		return result;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("키 : ");
		double height = in.nextDouble();
		double mheight = height*0.01;
		System.out.print("몸무게 : ");
		double weight = in.nextDouble();
//		System.out.println(BMI(mheight,weight));
		
		System.out.print("BMI 기분표상 " + BMI(mheight,weight) + "이다.");
	}
}