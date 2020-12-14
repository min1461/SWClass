package TelinfoDTO;

import java.util.Date;

public class TelinfoDTO {//DTO : Data Transfer Object  // VO : Value Object // DAO : Data Access Object
	//DTO(VO) - DAO (insert, delete, update, select) - DB
	private int id;
	private String name;
	private String tel;
	private Date d;

	//ID
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	//NAME
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//TEL
	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	//D
	public Date getD() {
		return d;
	}

	public void setD(Date d) {
		this.d = d;
	}

	public TelinfoDTO() {
	}

	public TelinfoDTO(int id, String name, String tel, Date d) {
		this.id = id;
		this.name = name;
		this.tel = tel;
		this.d = d;
	}

}
