package helloProcess;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;


@Aspect
public class Security {// Security.java

	@Pointcut("execution(* helloProcess..*())") // kajaDrive()같은메소드
	private void mukja() {// 아무이름의 메소드를 하나만듬
		// 구조를 위해 mukja()이것을 사용함
		// 여기 내용은 없음!

	}// mukja()-end

	// 그런다음 mukja()에 대해한번써보자
	// before 즉 , mukja()관련 핵심로직 kajaDrive()가동전에 goSecurity()수행
	@Before("mukja()")
	public void goSecurity() { // aspect 처리를 위한 메소드임 !
		System.out.println("공통 : 여기는 보안처리중");
		// 핵심메소드에 before를 적용 ,공통로직은 goSecurity()
	}

	// Q.여기서 after에 goSecurity2()도 추가하시오

	@Pointcut("execution(* helloProcess..*())")
	private void gamehaja() {

	}

	@After("gamehaja()")
	public void goSecurity2() {
		System.out.println("after: 게임하자");
	}
}

// com.springsource.org.aspectj.weaver-1.6.8.RELEASE.jar 추가해야
// 안하면 에러 남