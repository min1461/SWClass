package JDBC_CONNECT1;
//쿼리문동작
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Connection_Test1 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con1 = null;// 접속 객체 con1선언
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		con1 = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe","hr","hr");
												// SID ,					USER_NAME, PASSWORD
//		System.out.println("접속완료");
		// StringBuilder sb1 = new StringBuilder();
		// sb1.append("select * ");
		// sb1.append("from employees");
		System.out.println("스캐너 동작");
		Scanner in = new Scanner(System.in);
		System.out.print("이름이뭐에요? : ");
		String str = in.next();// NANCY
		
		String sql2 = "SELECT * FROM EMPLOYEES" // 여기까지는 SQL 문장은 맞지만 역할은 하지 못함
				// +" WHERE DEPARTMENT_ID = 30"; // 줄을 바꾸면 한칸띄고 쓰기
				+ " WHERE UPPER(FIRST_NAME) = '" + str + "'";
		Statement st2 = con1.createStatement(); // 문장을 만들자.
		// import시 beans가 아닌 sql로 할것
		// 접속객체 con1 문장객체 st2
		// 연동 2가지 방법
		// createStatement
		ResultSet rs2 = st2.executeQuery(sql2); // 107개 줄이 조회되고 rs2라는 종이박스에 넣는다.
		
		while (rs2.next()) {
			int id = rs2.getInt("EMPLOYEE_ID"); // 100
			// int id = rs2.getInt(1); //객체,메소드
			String fname = rs2.getString("FIRST_NAME");// Steven
			// String fname = rs2.getString(2); //객체,메소드
			String h_date = rs2.getString("HIRE_DATE");
			// String h_date = rs2.getString(3); //객체,메소드
			String hire_date = h_date.substring(0, 10);// 날짜만 출력하기 위함 (시간도 나오므로!)
			// ** substring 전에 sql의 session을 확인해서 출력방식을 미리 확인할것
			System.out.println(rs2.getRow() + "\t" + id + "\t" + fname + "\t" + hire_date);// 출력문
		}
		con1.close();
		System.out.println("접속끝");
	}
}