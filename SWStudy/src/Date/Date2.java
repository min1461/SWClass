package Date;
/*
 * Date
 * 살아온 날 구하기
 */
import java.util.Date;

public class Date2 {
	public static void main(String[] args) {
		String[] yoil = {"일","월","화","수","목","금","토"};		// 요일배열
		Date d1 = new Date();									// 오늘 날짜
		Date d100 = new Date(1000L);							// 1s = 1000ms     1000L:
//		System.out.println(d100); 								// 1970년 1월 1일 09시 00분 01초	-> 한국의 기준시간
//		System.out.println(d100.toLocaleString()); 				// 1970년 1월 1일 ampm 09시 00분 01초	-> 한국의 기준시간
//		System.out.println(d100.toGMTString()); 				// 1일 1월 1970년 00시 00분 01초	-> 영국의 천문대 기준시간
		
//		Date mybirthday = new Date(/*년,월,일,시,분,초*/); 1000으로나누면 1초->60으로 나누면 1분->60으로 나누면 1시간->24로 나누면 1일
		Date mybirthday = new Date(1991 - 1900, 11 - 1, 7);		// 1900년을 기준으로 91년 11월 7일이 되는날을 입력
		System.out.println(mybirthday.getTime()/86400000);		// 1970년을 기준으로 내가 태어난 시간
		System.out.println(d1.getTime()/86400000);				// 1970년을 기준으로 지금 시간
		System.out.println(d1.getTime()/86400000-mybirthday.getTime()/86400000);		// 살아온 시간
		
		
//		String str1 = "오늘은 ";
//		str1 += d1.getYear() + 1900 + "년이고, "; 	// 기준이 1900년
//		str1 += d1.getMonth() + 1 + "월이고, ";	 	// 기준이 0부터 시작
//		str1 += d1.getDate() + "일이며, ";
//		str1 += yoil[d1.getDay()] + "요일이다.";	 	// 기준이 일요일
//		System.out.println(str1);
		//d1.getDay() = 0~6 요일
		//yoil[d1.getDay()] = 일~토 요일
	}
}