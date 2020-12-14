package TELTABLE;

// insert query
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class TelTable {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con = null;// 접속 객체 con1선언
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "hr", "hr");

		String sql = "INSERT INTO TELTABLE VALUES(?,?,?,?)";
		PreparedStatement pst = con.prepareStatement(sql);

		int id = Integer.parseInt(JOptionPane.showInputDialog("아이디는 ? "));
		String name = JOptionPane.showInputDialog("이름은 ? ");
		String tel = JOptionPane.showInputDialog("전화번호는 ? ");
		String hire_date = JOptionPane.showInputDialog("입사일은 ? ");

		pst.setInt(1, id);
		pst.setString(2, name);
		pst.setString(3, tel);
		pst.setString(4, hire_date);

		// 삽입한 행수
		int rowcnt = pst.executeUpdate();
		// dml : insert,update, delete

		System.out.println(rowcnt + "행 insert 했음");
		con.close();
		System.out.println("접속 끝");
		ResultSet rs2 = pst.executeQuery();
	}
}