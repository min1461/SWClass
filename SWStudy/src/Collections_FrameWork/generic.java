package Collections_FrameWork;

import java.util.ArrayList;

/*
 * 배열과 컬렉션의 장점을 따서 만들어보자
 * 가변길이배열 + one data type
 * 
 * <기본 자료형이 올수 없다.(Wrapper클래스가 와야함)> 
 * 
 * 형식은 문자열만 들어갈 경우
 * ArrayList <String> arr3 = new ArrayList<String>();
 * 
 * 객체만 들어갈 경우
 * ArrayList <SMarket> arr3 = new ArrayList<SMarket>();
 */
public class generic {
	public static void main(String[] args) {
		ArrayList <String> arr2 = new ArrayList<String>();
		System.out.println(arr2.size());
		arr2.add("빵");
		arr2.add("라면");
		arr2.add("우유");
		arr2.add("김밥");
//		추가는 add
		System.out.println(arr2);
		
		arr2.set(1, "과자");
		System.out.println(arr2);
//		수정은 set
		
		arr2.remove(2);
		arr2.remove("빵");
		System.out.println(arr2);
//		삭제는 remove
		
		System.out.println("==========");
		for(String tmp:arr2) {
			//for문 리스트의 초기부터 리스트의 끝까지 갈때까지 반복
			System.out.println(tmp);
		}
	}
	
}
