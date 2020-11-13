package Quiz;
/*
 * Date
 * 100일째 되는날 구하기
 */
import java.util.Date;

public class Q14_Date {
	public static void main(String[] args) {
		String[] yoil = {"일","월","화","수","목","금","토"};		// 요일배열
		Date d1 = new Date();									// 오늘 날짜
		d1.setDate(d1.getDate()+100-1);							// 100일째 되는날
		// d1의 Date를 set해준다.
		// 오늘날짜(getDate()+100일째 되는날 -1)
		
		String str1 = "오늘은 ";
		str1 += d1.getYear() + 1900 + "년이고, "; 	// 기준이 1900년
		str1 += d1.getMonth() + 1 + "월이고, ";	 	// 기준이 0부터 시작
		str1 += d1.getDate() + "일이며, ";
		str1 += yoil[d1.getDay()] + "요일이다.";	 	// 기준이 일요일

		//d1.getDay() = 0~6 요일
		//yoil[d1.getDay()] = 일~토 요일
		System.out.println(str1);
	}
}
