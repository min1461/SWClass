package Arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Collection;
import java.util.Set;

public class HashMaps {
	public static void main(String[] args) {
		HashMap<Integer, String> hm1 = new HashMap<Integer, String>(); // <키값,밸류값>
		// HashMap 이면서 generic이다.
		// 속도가 빠르다. - 로직순이 아니라 원하는 위치(Hash code)로 바로 이동.
		// put : 입력(추가)
		hm1.put(new Integer(100), "멋쟁이");
		hm1.put(new Integer(300), "공주");
		hm1.put(new Integer(200), "왕자");

		System.out.println("===============");
		System.out.println(hm1.get(300));// 키값입력시 밸류값 출력
		System.out.println(hm1.keySet());// 키값출력
		System.out.println(hm1.remove(200));// 키값200에 해당하는 해쉬맵 삭제
		System.out.println(hm1.values());// 밸류값출력

		System.out.println("===============");
		Collection<String> v1 = hm1.values();
		System.out.println(v1);
		
		System.out.println("===============");
		Set<Integer> s1 = hm1.keySet();
		System.out.println(s1);

		System.out.println("===============");
		for (Integer i : s1) {
			System.out.println(i + "\t" + hm1.get(i));
		}
		System.out.println("===============");
		Set<Map.Entry<Integer, String>> set3 = hm1.entrySet();
		for(Map.Entry<Integer, String> k : set3) {
			System.out.println(k.getKey()+"\t"+k.getValue());
		}
	}
}
