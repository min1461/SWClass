package StackS;

import java.util.Iterator;
import java.util.Stack;

/*
 * stack	lifo(Last in First out)
 * 			filo(First out Last in) (입력 : push 출력 : pop)
 */
public class StackS {
	public static void main(String[] args) {
		Stack<String> st1 = new Stack<String>();
		st1.push("카레");
		st1.push("볶음밥");
		st1.push("뚝배기불고기");
		System.out.println(st1.size());

		System.out.println(st1);

		//		Iterator<String> itr1 = st1.iterator();		// Iterator로 출력(순서 잘보기!)
//		while (itr1.hasNext()) {
//			System.out.println(itr1.next());
//		}

		while (!st1.isEmpty()) {
			System.out.println(st1.pop());

		}
		System.out.println(st1);	//	 isEmpty가 아닐때까지 pop을 했기 때문에 (empty가 될때까지 pop을 했기때문에) 출력할 내용이 없다.

	}
}
