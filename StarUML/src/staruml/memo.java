package staruml;

/*
 * ######UML ######
 * 소 단위와 비교하여 말한다면 프로그램의 전체적인 flowchart
 * - Unified Modeling Language(통합 모델링 언어)
 * - 분석 및 설계시 개발자간 원할한 의사소통을 위한 통합 모델링 언어
 * 
 * ######UML Diagram(총 15개 정도) = 대형프로젝트에는 반드시 필요하다.
 * - structure Diagram(구조다이어그램)
 * (예) class Diagram , Object Diagram(객체정보를 시각적으로),
 * Component(컴포넌트구조), Deployement(네트워크, 하드웨어등 시스템의 물리적구조),
 * Composite structure Diagram(클래스와 컴포넌트구조) 등 7개
 * 
 * - Behavior Diagram(행위다이어그램)
 * (예) Use Case Diagram(사용자의 관점에서 시스템의 행동을 그림),
 * Sequence Diagram(시간의 흐름에 따른 행위)
 * Activity Diagram(업무처리과정)....등 8개
 * 
 * Class Diagram , Use Case Diagram, Sequence Diagram ==> 3가지 실습할 것
 * 
 * ######UML, UML TOOL에 대하여
 * (참고) agora plastic ==> staruml5.0(GPL)-무료
 * 			델파이,윈도우용
 * 	Rational사 rose
 * 	ms visio
 * =============================
 * - staruml은 UML TOOL
 * - reverse engineer(이프로그램을 )도 잘 된다(영어를 기계어로 : 어셈블/기계어를 영어로 : 역어셈블)
 * - .NET도 처리 (C# 1997년에 beta판 vb.net <--- vb을 advanced
 * - 약 11개이상의 Diagram
 * 
 * # 분석, 설계를 위한 개발전 흐름도(UML)
 * 		자바 상용 : Rational rose
 * 		ms : visio
 * ==========================================
 * starUML 다운로드
 * https:// sourceforge.net/projects/staruml/files/latest/download
 * https://sourceforge.net/projects/staruml/files/staruml/5.0/staruml-5.0-with-cm.exe/download
 * ==>staruml-5.0-with-cm.exe
 * 
 * 시작시
 * Default Approach 선택
 * (새로 작업시 file-new-Default Approach 선택)
 * 
 * #####################일반적으로 diagram 만드는법
 * model을 먼저 고른다 - add diagram - 원하는 diagram을 선택한다 --> 필요시 이름도 변경한다.
 * (만약 이름변경시 한글이 문제되면 아래 properties창에서 수정)
 * 
 * 즉, 우측에서 model explorer 탭을 찾는다 ( 만일 안보이면 우측에서 화살표를 찾아 누르면 나타남)
 * 그런다음 usecase model에서 - 마우스 우클릭 - add diagram - use case diagram하면
 * - use case diagram1 탭이 생기고 해당 탭을 누른후 우측 아래 properties 창에서 이름변경이 된다
 * 왼쪽에 '졸라맨'같은 관련 그림이 뜸 - 작업시작
 * (만일 나중에 탭 이름 변경하려면 탭을 클릭한 후 우측 아래 properties 에서 이름변경하면 된다)
 * 
 * <참고> 물론 전에 만든 diagram을 열려면 우측 diagram explorer 탭을 클릭하여
 * 해당 diagram을 찾아가 해당 내용을 클릭하여 open한다
 * 
 * actor
 * 시스템외부에서 시스템을 바라보는 사람 or 다른 시스템
 * 1) primary actor : 주로 시스템의 좌측에 그려주며 시스템의 주사용자 개념으로 시스템 사용으로 효과를 얻는사람
 * 예) 회원가입시 가입하는 사람
 * 
 * 2) Secondary actor : 주로 시스템의 우측에 그려주며 주로 다른 시스템을 의미하며 primary actor를 보조해주는 시스템
 * 예) 회원가입시 14세 이상의 나이임을 인증해주는 시스템
 * 홍길동________ 회원가입 _______ <<actor>>나이인증시스템
 * 이도령________ 회원가입 _______ <<actor>>나이인증시스템
 * 
 * (참고) ≪ ≫ 기호
 * 확장기호로 길러멧(guillemet) 이라고 하며 키보드로 입력하는 << 보다는 작음
 * 
 * secondary actor 일때 <<actor>> stereo type을 기록하기
 * 방법은 window builder 처럼 properties를 사용한다
 * 이때 properties의 stereo type에서 한다
 * 마우스를 해당 use case에 놓고 시작하고 stereo type에서 actor를 고르는데 없으면 직접 actor를 입력한 후 OK
 * 
 * usecase Diagram에서 선그리기
 * association(연관)
 * 대등한 일반연결로 둘 사이에 "상호작용"이 있음을 의미
 * 표시는 ────────────실선으로 그림
 * 예) 회원 - 삽입, 삭제 등
 * 
 * - 포함(<<include>>관계)
 * 많은 유스케이스(검색,수정)가 "공통으로", "반드시 수행하는" 포함 관계
 * 예)								<<include>>
 * 회원가입 유스케이스 --------------------> 나이인증시스템
 * 즉, 이경우 왼쪽 실행을 위해 오른쪽이 반드시 실행되어야 하므로 왼쪽은 오른쪽을 포함하고 화살표는 포함하는 쪽에서 포함되는쪽으로 그림
 * (선은 점선 + >)
 * (easy해석) 저거 꼭 해야되 하는 쪽으로 점선 화살표가 그려지면 됨
 * 
 * 문제2- 만화카페에서 카페회원이 검색 및 게시판에 내용을 입력 그리고 이벤트 가입시 만화카페 시스템은 회원여부를 위해 인증시스템을 사용한다.
 * 이에 대한 use case diagram을 작성하시오.(반드시 포함 및 secondary actor를 적용)
 * 단, 비회원일 경우 검색만 가능하며 이때는 14세 나이 인증시스템을 사용한다.
 * 
 * - 확장(<<extend>> 관계)
 * 특별한 경우에 확장되어 진행되는 관계
 * 				<<extend>>
 * 회원가입 <--------------------- 자신의캐리커처 넣기
 * : 회원가입하다 캐리커처를 "선택적으로" 넣는 경우도 있다
 * (이때 화살표는 확장 대상쪽으로 그린다. 즉, 캐리커쳐를 넣을 수도 안넣을 수도 있으므로 캐리커쳐에서 출발하여 그린다)
 * (참고) extend와 비교하여 include의 화살표 방향을 잘 보시오
 * 				<<include>>
 * 회원수정작업 ----------------------->로그인
 * (반드시 해야되는 포함되는 쪽에서 포함하는 쪽으로 화살표)
 * 
 * - Generalization(일반화) (실선+빈삼각형 관계)
 * 보다 상세한 내용이 필요한 경우 상세한 것에서부터 실선 + 빈삼각형을 그려 자세하게 표현한다
 * 예) 기계가 아닌 사람이 로그인 할 경우 사람에 대한 "상세" 표현하기
 * 로그인 _________사람
 * 				△   △
 * 				│  │
 * 				남   여
 * 
 * 이때 "사람"과 "남","사람"과"여"는 상세적으로 표현한 일반화 관계 이때 남녀 모두 사람이므로 사람방향으로 실선+빈삼각형
 * 
 * 
 * ##################### class Diagram
 * 클래스, 인터페이스간의 상속등의 연관을 그린 다이어그램
 * (Design model-마우스우클릭-class Diagram)
 * 참고로 실수로 잘못만든것 삭제는 오른쪽 model explorer- 우클릭 delete from Model 등을 사용하여 삭제하면 된다.
 * (참고) 클래스를 연속으로 누르는등 "잠금기호"가 나타나면 조금 위 "select"를 누르면 "잠금기호"가 사라진다.
 * 
 * ### 접근지정자(access modifier)설정법
 * #. 나오는것을 고르면 된다
 * - public 	: +
 * - private 	: -
 * - protected	: #
 * - package	: ~(default)
 * 
 * ### 필드, 메소드 추가방법
 * - 우클릭 - add
 * 			└attribute(속성)
 * 			└operation(메소드)
 * 
 * Generate Code 만들기(Diagram to code)
 * 문제점은 역 assemble : 영어 -> 기계어 x, 반대로 하는 것
 * (방법1)
 * class-마우스 우클릭 - Java - Generate Code
 * (이떄 만일 자바프로필 에러시 마우스 우클릭 - Java - Reverse Engineering으로 들어간후 - 일단 예 - 이어서 취소하고 나온 후
 * 다시 마우스 우클릭 - Java -Generate Code 하면 됨 - design mode - 원하는 class선택 후 - 만들어질 위치 선택(바탕화면등)
 * - 바탕화면에서 SawonVO.java를 열어본다
 * 
 * ##### reverse engineering(code to diagram)
 * staruml의 class diagram 빈공간 중간에 마우스 놓고 - 마오 - reverse engineering(자바) - 이클립스 소스코드 선택 - next - design model - next - run
 * 그러면  starUML에 class diagram을 만든다
 * ㅌ
 * (참조) 연관선 그리기
 * - 먼저 association으로 두 클래스에 선을 연결한후
 * - 선 한쪽 끝을 마우스 더블클릭
 * - private 선택후 연관된 필드와 관계를 입력 및 선택함
 *   예) -department_id		1..*
 * - 다른 선 한쪽도 마저 수행
 *   예) -department_id
 * - 선 가운데 더블클릭
 *   관계표현을 위해 "참조한다"를 입력
 * 
 * - generalization (일반화)
 * use case diagram에서는 상세설명 (실선+빈삼각형)
 * class diagram에서는 상세 및 구체적이 아닌 "상속"임
 * 
 * Animal이 추상클래스가 되므로 (추상메소드가 있어서) 만들때 추상 클래스에 대한 표시를 넣어주어야 한다
 * 표시는 클래스에 추상표시만 해주면 된다
 * 그렇다면 그표시는 ???????
 * <<abstract>>
 * 그리고 아래 move()는 추상메서드 이므로 "이탤릭체" 이어야 한다
 * 방법은 uml툴 우측 model explorer 에서 해당 move()를 선택하여 
 * 아래 properties에서 isAbstract 체크박스에 체크하면 됨
 * Animal
 * +움직인다()(추상메소드)
 * 
 * 상속받는 클래스
 * fish			bird			dog
 * +움직인다()		+움직인다()		+움직인다()
 * 움직인다를 상속받는
 * 여기서 구현
 * 
 * ######## 추상클래스 그림에 추가로 interface 만들기 
 * (hint) StereoType 
 * 클래스 형식으롤 만든후 properties에서 stereo type에 interface를 넣으면 '
 * 길러멧 <<interface>>가 위에 붙는다 
 *       
 * interface메서드 선언 부분을 구현 해주는것 (overriding)은 
 * 예) mukja()
 *       
 * -Realization(실체화)
 * 점선,빈 삼각형 (실체화)
 * <<interface>>+점선 , 빈삼각형(실체화)사용하여 둘사이의 관계표현
 * or
 * 원래의 원모양 interface + 실선ㄴ
 *       
 *       
 * ######## sequence diagram
 * 시간의 흐름에따라 표기하는 diagram
 * actor나 객체가 메시지의 순서에 따라 처리및 진행함 
 * 
 * 예 ) 세탁기
 * 전원 -세탁선택 -헹굼 -불김 - 건조 -완료
 * 채팅
 * 클라이언트 - 서버 - 다른클라이언트 
 *          
 * -model explorer창에서 
 * use case model - 우클릭 - add diagram - sequence diagram
 * (참고 필요시 model explorer창과 diagram explorer창 교대로 선택 )
 * -좌측에서 object선택 - client 
 * =>이떄 보이는수직 점선으 lifeline임
 * -stimulus 사용하여 직선 화살표 그림 
 * =>이 직선 화살표선은 "메세지"선 
 * =>수직선의 박스는 actication box로 메소드 종료를 기다리는 것 
 * (선 종류는 우측 property의 actionkind에서 조절 )
 * 예 리턴은 점선으로  
 * 
 * - sequence Diagram에서 "actor" 넣기
 * * 먼저 usecase Diagram을 만들고 actor를 넣는다
 * 예) 은행고객 이라고 한다
 * * Object를 만들고 (이때 object 글씨는일단 지우고)
 * - Properties-Classifier에서 해당 actor를 선택
 * 그러면 은행고객 actor가 만들어진다
 * 
 * 1. 현행 시스템 파악의 정의 및 목적
 * 	(1) 현행 시스템 파악의 정의
 * 		현행 시스템의 어떤 하위 시스템으로 구성되어 있는지, 제공하는 기능은 무엇인지, 다른 시스템들과 어떤 정보를 주고받는지, 
 * 		어떤 기술요소를 사용하고 있는지, 사용하고 있는 소프트웨어 및 하드웨어는 무엇인지, 네트워크는 어떻게 구성되어 있는지 등을
 * 		파악하는 활동이다
 * 	(2) 현행 시스템 파악의 목적
 * 		이를 통하여 향후 개발하고자 하는 시스템의 개발범위 및 이행방향성 설정에 도움을 주는것이 목적이다.
 *  (3) 현행 시스템 파악 절차
 *  	아래와 같이 3단계로 구분하여 수행해야 할 활동들에 대하여 기술한다
 * 		1단계 - 현행 시스템의 구성, 기능, 인터페이스 현황을 파악하는 단계
 * 		2단계 - 현행 시스템의 아키텍처 및 소프트웨어 구성 현황을 파악하는 단계
 * 		3단계 - 현행 시스템의 하드웨어 및 네트워크 구성 현황을 파악하는 단계
 * 
 * ###### 시스템 개발주기(SDLC : system development life cycle)
 * - 계획 : planning
 * 		예비조사, 비용등을 생각
 * 		예) 마당에 그네를 설치하기
 * - 분석 : analysis
 * 		요구사항을 정확히 아는 단계
 * 		예) 미리 그네의 설치위치 및 그네 끈의 길이등을 종이에 그려봄
 * - 설계 : design
 * 		여기가 중요한 부분
 * 		예) 완벽한 준비를 위해 땅을 파는 깊이를 알아내고 안전을 위해 그네줄의 굵기까지 알아내고 필요한 재료에대한 명세가 다 나와야 함
 * - 구현 : implementation
 * 		서버구축, db설계, 프로그램 작성
 * 		예) 준비된 설계또와 재료대로 땅을 파고 그네를 설치
 * - 운영 및 지원(operation and support)
 */