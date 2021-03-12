package helloProcess;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class SawonDAO {
	private ArrayList<Object> alist1;
	private JdbcTemplate jt1;

	/**
	 * @return the jt1
	 */
	public JdbcTemplate getJdbcTemplate() {
		return jt1;
	}

	/**
	 * @param jt1 the jt1 to set
	 */
	public void setJdbcTemplate(JdbcTemplate jt1) {
		this.jt1 = jt1;
	}

	public ArrayList<Object> getAlist1() {
		return alist1;
	}

	public void setAlist1(ArrayList<Object> alist1) {
		this.alist1 = alist1;
	}

	public ArrayList<Object> selectALL() {
		StringBuffer sb1 = new StringBuffer();//문자열의 변화가 많을때 씀
		sb1.append("select name, tel from TelTable");

		alist1 = (ArrayList<Object>) getJdbcTemplate().query(sb1.toString(), new RowMapper<Object>() {
			public Object mapRow(ResultSet rs1, int joolBun1) throws SQLException {
				SawonVO sv1 = new SawonVO();
				System.out.println("줄번호 = " + joolBun1);//0,1.....
				sv1.setName(rs1.getString("name"));
				sv1.setTel(rs1.getString("tel"));
				return sv1;
			}
		});
		System.out.println("자료의 총개수는 " + kajaSoo());
		return alist1;
	}

	public int kajaSoo() {
		int soo = jt1.queryForObject("select count(name) from TelTable", Integer.class);
		//결과가 한줄로 나온다.
		return soo;
	}

}
