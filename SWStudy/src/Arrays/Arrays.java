package Arrays;

/*
 * 배열 : 기억창고를 한꺼번에 잡아주는 것
 * index[0]
 */
public class Arrays {
	public static void main(String[] args) {
		int[] k = new int[3];	//	C#에서 배열쓸때 이방법으로만 가능
//		int j[] = new int[3];	//	이것도 가능하지만.
		/*
		 * int[] = 1차원 배열;
		 *  : 선언 - 자료형[] 배열명 = new 자료형[인덱스];
		 * 		■ ■ ■ ■ ■
		 * 
		 * int[][] = 2차원 배열(다차원 배열);
		 *  : 선언 - 자료형[][] 배열명 = new 자료형[행][열];
		 *  		자료형[][] 배열명 = {
		 *  			{},{}
		 *  		};
		 * 		■ ■ ■ ■ ■ - 0층		[0]~[0~4]
		 * 		■ ■ ■ ■ ■ - 1층		[1]~[0~4]
		 * 
		 * int[][][]......[] = 다차원 배열; 255차원 배열까지 가능
		 */
		int[][] arr = new int[2][3];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				arr[i][j] = (((arr.length + 1) * i + j + 1) * 10);
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