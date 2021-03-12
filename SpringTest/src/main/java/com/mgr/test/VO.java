package com.mgr.test;

public class VO {
	private int score;
	private String irum;

	public VO(String irum, int score) {
		this.irum = irum;
		this.score = score;
	}

	/**
	 * @return the score
	 */
	public int getScore() {
		return score;
	}

	/**
	 * @param score the score to set
	 */
	public void setScore(int score) {
		this.score = score;
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
}
