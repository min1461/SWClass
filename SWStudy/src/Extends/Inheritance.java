package Extends;
/*
 * 객체 생성 및 메서드 호출
 * 객체의 형변환*중요*
 * (ClassCastException)
 */
public class Inheritance {
	public static void main(String[] args) {
		System.out.println("=====p1=======");		
		parents p1 = new parents();
		p1.money();
		System.out.println("=====c1=======");		
		child c1 = new child();
		c1.money();
		c1.car();
		/*
		 *  p1.car(); 부모는 차가없음 (자녀가 차를 갖고있다.)
		 */
		
		/*
		 * 객체의 형변환
		 * 상위클래스가 하위클래스로 형변환 가능.
		 */
		System.out.println("=====b2=======");
		parents p2 = c1;
		p2.money();
		p2.car();
		
		/*
		 * child c2 = b1;
		 * 하위클래스가 상위클래스로 형변환 불가능
		 */
		
		/*
		 * child c2 = b2;
		 * child c2 = new child;
		 *	-> b2는 부모로부터 가져왔기때문에 오류발생
		 */
		System.out.println("=====c2=======");
		child c2 = (child)p2;
		/*
		 * p2가 child 클래스로 보도록 casting
		 */
		System.out.println("=====c3=======");
//		child c3 = (child)p1; 
//		c3.car();
		/*
		 * 강제 형변환을 문법상 오류를 컴파일러가 인식을 하지 못해서 오류가 나지않지만(컴파일은 가능하지만), 실행이안됨
		 * java.lang.ClassCastException: Extends.parents cannot be cast to Extends.child
		 * at Extends.Inheritance.main(Inheritance.java:45)
		 */
		
		/*
		 * 객체의 형변환
		 */
		System.out.println("=====p3=======");
		parents p3 = new child();
		p3.car();
	}
}