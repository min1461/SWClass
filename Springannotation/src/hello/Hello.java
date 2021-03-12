package hello;

import org.springframework.context.support.GenericXmlApplicationContext;

import insapkg.Insa;

public class Hello {
	public static void main(String[] args) {
		System.out.println("ㅎㅇ");
		String str1="Hello,Spring";
		
		GenericXmlApplicationContext gxac1=new GenericXmlApplicationContext("appcon.xml");
		Insa insa=gxac1.getBean("insa10",Insa.class);
		System.out.println(insa.helloName(str1));
		gxac1.close();
	}
}
