package hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import helloProcess.HelloProcess;

public class Hello {
	public static void main(String[] args) {
		System.out.println("<<<<<<<<안녕>>>>>>>>");
		ApplicationContext ac1 = new ClassPathXmlApplicationContext("aopxml.xml");

		HelloProcess hp1 = (HelloProcess) ac1.getBean("helloProcessBean");
		// ===========이것가동시마다 전에(befor) 공통가동
		hp1.kajaDrive();
		hp1.kajaDrive();
		hp1.kajaDrive();
		hp1.kajaTravel();
		hp1.kajaTravel();
		((AbstractApplicationContext) ac1).close();
	}
}
