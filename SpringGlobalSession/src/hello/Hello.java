package hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
																	 //ㄴsrc안에 있는.xml을 사용하겠다 
		//ctrl+shift+o 로 import  선택시  springframework 로! 
		
		Bangka1 b1 = (Bangka1) ac1.getBean("bangkaBean1");
								//Bean객체 생성및 초기화 제거등을 관리함
		b1.bangkabangka1("홍길동");
		
		Bangka1 b3 = (Bangka1) ac1.getBean("bangkaBean1");
		b3.bangkabangka1("성춘향");

		System.out.println(b1.toString());
		System.out.println(b3);
		//==>singleton기법으로 사용
		// 결과는같은 출력이 나옴 // 둘은 같은 객체
		// 그래서 문제점 : 따로 출력은 문제가 없음
		// 동시출력시에는 문제가 발생함
		System.out.println(b1+","+b3);
		
		Bangka2 b2 =(Bangka2)ac1.getBean("bBean2");
		b2.bangkabangka2("이도령");
		System.out.println(b2);
	}
}
