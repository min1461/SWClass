package JDBC_CONNECT3;
// ? 로 입력받기 테스트 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Connection_Test3 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con = null;// 접속 객체 con1선언
		Scanner in = new Scanner(System.in);
		Class.forName("oracle.jdbc.driver.OracleDriver");

		con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "hr", "hr");

		System.out.print("봉급 : ");
		int sal = in.nextInt();
		System.out.print("매니저아이디 : ");
		int mi = in.nextInt();

		String sql = "SELECT FIRST_NAME 이름, SALARY 봉급, MANAGER_ID 매니저아이디 FROM EMPLOYEES"
				+ " WHERE (SALARY >= ? OR MANAGER_ID >= ?) AND MANAGER_ID IS NOT NULL";

		PreparedStatement pst = con.prepareStatement(sql);
		pst.setInt(1, sal);// 몇번째 물음표에 무얼넣을거냐?
		pst.setInt(2, mi);// 몇번째 물음표에 무얼넣을거냐?

		ResultSet rs2 = pst.executeQuery();

		System.out.println("\t이름\t봉급\t매니저아이디");// 출력문
		while (rs2.next()) {
			String fname = rs2.getString("이름");
			String salary = rs2.getString("봉급");
			String manager_id = rs2.getString("매니저아이디");
			System.out.println(rs2.getRow() + "\t" + fname + "\t" + salary + "\t" + manager_id);// 출력문
		}
		con.close();
		System.out.println("접속끝");
	}
}