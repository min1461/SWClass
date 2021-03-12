package hello;

import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import helloProcess.SawonDAO;
import helloProcess.SawonVO;

public class Hello {
	public static void main(String[] args) {
		ApplicationContext ac1 = new GenericXmlApplicationContext("jdbctemplatexml.xml");
		SawonDAO sd1 = (SawonDAO) ac1.getBean("sawonDAOBean");

		ArrayList<Object> alist1 = sd1.selectALL();
		Iterator<Object> it1 = alist1.iterator();
		while (it1.hasNext()) {
			SawonVO sv1 = (SawonVO) it1.next();
			System.out.println(sv1.getName() + "\t" + sv1.getTel());
			System.out.println();
		}
		((AbstractApplicationContext) ac1).close();
	}
}
