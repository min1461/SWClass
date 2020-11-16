package Int_integer;

import java.util.ArrayList;

/*
 * Int vs integer(클래스화)(wrapper)
 * int는 null 사용x integer는 가능
 * int는 연산 o, integer는 unboxing 해야 산술연산 o
 * 		int aa = 30;	 // 스택(Stack)
 *		Integer bb = aa; // 힙(Heap) // auto boxing
 *		int cc = bb;				// auto unboxing
 *
 * sql의 null과 연동시 integer로 연동
 * (참고) integer.parseInt() vs Integer.valueOf()
 * 		 int값 반환, 연산 o		   integer반환, 연산 x
 */
public class Int_integer {
	public static void main(String[] args) {
		ArrayList arr1 = new ArrayList();
		System.out.println(arr1.size());// length가 아니고 size로 확인함

		arr1.add(new Integer(300));			// add 입력
		arr1.add(new Double(100.7));
		arr1.add(new Character('A'));
		arr1.add(new String("Hello"));
		arr1.add(/*내용*/'a');
		
		System.out.println(arr1);			// arr1의 전체를 출력
		for (int i = 0; i < arr1.size(); i++) {
			System.out.println(arr1.get(i));// 입력한 value번째 값 출력
		}
		System.out.println(arr1.size());// length가 아니고 size로 확인함
	}
}
