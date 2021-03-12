package dao;///////////////

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import dbconn.TelInfoDBConn;
import vo.TelInfoVO;

 
@Repository
public class TelInfoDAO {
	
	private Connection con;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	//SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
	
	public TelInfoDAO() 
			throws ClassNotFoundException, SQLException {
		con = new TelInfoDBConn().getConnection();
	}
	
	public void pstmtClose() throws SQLException {
		if(pstmt != null) {
			pstmt.close();
		}
	}
	
	
	public void getAllInfoClose() throws SQLException {
		if(rs != null) {
			rs.close();
		}
		if(pstmt != null) {
			pstmt.close();
		}
		if(con != null) {
			con.close();
		}
	}
	
	
	
	
	public ArrayList <TelInfoVO> getAllTelinfo(TelInfoVO vo1) 
			                               throws SQLException{
	ArrayList<TelInfoVO> tiarray = new ArrayList<TelInfoVO>();
	String sql = "SELECT * FROM TelTable55 ORDER BY id";
		
		pstmt = con.prepareStatement(sql);
		rs = pstmt.executeQuery();
		while(rs.next()) {
			TelInfoVO telinfo=new TelInfoVO();
			telinfo.setId(rs.getInt("id"));//���� ���⼭ ��ü ������  ���±��� 
			telinfo.setName(rs.getString("name"));
			telinfo.setTel(rs.getString("tel"));
		    
			tiarray.add(telinfo);//�׷����� ArrayList�� ���� 
			
		}
		return tiarray;
	}
		
	
	
	              //getAllTelinfo �� ��ü��� 
	public TelInfoVO getTelinfo(TelInfoVO vo1) //���޵� ��ü���� 
			           throws SQLException { //getTelinfo �� �Ѹ�ó�� 
		TelInfoVO telinfo = null;
		String sql = "select * from teltable55 where name = ?";
		pstmt = con.prepareStatement(sql);
		pstmt.setString(1, vo1.getName());//�˻� 
		rs = pstmt.executeQuery();
		if(rs.next()) {
			telinfo=new TelInfoVO();//////////////
			telinfo.setId(rs.getInt("id"));
			telinfo.setName(rs.getString("name"));
			telinfo.setTel(rs.getString("tel"));
		}
		
		return telinfo;//��ü���� 
	}
	
	
	
/*	public boolean update_nametel(String tel2, String name2) throws SQLException {
	
		String sql ="update TelTable5 set tel=? where name=?";
		
		pstmt = con.prepareStatement(sql);
		pstmt.setString(1, tel2);
		pstmt.setString(2, name2);
		pstmt.executeUpdate();
		
		return true;
	}*/
	
	public void updateTelinfo(TelInfoVO vo1) //������ ��ü���� 
			throws SQLException,ClassNotFoundException {

 String sql ="update TelTable55 set id=?, tel=? where name=?";
		pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, vo1.getId()); //�̰ɷ� id=? �� �ִ´� 
		pstmt.setString(2, vo1.getTel());
		pstmt.setString(3, vo1.getName());
		
		pstmt.executeUpdate();
	}
	
	public void insertTelinfo(TelInfoVO vo1)  throws SQLException {
		String sql = "INSERT into TelTable55 values(?,?,?)";
			
		pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, vo1.getId());
		pstmt.setString(2,vo1.getName());
		pstmt.setString(3, vo1.getTel());
		
		pstmt.executeUpdate();
	}	
	
	public void deleteTelinfo(TelInfoVO vo1) throws SQLException {
		String sql = "DELETE TelTable55 WHERE name = ?";
		
		pstmt = con.prepareStatement(sql);
		pstmt.setString(1, vo1.getName());
		pstmt.executeUpdate();
	
	}
}












