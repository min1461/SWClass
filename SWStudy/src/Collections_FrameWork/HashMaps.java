package Collections_FrameWork;
/*
 * Iterater Interface
 */
import java.util.Collection;
/*
 * HashMap
 *  - Map 인터페이스를 구현하기 위해 해시테이블을 사용한 클래스
 *  - 중복X, 순서X
 *  - 키와 값으로 null이 허용
 */
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMaps {
	public static void main(String[] args) {
		HashMap<Integer, String> hm1 = new HashMap<Integer, String>();
//		클래스 <generic> 인스턴스명 = new 메서드<generic>();
		// HashMap 이면서 generic이다.
		// 속도가 빠르다. - 로직순이 아니라 원하는 위치(Hash code)로 바로 이동.
		hm1.put(new Integer(100), "멋쟁이");
		hm1.put(new Integer(300), "공주");
		hm1.put(new Integer(200), "왕자");
		// put : 입력(추가)

		System.out.println("===============1");
		System.out.println(hm1.get(300));// 키값입력시 밸류값 출력
		System.out.println(hm1.keySet());// 키값출력
		System.out.println(hm1.remove(200));// 키값200에 해당하는 해쉬맵 삭제->삭제할해쉬맵출력
		System.out.println(hm1.values());// 밸류값출력
		System.out.println(hm1);//삭제후해쉬맵출력(키값=밸류값...)

		System.out.println("===============2");
		Collection<String> v1 = hm1.values();//밸류값
		System.out.println(v1);
		
		System.out.println("===============3");
		Set<Integer> s1 = hm1.keySet();//키값
		System.out.println(s1);

		System.out.println("===============4");
		for (Integer i : s1) {
			System.out.println(i + "\t" + hm1.get(i));
		}
		System.out.println("===============5");
		Set<Map.Entry<Integer, String>> set3 = hm1.entrySet();
		//Map.Entery 1) getkey() 2)getvalue
		for(Map.Entry<Integer, String> k : set3) {
			System.out.println(k.getKey()+"\t"+k.getValue());
		}
		System.out.println("====Hashmap Iterator====");
		Iterator itr1 = hm1.values().iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}
	}
}
