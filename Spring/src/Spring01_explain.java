
public class Spring01_explain {
/*
 * JAVAEE(Java Enterprise Edition vs Spring
 * - JavaEE : 웹 기술인 JSP, Servlet - 분산처리 기술인 EJB(Enterprise Java Beans) 기술
 * - 이때 EJB작성 후 배포시 통일되는 기준없이 xml을 만들어 각각 배포하는 문제 발생
 * (참고 : 엔터프라이즈 - 기업의 업무처리를 위한 것)
 * - 그래서 SPRING(Framework)이 대두 됨
 * (참고 : Design pattern)
 * 
 * Spring이란?
 * - 별명은 Spring Servlet
 * - 쉽고 효율적인 JavaEE 개발을 위한 Framework
 * - 개발자 0 Rod Johnson
 * 
 * Spring의 특징
 * - lightweight(경량)급 프레임워크
 * - 무거운 EJB의 해결책
 * - 엔터프라이즈 시스템에서 요구하는 분산처리, 확장성, 안정성 등을 해결
 * - POJO를 베이스로 하는  엔터프라이즈 개발 프레임워크로 재사용성이 좋다
 * (참고) POJO : Plain Old Java Object로 자바가 중심이고 자바는 다른 것에 종속되지 않는다.
 * 		(다른 클래스를 상속받아서 만들어야 하는 클래스가 아니다.)
 * 
 * - 전자정부 표준 프레임워크 (MyBatis)
 * 
 * Spring의 작성방법 3가지
 * 1)
 * 기존 eclipse (Dynamic Web Project)에 spring library 추가하기
 * ===> (local storage, repository) like jdk,jre의 rt.jar
 * 
 * Dynamic Web Project - we-inf - lib에 .jar추가
 * ===> 결과적으로 web에서 spring으로 처리 가능해진다.
 * 급받는 방식 2가지 
 * 1) 직접다운로드 
 * dynamic web project + 스프링 library를 다운받아 넣음
 * 2) pom.xml사용
 * 
 * 2) - 현업에서 주로 이 방법을 사용
 * 기존 이클립스에 STS(Spring Tool Suite)를 plug-in하기 (이걸로도함 )
 * -pom.xml이라는 환경 설정 파일에 써 놓으면 스프링이 알아서 다운받음 
 * -spring project + pom.xml에 필요한 라이브러리를 받도록 적어줌
 * (참고) 이 방식으로 작성하면 프로젝트에 작성하자마자 엑박이 뜬다, 그리고 잠시 기다리면 사라진다.
 * 
 * 3)
 * STS툴 ( 이클립스+ STS) 다운받아 INSTALL하기
 * - STS는 이클립스 기반에 스프링 프레임워크를 사용할 수 있는 툴
 * 
 * Spring 상세 작성하기
 * eclipse의 lib 방에 스프링.jar(.class 파일의 집합) (rt.jar참고) 파일 붙여넣기
 * 
 * ex) ojdbc6.jar 붙여넣기
 * <Spring에서 제공하는 jar 파일 예>
 * spring-beans-4.1.7.RELEASE.JAR
 * spring-context--4.1.7.RELEASE.JAR
 * spring-jdbc-4.1.7.RELEASE.JAR
 * spring-tx-4.1.7.RELEASE.JAR
 * spring-aop-4.1.7.RELEASE.JAR
 * spring-aspects-4.1.7.RELEASE.JAR
 * spring-core-4.1.7.RELEASE.JAR
 * spring-expression-4.1.7.RELEASE.JAR
 * 
 * <JAR파일 갖고 오는 곳>
 * 1) 직접다운로드
 * 원격저장소(오픈소스재단, 기업체)
 * https://maven.springframework.org/release/org/springframework/spring/4.1.7.RELEASE/
 * ===>.../release/까지만 치고 찾아가도 된다.
 * ...dist.zip를 다운받는다.
 * 압축을 푼 후 libs 방에 있는 .jar파일 하나를 Dynamic Web Project의 web-inf아래에 넣는다
 * 예) Spring-context...release.jar
 * 
 * 2)
 * (MAVEN방식 : pom.xml 환경설정파일을 사용하는 방식, 자동으로 원격저장소에서 jar를 갖고오는 방식)
 * - 먼저 sts를 plug-in하기
 * (참고) spring sub framework로 spring boot가 있음
 * 주 목적이 Micro Service Architecture(MSA) 와 연관
 * 예) 넷플릭스 (Netflix) - HA(High Available : 고가용성)
 * API,ZUUL,Hystrix,Ribbon,Eureka
 * 
 * Eclipse Photon에 맞는 플러그인 방법1)
 * 이클립스 help - eclipse marketplace - find에서 sts 입력
 * 
 * Eclipse Photon에 맞는 플러그인 방법2)
 * 이클립스 help - Install New Software에서 work... 맨 뒤에 [add] 버튼을 누름
 * photon = 4.8버전이므로 이름에 ph4.8적당히 작성
 * url에는 http://dist.springsource.com/release/TOOLS/update/e4.8/
 * (참고) 버젼에 맞게 입력해야함
 * Do you trust these certificates?라는 바운시캐슬 나오면
 * select all - accept selected 후 설치 계속
 * (참고) Bouncy Castle : 경량 암호화 방식을 말하며 Java Cryptography API이다.
 * restart - window - perspective - open perspective - spring
 * 
 * -간단한 제작 ( 스프링자바, maven방식)
 * -file -new - spring legacy project(안보이면 other...)
 * -간단한 이름 (springMaven)주고
 * -simple spring maven 
 * (만일 첫 가동등으로 spring legacy project가 바로 안나오면 
 * 먼저 other로 간후 spring 폴더에서 spring legacy project 선택)
 * <tip> 위 프로 젝트를 만들면 만들자마자 아무것도안했는데 엑박뜨면 기다림 , 잠시후 엑박사라짐
 * why ? remote repository에서 다운받아오는 시간 때문에 
 * 
 * MAVEN이란?
 * 라이브러리 다운로드 관리자
 * 즉, pom.xml에 선언된 라이브러리를 파악하여 중앙저장소에서 로컬 저장소로 라이브러리를 다운한다.
 * 
 * 
 * pom.xml이란
 * - pom(Project Object Model)
 * - 메이븐프로젝트 (환경) 설정파일
 * (예)<dependecies>
 * <dependency>
 * (라이브러리 하나씩 기록, 빌드시 저장소에서 라이브러리 다운함)
 * ...
 * <groupId>org.springframework</groupId>
 * <artifactid>spring-context</artifactid>==>모듈이름(아티팩트이름)
 * <version>${org.springframework-version}</version>==>버전
 * </dependency>
 * 		:
 * 		:
 * </dependencies>
 * 위의 의미는 classpath에
 * spring -context - 버전.release.jar파일이 추가되는 것을 의미함
 * (참고) transitive dependencies(의존의 전의)
 * 해당 dependency만 다운받는 것이 아니라 관계된 것까지 다운받는 것
 * 
 * #####. 스프링 에러 대처하기
 * ###. 만들기 전 주의사항
 * spring 전체가 맞물려 돌아가므로 같은 연결내용만 같은 프로젝트에 만든다.
 * 즉, 새로운 프로그램 작성시에는 새 프로젝트를 만든다.
 * 
 * ###. spring 만들고 나서 에러 해결하기
 * #. 기본적으로 항상 서버설정 및 jdk버전 확인,
 * #. workspace를 UTF-8 모드로 정함 (가능한)
 * (즉, 새로 프로젝트 작성시에 window-preferences-general-workspace)
 * #. pom.xml에서
 * 1) pom.xml의 자바 설정부분을 1.6에서 1.8로 변경
 * <java-version>1.8</java-version>
 * (필요시 maven 설정파일인 pom.xml을 열어 스프링 버전을 4.1.7등으로 변경)
 * 
 * tools.jar 추가
 * Java Build Path - Libraries 탭
 * - JRE System Library [JavaSE-1.8] 더블클릭
 * - Alternate jre를 선택 - Installed JREs...를 클릭
 * - JRE system libraries에서 Add External JARs...를 선택 후
 * - jdk/lib/tools.jar를 추가
 * 
 * Maven clean 후 Maven install 후
 * 라이브러리 등록을 확실히 하기 위해서 상단메뉴 Project - Clean - Clean까지 실행
 * (프로젝트 - 우클릭 - configure build path - build path - Library탭을 누른 상태에서 Maven dependency(repository) 엑박시)
 * 그래도 엑박이 뜨면 프로젝트 - 우클릭 - maven - "update project"로 Maven 반영
 * 예) 프로젝트 우클릭 run as - maven clean부터 차례대로 하면 됨
 * 
 * 다른 것 다 해봐도 안되면 이클립스 닫고 .m2 아래 repository폴더
 * 즉, 로컬저장소(repository) 삭제 후 다시 실행
 * 
 * 톰캣관련 에러시
 * 1) 서버탭의 톰캣 아래 있는 프로젝트 목록 중 지금 프로젝트 목록 빼고 전부 다 remove
 * 2) 서버더블클릭 - modules탭클릭 - path중복된 것 있나 확인 후 remove or 수정
 * 3) 다른 컴퓨터로 스프링 소스 이용하여 작업시 등으로 java build path에서 Maven Dependency에러 발생시
 * ==>프로젝트 - 우클릭 - maven - update project(spring boot에서도 이것으로)
 * 
 * (참고) pom.xml에 엑박 뜨는데 jar를 전부 unknown하다고 나오는 에러시
 * 자바버젼<java.version>1.8</java.version>앞에 메이븐 플러그인 버전을 써줌
 * 예) <maven-jar-plugin>3.1.1</maven-jar-plugin>
 * <java.version>1.8</java.version>
 * 
 * 결합도
 * 결합도와 팩토리
 * factory : 객체 생성을 처리하고 리턴해주는 클래스
 * 결합도 : 클래스의 변경사항이 다른 클래스에게도 영향미치는 정도
 * factory패턴은 객체를 직접생성하지 않고 factory method class로 객체를 생성한 후
 * 리턴 받으므로 결합도가 낮아 유지보수에 용이함
 * 
 * (예) 결합도가 높은 경우
 * - new를 사용하여 AA,BB,CC가 변경되면 복합class내용 줄줄이 변경해야함
 * class AA{void kajaAA()}
 * class BB{void kajaBB()}
 * class CC{void kajaCC()}
 * 
 * class bokhap{
 * AA aa = new AA();
 * BB bb = new BB();
 * CC cc = new CC();
 * 
 * void cheori(){
 * aa.kajaAA(); bb.kajaBB(); cc.kajaCC();
 * 		}
 * }
 * 
 * (예) 결합도가 낮은 경우(결압도높은것에 비해 수정범위가 좁혀진다)
 * class kwailFactory{
 * mukja(String moya);
 * }
 * 
 * class Kwail extends kwailFactory{
 * 	mukja(String moya){
 * 		if(kwil2.equals("사과")){
 * 			return new AA();
 * 		}else if(kwil2.equals("배")){
 * 			return new BB();
 * 		}
 * 	}
 * 
 * ==> 스프링은 결합도가 낮은 방식을 사용
 * 1) 다른 곳에서 new를 해서 기본소스로 넣어준다(역방향)
 * 2) 연관성이 적은 xml을 사용하여 처리한다.
 * 이것이바로 'DI'
 * 
 * ------------------------------------------
 * 기존 class안에서 new 객체생성
 * 
 * but,
 * spring에서는
 * xml환경설정파일에서 "객체를 생성"하고
 * 실행시에는 그 객체들을 갖다 쓰겠다
 * 즉, new는 어디서? xml파일에서 한다 그리고 그 new한 것을 불러다 사용하겠다
 * (참고) xml 체계적 : 전송, 환경설정시 사용
 * 
 * DI(Dependency Injection,의존성 주입) 작성 방식
 * spring의 bean
 * 스프링에서 객체생성시 bean객체(empty x)라고 표현함
 * 표현방법은 xml 태그를 사용하여
 * <bean id="bangkaBean1" class="bangka.Bangka1"/>
 * 또는
 * <bean>.............</bean>
 * 이며
 * id에는 객체명을 쓰고 class에는 패키지명,클래스명을 쓴다
 * useBean
 * 
 * 이는 기본 자바객체형태로 본다면 다음과 같은 의미이다.
 * package bangka;
 * Bangka1 bangkaBean1 = new Bangka1();
 * 
 * "spring에서는 객체 생성시 .xml파일에다가 new없이 bean객체를 사용한다"
 * ==> 작성된 형태
 * namespace : 이름공간
 * xml namespace // 이름공간,xml문법,까다롭다
 * <bean xmlns=....>
 * <bean xmlns=....>
 * <bean id="bangkaBean1" class="bangka.Bangka1"/>
 * </bean> ==>new 대신에
 * 
 * <bean xmlns=....>
 * <bean id="bangkaBean2" class="bangka.Bangka1"/>
 * </bean>
 * 
 * Spring은 외부 환경설정파일에서 객체를 선언하고 그것을 불러 써보자
 * - Object Factory vs ApplicationContext
 * (1) Object Factory
 * 		DAO Factory로 직접적인 "객체생성"을하고 처리하는 경우
 * (2) ApplicationContext
 * 		IoC container, Spring container, BeanFactory를 의미
 * 		ApplicationContext는 객체에 대한 생성정보등을 받아 관리
 * 
 * 		IoC 컨테이너(Inversion of Control, 제어의 역전 container)
 * 		Bean 객체의 lifecycle을 관리 즉, 객체를 생성, 관리 및 소멸을 ApplicationContext가 함
 * 			재사용이 좋다
 * 			XML등의 메타정보로 관리
 * (참고) servlet container : 서블릿의 lifecycle을 관리
 * 
 * getBean()메소드 : Bean 객체 생성 및 초기화 제거등을 관리함
 * spring - beans - ...jar
 *  ㄴorg.springframework.beans.factory
 *  	ㄴ BeanFactory.class
 *  		ㄴ getBean()
 *  
 *  DI(Dependency Injection, 의존성 주입)
 *  Spring에서 BeanFactory(bean 생성 및 제어) 가 기본 IoC 컨테이너,
 *  보다 향상된 것이 ApplicationContext 컨테이너(beanfactory+어플리케이션추가지원)
 *  (IoC container,Spring container,BeanFactory)
 *  IoC 컨테이너에 의해 Bean의 생명주기가 관리된다.
 *  (참고) spring bean 객체 : 
 *  (=POJO 즉, 종속되지 않은 자바 클래스로 "simply a java object" 번역하면 "자바객체"
 *  이때 XML 설정을 통해 각각의 Bean 들을 묶어주는데 wiring이라고 한다
 *  묶여진 Bean을 원하는 곳에 적용하는 것을 DI(의존성주입)이라고부른다.
 *  즉, "DI 의존성주입"이란 "객체를 생성해서 필요로 하는 곳에 넣어주는 것"
 *  
 *  설정 메타데이터(configuration metadata)
 *  개발자가 스프링컨테이너에게 객체 생성 방법등을 알려주기위해 사용하는 메타정보를 말함
 *  주로 다음 3가지로 알려줌
 *  1) xml 기반 설정 메타데이터
 *  <beans ...></beans> 로 구성
 *  2) annotaion기반 설정 메타데이터 (스프링2.5부터 시작)
 *  3) 자바기반 설정 메타데이터 (스프링 3.0부터 시작)
 *  
 *  ==>서블릿
 *  page > request > session > application
 *  
 *  spring의 scope
 *  스프링 bean객체는 singleton이 default
 *  <Bean XML 설정>
 *  scope 설정 : IoC Container에 의해 관리되는 Bean의 기본범위는 singleton(전역) 이며, scope 속성으로 각각 다르게 지정함
 *  <1> singleton(기본값) : 한개의 bean객체를 사용
 *  IoC Container 내에서 유일한 객체로 생성하는 범위
 *  객체 필요시 하나로 사용함 (전역인스턴스)
 *  why? 메몰 ㅣ낭비 방지, web의 경우 서버로 들어오는 request마다 객체를 만들면 안되므로
 *  bean을 singleton으로 만들고 쓰레드에서 공유하여 사용하도록 함
 *  기본값이므로 작성시 생략가능함
 *  <bean id="bangkaBean1" class="bangka.Bangka1" scope="singleton">
 *  <bean id="bangkaBean1" class="bangka.Bangka1">
 *  
 *  만일 annotation 기법으로 하면 (설정 메타데이터 : configuration metadata)
 *  @webservlet()//서블릿에서...........라는뜻인데
 *  @Scope("singleton") //xml을 사용안한다면
 *  class Bangka1 {클래스가 준비되어 있을때
 *  }
 *  
 *  prototype : 호출때마다 getBean()에 따라 새로운 인스턴스생성
 *  (즉, 객체가 따로 생성되는 방식으로 bean을 사용할때마다 bean객체생성)
 *  scope="prototype"라고입력
 *  singleton은 하나의 객체이므로 따로 출력일때는 o
 *  만일 동시에 출력할경우는 문제발생
 *  <3> request : spring-mvc(스프링웹)에서 HTTP요청시마다bean객체를 생성하며 요청후 제거됨
 *  <4> session : spring-mvc에서 HTTP-세션마다 객체를 생성하고 user"브라우저를 닫기전"까지 유지됨
 *  globalSession : portlet지원
 *  타이틀바
 *  [증권정보][뉴스][날씨]
 *  버튼
 *  
 *  Q) non-maven 프로젝트로 singleton, prototype 연습하기
 *  
 *  사원에 대한 vo를 만들고 메인에서 이를 이용하여 다음처럼 출력되도록 작성하시오
 *  필드 private int id;
 *  private String irum;
 *  getter/setter/toString()도 만들어야한다
 *  mainpkg,sawonpkg(vo),xml작성
 *  ==출력디자인==
 *  사원id는3,이름은연수라는
 *  사원아이디는 5, 이름은 태식 ~  사원아이디는 5, 이름은 태식 ~
 *  사원아이디는 5, 이름은 태식 ~  사원아이디는 5, 이름은 태식 ~  사원아이디는 7, 이름은 수빈~
 *  
 *  jsp useBean
 *  sawon1.setIrum*"세젤예는 누구? 나!");
 *  sawon1.setNa2("24");
 *  ==> 자바를 자바가 아닌것처럼 하는 것은?
 *  action tag,taglib el
 *  <jsp:setProperty name="sawon1" property="irum" value="세젤예는 누구? 나!"/>
 *  <jsp:setProperty name="sawon1" property="na2" value="24"/>
 *  ==> setIrum("세젤예는누구? 나!"),setNa2("24")
 * 
 *  <jsp:getProperty name="sawon1" property="irum"/><br>
 *  <jsp:getProperty name="sawon1" property="na2"/><br>
 *  ==> getIrum(),setNa2()
 *  
 *  Setter Injection : setter 메소드를 이용 하여 인자를 전달
 *  remember : Java Beans useBean,property....
 *  .setIrum("이서준");
 *  
 *  2)Constructor Injection(생성자 주입)
 *  생성자에 필요 객체를 선언하고 멤버변수(Field)로써 객체를 사용하는 경우처럼 사용
 *  
 * ===============================================================
 * 
 *  property에 대한 설명은 [  ] => 
 *  
 *  2월말일자
 *  [				수업다시듣기				]
 *  
 *  constarg/Constarg.java를 작성하여 insa 객체참조변수(insabean객체)를 받을 수 있도록 프로그램을 작성하시오( 생성자 인젝션 방식으로 )
 *  
 *  bean태그없이 자동 bean등록하기
 *  <context:component-scan="패키지" /> 태그로 사용 가능
 *  .xml에서 context:component-scan, AND
 *  @component, @Value등을 사용하면 다른 설정없이 자동 bean 등록이 가능
 *  -- spring-context-4.1.7.jar
 *  
 *  (살펴보면)
 *  new로 객체를 생성 > bean > bean 작성이 x
 *  how???
 *  <context:component-scan="패키지"/> 와
 *  @component,@Value등을 사용
 *  
 *  - 클래스 위에 @Component : XML 별도설정없이
 *  자동 bean 등록(@Component("name")이름 지정 가능)
 *  @Component 는 <bean> 객체 역할로 @component가 해당 자바클래스를 spring bean이라고 알려주며 해당 클래스를 ApplicationContext에 bean으로 등록시킴
 *  (.xml namespaces탭에서 context체크 필요)
 *  
 *  @Autowired vs @Resource
 *  - Autowired : type 기반으로
 *  자동 injection 대상에 @Autowired 사용
 *  xml설정에 <context:annotation-config/> 설정추가
 *  -@Resource : 이름 기반
 *  
 *  @Autowired 는 <property>나 <construct-arg> 역할로
 *  자동으로 같은 이름의 bean을 찾아 injection 그러므로 setter, 생성자 선언 필요없음
 *  
 *  <context:annotation-config/>는
 *  이미 "등록되어 있는" bean에 대해서만 annotation을 활성화함
 *  그러므로 "bean객체 선언"을 해야함
 *  
 *  저쪽에서도 @Autowired도 추가해야 한다.
 *  참조변수와 mapping 및 bean 객체가 명시적으로필요할때는
 *  <context:annotation-config /> 와 @Autowired 등을 연동하여 사용한다는 것
 *  (단, @Autowired는 해당 type bean 객체가 없거나 여러개 있으면 에러)
 *  namespaces 에서 context에 체크해야
 *  <context:annotation-config/>를 보면 .java에서
 *  @Autowired 등이 사용됨을 짐작함
 *  ==> Insa.8Line
 *  
 *  <<<<<<<<<<<<<<<   AOP   >>>>>>>>>>>>>>>
 * AOP: Aspect Oriented programming( 관점지향 프로그래밍)
 * 핵심기능과 공통기능을 구분하여 재사용 기능을 높임
 * 코드 수정없이 공통기능 사용    
 * 
 * AOP용어
 * Weaving :핵심기능과 고통기능(Aspect)을 묶어주는것     
 * 
 * Advice: 언제 콩통기능을 적용할지 정의 
 * Before: 메소드 호출전에 공통기능실행
 * After: 메소드 실행후 무조건 고통기능 실행 
 * After Returning: 메소드가 exception없이 실행된 후에 공통기능실행
 * After Throwing: exception발생한 경우 공통기능 실행 
 * Around: 메소드 실행전,후 exception 발생시점에 공통기능 실행
 *         
 * Joinpoint: 언제호출할지를 결정하는것 
 * Advice 적용 가능한 지점, 스프링은 메소드호출만 지원)    
 * 
 * Pointcut: 실제로 Advice가 적용되는 Joinpoint    
 * 
 * AOP실습시 추가로 jar파일 필요 
 * non maven의 경우, maven의 경우
 * 추가할 jar 파일 
 * SecurityBean에러시 jar파일이 없는경우 
 * ㄴ non maven은 직접추가 
 * com.springsource.org,aspectj.weaver-1.6.8.RELEASE.jar추가해야        
 * 
 * weaving : 공통과 핵심을 연결실행하는 과정으로 
 * 실행점에 따라 compile time , run time , load time        
 * 
 * AspectJ는 자바 AOP의 표준을 말하며 PARC에서 개발 
 * 1)aspect + 소스코드후 weaving하는 Compil Time Weaving(CTW)
 * 2)class파일이 JVM에 로드시까지 기다렸다  weaving하는 Load Time Weaving(LTW)
 * 3)spring AOP 에서 사용하는 방식 ( RTW:runtime Weaving) -proxy를 생성해서
 * 
 * maven 에서 aspectj 사용해보기 
 * pom.xml에 aspectjrt와 aspectjweaver추가가 필요하다 
 * aspectjrt : aspectj사용을 위해 asppectj runtime라이브러리가 필요
 * aspectjweaver : aspect의 정보를 바탕으로 aspect를 구성한 코드를 생성하는데 필요한 유틸리티 프로그램         
 * 
 * 아래 2개를 mvnrepository를 사용하여 add dependecy 한다
 * dependency>
 * groupId>org.aspectj</groupId>
 * artifactId>aspectjrt</artifactId>      
 * ㄴ Aspectj를 사용하여 프로그램을 실행하기위해
 * version>1.8.2</version>
 * </dependency>
 * dependency>
 * groupId>org.aspectj</groupId>
 * artifactId>aspectweaver</artifactId>      
 * ffㄴ 실행할때 클래스 로딩을 위해 
 * version>1.8.2</version>
 * </dependency>
 * 
 * ===============================================================
 * 
 * <Expression 3가지 속성> ==> weaver.jar파일이 필요함
 * (execution, within, bean)
 * ## execution : 기본
 * 형식 execution([public등 - 생략가능] return type [클래스명|메소드명] (parameter))
 * 
 * #expression = "excution(Double helloProcess.HelloProcess.cheori())"
 * ==> return type Double 인 HelloProcess의 cheori()메소드
 * 
 * #execution(Public void cheo*(..))
 * ==> return type이 void, cheo로 시작하는 메소드, parameter는 0개이상
 * 
 * #execution(*hello.hello1.*.*())
 * ==> hello.hello1패키지의 parameter 없는 모든 메소드들
 * 
 * ## Within : 메소드가 아닌 특정 클래스 타입에 속하는 메소드를 PointCut으로 설정
 *  
 *  # <aop:pointcut expression="within(helloProcess.HelloProcess)"
 *  -->HelloProcess클래스의 모든 객체들의 모든 메소드
 * 
 * #Within(helloProcess.*)
 * ==> helloProcess 아래의 모든 메소드들
 * 
 * #Within(hello1..*)
 * hello1아래 아래 패키지의 모든 메소드들
 * 
 * =================================================================================
 * DB 개요
 * jdbc, datasource(connection pool), jdbctemplate(spring db)
 * myBatis(직접적인 자바 + sql 스타일 배제, 분리해서 mapping으로 처리), Hibernate(객체와 db를 xml로 mapping)
 * 
 * DB 상세
 * JDBC
 * Java Database Connectivity
 * - DB에 SQL명령을 전달하고 그 수행결과를 받아오는 일을함
 * - connection con1
 * getConnection()... 등을 사용
 * 
 * datasource(connection pool)
 * #Connection Pool
 * - 미리 여러개의 Connection을 만들어 놓고 수행시키는 것
 * - db 와 연결하는 connection을 미리 생성하여 커넥션 창고인 connection pool에 저장해 둔 다음 
 *   연결이 필요한 프로그램이 pool에서 connection을 꺼내 사용한 다음 사용이 끝나면 다시 connection pool에 반환한다.
 *   
 * - connection을 요청에 따라 그때마다 매번 생성하는 것에 비해 커넥션을 미리 생성해 두무르 응답속도를 비교적 빠르다
 *   모든 요청자에 대하여 connection을 모두 생성해주는 형식은 사용자가 몰리면 overhead가 발생하지만
 *   connection pool은 poll에 만들어지는 connection의 max값을 미리 지정하므로 과부하를 줄일 수 있다.
 * 
 * Datasource
 * - ConnectionPool을 관리
 * - 이것때문에 ConnectionPool생성이나 드라이버 로딩등의 별도 작업이 필요없다.
 * 
 * * JDBCTemplate(spring db)
 * JdbcTemplate
 * - spring-jdbc....jar,spring-tx...jar파일필요
 * (참고) spring-tx...jar:configure build path에러나는 경우
 * 즉, DAO예외예러는 이 jar파일에 있으므로
 * 
 * - JdbcTemplate는 JDBC를 사용하여 DAO를 만드는데 이용이되는 표준기술(spring의 DB)
 * 
 * - PSA 기술 중의 하나이다
 * (POJO개발을 위한 대표적인 3가지 기술 - DI, AOP, PSA)
 * --PSA : Portable Service Abstractions(포터블 서비스 추상화)
 * 기술적인 변화나 환경의 변화가 발생해도 일관성을 유지하는 기술
 * (예) 원천적인 기술원리에는 상관없이 기술의 동작부분만을 사용하면 된다
 * 
 * - 반복되는 형태의 DB Connection의 작성 및 연결이 없다
 * (반복되는 code를 제거하기 위한 template class를 지원함)
 * 
 * 
 * - RowMapper interface를 사용한다
 * SQL실행 ==> ResultSet 종이박스
 * ==> RowMapper가 while(rs.next())일을 대신하여
 * list 자바객체로 전환하는 일을 담당한다
 * 
 * (참고) MyBatis에서는 RowMapper없이
 * SqlSesstion이 list 자바객체로 전환시키는 일을 한다.
 * 
 * ##Mybatis
 * - 자바 + DB (자바따로, sql따로)를 위한 프레임 워크
 * -자바객체와 sql을 매핑하는 방식 
 * -재사용성을 위해 자바와 sql언어를 분리함   (sql을 xml에서 별도 처리) 
 *    (참고 jsp 에서 <...http:// java.sun.
 *    	mybatis -->import ..iBatis
 * 
 * ##Hibernate
 * - JPA(Java Persistent API)를 구현한 프레임워크중 하나로
 * 객체와 DB Table을 xml파일로 mapping하는 자바기반의 ORM(Object Relationship Mapper)
 * (참고) c#-db연동 (Visual Studio)
 * - myBatis보다 조금더 간결한 코드
 * - DB가 변경된다 할지라도 SQL 스크립트를 변경하지 않아도 된다
 * - connection pool을 지원함
 * - select * from... 같은 CRUD SQL을 직접사용하기보다 AA테이블과 AA객체가 Mapping인경우 AA.findAll()사용하여 조회
 * - 잘모르고 사용하면 data에 문제가 발생할 가능성이 높다.
 * 
 * [						]
 * 
 * (참고) iBATIS ==> MyBatis 로 변경후  달라진것
 * - apache project team ==> google code team으로
 * - 2.5 version 부터 MyBatis
 * - dtd(Document Type Definition : xml의 구조를 정의한것)==http://mybatis.org/dtd/mybatis-3-mapper.dtd
 * - jdk 1.5이상
 * - #id# ==> #{id} (jdbc에서는 ?역할)
 * - parameterMap ==> parameterType
 * - com.iBATIS... ==> org.apche.ibatis
 * - sqlMap ==> Mapper
 * - sqlMapConfig ==> Configration
 * - resultClass ==> resultType
 * - sqlSessionFactory, sqlSessionTemplate 설정
 * - 네임스페이스 <mapper namespace="패키지.매퍼">
 * 
 * mybatis포함 구조도
 * mybatis - DAO - Service - Controller - (model) - view - 결과나옴
 * 			(SessionTemplate)
 * 
 * jdbc vs mybatis
 * jdbc = java(with) sql
 * mybatis = java(.java) - (mapping) - sql(xml에 수록)
 * 
 * MyBatis 작성하는 두가지 방법
 * 1) 스프링에서 sqlSession 직접사용
 * 2) 스프링에서 interface만들고 사용(getMapper)
 * (3.0부터 sqlSession 직접사용보다 안정적)
 * spring boot : xml x, 자동설정
 * 
 * ######## MyBatis return 값 비교
        select : 해당결과
        insert : 1
        update : update 처리된 행수
        delete : delete 처리된 행수

        (참고) iBATIS
        select : 해당결과
        insert : null
        update : 1
        delete : deletee 처리된 행수
        (비교) oracle로 자바를 작성해도 java.sun이 보이는 경우와 같다.
 * 
 * <참고> 톰캣 에러 대처하기 2
 * 자식 컨테이너...spring-web 2번, .... 이런에러시
 * 1) jar파일 모두 지우고 다시 넣어본다
 * 2) web.xml에 display-name아래 absolute-ordering 넣어본다
 * 
 * <display-name>Spring myBatis</display-name>
 * <absolute-ordering />
 * 
 * mapper.xml 작성하려면
 * - help- eclipse marketplace - find 칸에 [ mybatipse ] 입력 - mybatipse 1.2.3 - install 누름
 * 
 * 그런다음 .xml을 만들 경우 우클릭 - other - mybatis폴더에서 mybatis xml mapper로 작성
 * (참고) 만일 eclipse marketplace 플러그인이 안되면
 * help - install new software - http://dl.bintray.com/harawata/eclipse/를 입력하여 플러그인
 * 
 * 참고) 간단하게 -config.xml도 이걸로 작성후 mapper부분을 수정해도 됨(필요시에만)
 * 이파일은 src에서 작성
 */
}
