package Collections_FrameWork;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/*
 * Iterator interface
 * 
 * Queue(fifo:first in first out)
 *	먼저들어온게 먼저나감
 * lilo : last in last out
 * 
 * collection 인터페이스
 * ->Queue(큐) interface -> 상속받아 만든 LinkedList클래스
 * 	LinkedList<String> q2 = new LinkedList<String>();
 */
public class Queue1 {
	public static void main(String[] args) {
		/*
		 * Queue q1 = new LinkedList();
		 */
		Queue<String> q1 = new LinkedList<String>();
//	==	LinkedList <String> q1 = new LinkedList<String>();

		q1.offer("바보");
		q1.offer("온달");
		q1.offer("평강공주");
		// put : 입력(추가)

		System.out.println(q1.size()); // 3
		System.out.println(q1); // [바보, 온달, 평강공주]

		Iterator<String> itr1 = q1.iterator();
		while (itr1.hasNext()) {
			String name1 = itr1.next();
			System.out.println(name1+"*");
			// 위 2줄이랑 아래 1줄은 같은 뜻
			System.out.println(itr1.next()+"**");

			if (!q1.isEmpty()) {	// q1.이 비어있지 않나?
				q1.poll();			// 바보 꺼내는 메소드
			}
			if (!q1.isEmpty()) {	// q1.이 비어있지 않나?
				q1.poll();			// 온달 꺼내는 메소드
			}
			q1.offer("홍길동");		// 평강공주 뒤에 홍길동을 추가
			
			System.out.println(q1.size()+"***");
			System.out.println(q1.peek()+"****"); // 처음 값 출력
			System.out.println(q1+"*****");
		}
	}

}