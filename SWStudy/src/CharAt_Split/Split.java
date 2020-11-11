package CharAt_Split;

public class Split {
	/*
	 * 듀엣그룹, duetMiso, 얼굴천사 를 문자열 변수에 넣고, 출력시 한단어를 한줄씩 출력하시오.
	 * 단, split() 사용;
	 * String 인자값을 기준으로 각 배열에 저장하는 명령어.
	 */
	public static void main(String[] args) {
		String s1 = "듀엣그룹,duetMiso,얼굴천사";
		String [] arr = s1.split(",");
//		= String[] arr = {"듀엣그룹","duetMiso","얼굴천사"};
		
		for(int i=0; i< arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
}
