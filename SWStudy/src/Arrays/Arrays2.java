package Arrays;

public class Arrays2 {
	public static void main(String[] args) {

		int[][] arr = new int[3][3];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = 1 + i + j * 3;
//				arr[i][j] = (arr.length) * i + j * 3+1;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println("");
		}
	}
}