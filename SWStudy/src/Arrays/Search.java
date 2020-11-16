package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Search {
	/*
	 * Sequence Search (순차검색)
	 * 		(n+1)/2
	 * Binary search (이진검색) -> UpDown -> Arrays.Sort인 상태로 입력값 사이를 제외한 모든 값을 제거
	 * 		log2N+1 = 8 (2의 8승=n) / Arrays.binarySearch(범위,위치)
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int [] arr = {11, 84, 45, 78, 34, -2, 0};
		Arrays.sort(arr);
		int sw=0;
		int count = 0;
		System.out.println("숫자를 받으시오.");
		int num = in.nextInt();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<0) {
				count++;
			}
		}
		if (Arrays.binarySearch(arr, num)+count>=0){
			System.out.println(num + "의 위치는 1번째부터 시작하여 " + Arrays.binarySearch(arr, num) +"번째에 있다.");
		} else {
			System.out.println("없다.");
		}
//		for(int i = 0; i<arr.length;i++) {
//			if(arr[i]==num) {
//				System.out.println(num + "의 위치는 0번째부터 시작하여 "+i+"번째에 있다.");
//				sw=1;
//			}
//		}
//		if(sw==1)
//			System.out.print(num+"없다");
	}
}
