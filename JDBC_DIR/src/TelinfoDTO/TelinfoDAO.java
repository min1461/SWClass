package TelinfoDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TelinfoDAO {
	private Connection con;
	PreparedStatement ps1 = null;
	ResultSet rs1 = null;

	public TelinfoDAO() throws ClassNotFoundException, SQLException { // 생성자, 특징 : 제일 먼저 수행되는 것
		con = new TelinfoDBConn().getCon();
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
		
		//지금부터는 insert 작업 : 자바에서입력해서 to db
	}

	public boolean insert_nametel(int id, String name, String tel, String sDate) {

		return false;
	}
}
