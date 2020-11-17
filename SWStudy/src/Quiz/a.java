package Quiz;

public class a {
	public static void main(String[] args) {
		final int maxCH = 11;
		int[][] pyo = new int[maxCH][maxCH];// pyo[y][x]
		short ck = 0;// %2해서 나머지가 1이라면 y축컨트롤 0이라면 x축 컨트롤
		int x = 0, y = 0;
		for (int num = 1; num != (pyo.length * pyo[0].length) + 1;) {
			if (ck == 0) {
				pyo[y][x] = num;				num++;				x++;
			} else if (ck == 1) {
				pyo[y][x] = num;				num++;				y++;
			} else if (ck == 2) {
				pyo[y][x] = num;				num++;				x--;
			} else if (ck == 3) {
				pyo[y][x] = num;				num++;				y--;
			}
			if (x == -1) {
				ck++;				x++;				y--;
			} else if (x == pyo.length) {
				ck++;				x--;				y++;
			} else if (y == -1) {
				ck++;				y++;				x++;
			} else if (y == pyo.length) {
				ck++;				y--;				x--;
			} else {
				if (ck == 0 && x != (pyo.length - 1)) {
					if (pyo[y][x + 1] != 0)						ck++;
				} else if (ck == 1 && y != (pyo.length - 1)) {
					if (pyo[y + 1][x] != 0)						ck++;
				} else if (ck == 2 && x != 0) {
					if (pyo[y][x - 1] != 0)						ck++;
				} else if (ck == 3 && y != 0) {
					if (pyo[y - 1][x] != 0)						ck++;
				}
			}
			if (ck == 4)
				ck = 0;
		}
		for (int i = 0; i < pyo.length; i++) {
			for (int j = 0; j < pyo[i].length; j++, System.out.print(" ")) {
				System.out.printf("%-3d", pyo[i][j]);
			}
			System.out.println("\r\n");
		}
	}
}