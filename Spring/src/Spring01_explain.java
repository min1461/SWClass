
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
 */
}
