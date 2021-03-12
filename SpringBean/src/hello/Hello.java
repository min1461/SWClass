package hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import bangka.Bangka1;
import bangka.Bangka2;

public class Hello {	//Hello.java
	//web-inf 안 lib 안에 spring의 jar 파일을 넣어야함
	//src 아래 hello패키지를 만들고 그안에 Hello.java를 하나 만듬
	
	public static void main(String[] args) {
		//스프링는 pojo를기반
		//bean : spring이 관리하는 인스턴스 
		//ApplicationContext =bean container = bean을 관리
		ApplicationContext ac1 = new ClassPathXmlApplicationContext("applicationContext.xml");
//	==	GenericXmlApplicationContext gxac1 = new GenericXmlApplicationContext("applicationContext.xml");
																	 //ㄴsrc안에 있는.xml을 사용하겠다 
		//ctrl+shift+o 로 import  선택시  springframework 로! 
		
		Bangka1 b1 = (Bangka1) ac1.getBean("bangkaBean1");
								//Bean객체 생성및 초기화 제거등을 관리함
		b1.bangkabangka1("홍길동");
		
		Bangka2 b2 = (Bangka2) ac1.getBean("bBean2");
		b2.bangkabangka2("이도령");

		//지금 spring-java이므로 실행을 지금 파일 application run
	}

}
