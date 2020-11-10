import java.util.Scanner;

public class asdfa {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] name = new String[4];
		int[] Score = new int[4];
		for (int i = 0; i < name.length; i++) {
			System.out.print("이름을 입력받으시오.");
			name[i] = in.nextLine();
			
			System.out.print("점수를 입력받으시오.");
			Score[i] = in.nextInt();
			in.nextLine();

		}
		for(int i=0; i<name.length; i++) {
			System.out.println(name[i]+"학생의 점수는 "+Score[i]+"점 입니다.");
		}
	}
}
