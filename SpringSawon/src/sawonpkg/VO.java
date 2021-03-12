package sawonpkg;

public class VO {
	private int id;
	private String irum;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the irum
	 */
	public String getIrum() {
		return irum;
	}

	/**
	 * @param irum the irum to set
	 */
	public void setIrum(String irum) {
		this.irum = irum;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "사원의 id는" + id + ", 사원이름은" + irum + "이라는~~~";
	}
}
