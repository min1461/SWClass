package sawonpkg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class dodo {
	public static void main(String[] args) {
		ApplicationContext ac1 = new ClassPathXmlApplicationContext("appcon.xml");

		VO b1 = (VO) ac1.getBean("sawonBean1");
		b1.setId(3);
		b1.setIrum("연수");
		System.out.println(b1.toString());

		VO b2 = (VO) ac1.getBean("sawonBean1");
		b2.setId(5);
		b2.setIrum("태식");
		System.out.println(b2);
		
		if(b1==b2) {
			System.out.println("같은객체");
		}
		System.out.println(b1+","+b2);

		VO b3 = (VO) ac1.getBean("sawonBean2");
		b3.setId(7);
		b3.setIrum("수빈");
		System.out.println(b2);
		System.out.println(b1+","+b2+","+b3);
	}
}
