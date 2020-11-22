package Strings;

public class startsWith_endWith {
	public static void main(String[] args) {
		String s1 = "good";
		if(s1.startsWith("go")) {	//매개변수로 시작하면~
			System.out.println(s1);
		}
		if(s1.endsWith("ood")) {	//매개변수로 끝나면~
			System.out.println(s1);
		}
	}
}
