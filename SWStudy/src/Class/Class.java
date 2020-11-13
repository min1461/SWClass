package Class;

import java.util.Date;

/*
 * 1) 사용자 정의 클래스 (User defined class)
 * [ 설계(정의) - 제작(new,생성) - 사용 ] 3단계
 * 
 * 2) 내장클래스
 * Scanner, System, Date, Object
 * 
 * import 선택시
 * java.sql.Date,java.util.Date
 * (참고) System 클래스 : java.lang 인데 사용 안함.
 * 
 * import 패키지명.클래스명
 * 예) import java. util.Date
 */
public class Class {
	public static void main(String[] args) {
		//Date가 이미 내장클래스에 ★설계(정의)되어있음.
		
		//객체 ★제작(new, 생성)
		Date d1 = new Date();
		
		//객체 ★사용1
		//d1의 오버라이딩된 toString()메서드가 출력.
		System.out.println(d1);		// 요일 월 일 시간 기준 년도

		//객체 ★사용2
		//취소선 - 만든지 오래된 메서드
		System.out.println(d1.toLocaleString());	// 년도 월 일 ampm 시간 분 초
		
		/*
		 * 자바 스크립트에서도!
		 * window.location = "http://www.naver.com"
		 *   객체  .	속성	   =			값
		 */
	}
}
