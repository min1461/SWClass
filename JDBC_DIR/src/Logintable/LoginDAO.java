package Logintable;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDAO {
	private Connection con;
	PreparedStatement ps1 = null;
	ResultSet rs1 = null;

	public LoginDAO() throws ClassNotFoundException, SQLException { // 생성자, 특징 : 제일 먼저 수행되는 것
		con = new LoginDAOconn().getCon();
	}

	public void ps1Close() throws SQLException {
		if (ps1 != null) {
			ps1.close();
		}
	}

	public void getAllInfoClose() throws SQLException {
		if (rs1 != null) {
			rs1.close();
		}
		if (ps1 != null) {
			ps1.close();
		}
		if (con != null) {
			con.close();
		}

		// 지금부터는 insert 작업 : 자바에서입력해서 to db
	}

	public boolean signDAO(String id, String password, String name, String tel) {
		String sql = "INSERT INTO LOGINTABLE VALUES (?,?,?,?)";

		try {
			ps1 = con.prepareStatement(sql);
			ps1.setString(1, id);
			ps1.setString(2, password);
			ps1.setString(3, name);
			ps1.setString(4, tel);
			ps1.executeUpdate();
		} catch (SQLException e) {
			System.out.println("insert Exception");
			return false;
		}
		return true;
	}

	public boolean LoginDAO(String id2, String password2) throws SQLException {
		// PreparedStatement ps1 = null;
		// ResultSet rs1 = null;

		String sql = "SELECT COUNT(*) FROM LOGINTABLE WHERE ID = ? AND PW = ?";

		ps1 = con.prepareStatement(sql);

		ps1.setString(1, id2);
		ps1.setString(2, password2);

		rs1 = ps1.executeQuery();
		rs1.next();
		if (rs1.getInt(1) == 0) {
			return false;
		} else {
			return true;
		}
	}
}