package Logintable;

import java.util.Date;

public class LoginfoDTO {//DTO : Data Transfer Object  // VO : Value Object // DAO : Data Access Object
	//DTO(VO) - DAO (insert, delete, update, select) - DB
	private String id;
	private String password;
	private String name;
	private String tel;

	//ID
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	//D
	public String getD() {
		return password;
	}
	
	public void setD(String password) {
		this.password = password;
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

	public LoginfoDTO() {
	}

	public LoginfoDTO(String id, String password, String name, String tel) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.tel = tel;
	}

	public LoginfoDTO(String id2, String password2) {
		this.id = id2;
		this.password = password2;
	}

}
