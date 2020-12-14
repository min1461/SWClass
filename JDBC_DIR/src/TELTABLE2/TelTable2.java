package TELTABLE2;

// insert query
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JOptionPane;

public class TelTable2 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con = null;// 접속 객체 con1선언
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "hr", "hr");

		String sql = "INSERT INTO TELTABLE VALUES(?,?,?,to_date(?,'yyyy/mm/dd hh24:mi:ss'))";
		// 오라클에서 24시는 hh24 분은 mi로 쓴다.
		PreparedStatement pst = con.prepareStatement(sql);

		int id = Integer.parseInt(JOptionPane.showInputDialog("아이디는 ? "));
		String name = JOptionPane.showInputDialog("이름은 ? ");
		String tel = JOptionPane.showInputDialog("전화번호는 ? ");

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd kk:mm:ss"); //형식 준비 //kk : 24시간
		String sDate = sdf.format(Calendar.getInstance().getTime());//형식 대입
//		or
//		String sDate = sdf.format(new Date());//형식 대입
		
		pst.setInt(1, id);
		pst.setString(2, name);
		pst.setString(3, tel);
		pst.setString(4, sDate);
		
		// 삽입한 행수
		int rowcnt = pst.executeUpdate();
		// dml : insert,update, delete

		System.out.println(rowcnt + "행 insert 했음");
		con.close();
		System.out.println("접속 끝");
		ResultSet rs2 = pst.executeQuery();
	}
}