package TelinfoDTO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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

		// 지금부터는 insert 작업 : 자바에서입력해서 to db
	}

	public boolean insert_nametel(int id, String name, String tel, String sDate) {
		String sql = "INSERT INTO TELTABLE"
				+ " VALUES (?,?,?,?)";

		try {
			ps1 = con.prepareStatement(sql);
			ps1.setInt(1, id);
			ps1.setString(2, name);
			ps1.setString(3, tel);
			int year = Integer.parseInt(sDate.substring(0, 4)) - 1900;
			int month = Integer.parseInt(sDate.substring(4, 6)) - 1;
			int day = Integer.parseInt(sDate.substring(6, 8));
			Date d1 = new Date(year, month, day);
			ps1.setDate(4, d1);
			ps1.executeUpdate();
		} catch (SQLException e) {
			System.out.println("insert Exception");
			return false;
		}
		return true;
	}

	public ArrayList<TelinfoDTO> getAllInfo() throws SQLException {
		// PreparedStatement ps1 = null;
		// ResultSet rs1 = null;

		ArrayList<TelinfoDTO> Tiarray1 = new ArrayList<TelinfoDTO>();

		String sql = "SELECT * FROM TELTABLE ORDER BY ID";

		ps1 = con.prepareStatement(sql);
		rs1 = ps1.executeQuery(sql);

		while (rs1.next()) {
			int id = rs1.getInt("id");
			String name = rs1.getString("name");
			String tel = rs1.getString("tel");
			Date d = rs1.getDate("d");

			TelinfoDTO tiDTO = new TelinfoDTO(id, name, tel, d);	// 객체 생성

			Tiarray1.add(tiDTO);	// 컬렉션에 객체 입력
		}

		return Tiarray1;
	}

	public boolean update_nametel(int id1, String name1, String tel1, String sDate1) {
		String sql = "UPDATE TELTABLE SET NAME = ?, TEL = ?, D = ? WHERE ID = ?";

		try{
			ps1=con.prepareStatement(sql);
			ps1.setString(1, name1);
			ps1.setString(2, tel1);
			ps1.setString(3, sDate1);
			ps1.setInt(4, id1);
			ps1.executeUpdate();///////////////
		}catch(SQLException e){
			System.out.println("update Exception~~~");
			return false;
		}
		return true;
	}

	public boolean delete_row(int id2) {
		String sql = "DELETE FROM TELTABLE WHERE ID = ?";
		try{
			ps1=con.prepareStatement(sql);
			ps1.setInt(1, id2);
			ps1.executeUpdate();//////////
		}catch(SQLException e){
			System.out.println("delete Exception~~~");
			return false;
		}
		return true;
	}
}