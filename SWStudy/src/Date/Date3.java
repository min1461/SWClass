package Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Date3 {
	public static void main(String[] args) {
		Date d3 = new Date();
		SimpleDateFormat sdf1 = new SimpleDateFormat();
		// HH는 24시간
		System.out.println(sdf1.format(d3));

		// 자바 날짜 TO Sql 날짜(import선언은 java.utill만 한다.)
		Date d4 = new Date(); //d4선언
		java.sql.Date s4 = new java.sql.Date(d4.getTime()); //d4를 받아서 년월일만(s4) 호출
		System.out.println(d4); //d4출력
		System.out.println(s4); //s4출력
		
		//Sql 날짜 TO 자바날짜
		Date d5 = new Date(d4.getTime());
		//rs1.getDate("hire_date").getTime();
		
		System.out.println(d5);
	}
}
