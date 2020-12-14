package JDBC;
// 접속
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection_Test {
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		Connection con1 = null;//접속 객체 con1선언
		Class.forName("oracle.jdbc.driver.OracleDriver");//Driver 로딩
		//대소문자, 띄어쓰기 // static메서드 (new없이 사용)
		
		//DB접속
		con1 = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe","hr","hr");
												// SID ,					USER_NAME, PASSWORD
		System.out.println("접속완료");
	}
}