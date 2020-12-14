package JDBC_CONNECT2;
// ?로 값 입력 받기.
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Connection_Test2 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con = null;// 접속 객체 con1선언
		Scanner in = new Scanner(System.in);
		Class.forName("oracle.jdbc.driver.OracleDriver");

		con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "hr", "hr");

		System.out.print("이름은(대문자) ");
		String str = in.next();
		
		String sql = "SELECT * FROM EMPLOYEES WHERE UPPER(FIRST_NAME) LIKE ?";

		PreparedStatement pst = con.prepareStatement(sql);
		pst.setString(1, "%" + str + "%");// 몇번째 물음표에 무얼넣을거냐?

		ResultSet rs2 = pst.executeQuery();

		while (rs2.next()) {
			int id = rs2.getInt("EMPLOYEE_ID");
			String fname = rs2.getString("FIRST_NAME");
			String h_date = rs2.getString("HIRE_DATE");
			String hire_date = h_date.substring(0, 10);
			System.out.println(rs2.getRow() + "\t" + id + "\t" + fname + "\t" + hire_date);// 출력문
		}
		con.close();
		System.out.println("접속끝");
	}
}