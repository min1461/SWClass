package Stars;

public class Ex_Multi_Array100 {
	public static void main(String args[]) {
		int[][] square = new int[7][7];
		setupMatrix(square);
		for (int i = 0; i < square.length; i++) {
			for (int j = 0; j < square[i].length; j++) {
				if (i < j) {
					break;
				} else {
					System.out.print(square[i][j] + " ");
				}
			}
			System.out.println();
		}
	}

	public static void setupMatrix(int[][] square) {
		for (int i = 0; i < square.length; i++) {
			for (int j = 0; j < square[i].length; j++) {
				square[i][j] = j + 1;
			}
		}
	}
}