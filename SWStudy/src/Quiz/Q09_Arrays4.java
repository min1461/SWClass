package Quiz;
	
/* 달팽이배열
 * 1	2	3	4	5
 * 16	17	18	19	6
 * 15	24	25	20	7
 * 14	23	22	21	8
 * 13	12	11	10	9
 */
public class Q09_Arrays4 {
	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		int sum = 1;
		for (int j = 0; j < 5; j++) {
			for (int k = 0; k < 5; k++) {
				if (j == 0) {
					arr[j][k] = 1 + k;
				} else if (k == 4) {
					arr[j][k] = 5 + j;
				} else if (j == 4 && k >= 0 && k <= 4) {
					arr[j][k] = 13 - k;
				} else if (j == 1 && k >= 0 && k <= 3) {
					arr[j][k] = 16 + k;
				} else if (j >= 1 && j <= 4 && k == 0) {
					arr[j][k] = 17 - j;
				} else if (k == 3 && j >= 1 && j <= 3) {
					arr[j][k] = 18 + j;
				} else if (j == 3 && j >= 1 && j <= 3) {
					arr[j][k] = 24 - k;
				} else if (k == 1 && j >= 2 && j <= 3) {
					arr[j][k] = 26 - j;
				} else {
					arr[j][k] = 25;
				}
			}
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println("");
		}
	}
}
