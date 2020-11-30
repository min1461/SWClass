package Stars;

public class Ex_Multi_Array100 {
	public static void main(String args[]) {
		int[][] square = null;
		setupMatrix(square);
		for (int i = 0; i < square.length; i++) {
			for (int j = 0; j < square[i].length; j++) {
				System.out.print(square[i][j] + " ");
				System.out.println();
			}
		}
	}

	public static int setupMatrix(int[][] square) {
		for (int i = 0; i < square.length; i++) {
			square[i]=i+1;
		}
	}
}