package temp;

public class temp {
	public static void main(String[] args) {
		int[] arr = {3,4};
		// 변경전
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		
		// 변경과정
		int tmp = arr[0];
		arr[0] = arr[1];
		arr[1] = tmp;
		System.out.println("=================================");
		// 변경후
		System.out.println(arr[0]);
		System.out.println(arr[1]);
	}
	
	
}
