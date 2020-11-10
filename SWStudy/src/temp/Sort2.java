package temp;

public class Sort2 {
	public static void main(String[] args) {
		int[] k = { 99, 90, 70, 60, 59, 23 };
		for (int i = 0; i < k.length - 1; i++) {
			int sw = 0;// 스위치
			for (int j = 0; j < k.length - 1 - i; j++) { // -i를 해줌으로써 이미 정렬을 완료한건 sort할 필요없음
				if (k[j] < k[j + 1]) {
					int tmp = k[j];
					k[j] = k[j + 1];
					k[j + 1] = tmp;
					sw = 1;// 스위치
				}
			}
			if (sw == 0) {// 스위치
				break;
			}
		}
		for (int i = 0; i < k.length; i++) {
			System.out.println(k[i]);
		}
	}
}
