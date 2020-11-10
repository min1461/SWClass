package Quiz;

/* 빗무늬 배열
 * 1	2	4	7	11
 * 3	5	8	12	16
 * 6	9	13	17	20
 * 10	14	18	21	23
 * 15	19	22	24	25
 */
public class Q08_Arrays3 {
	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		int sum = 1;

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 5; j++) {
				for (int k = 0; k < 5; k++) {
					if (j + k == i) {
						arr[j][k] = sum++;
					}
				}
			}
		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}