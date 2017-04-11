package com.range.mapping;

import java.io.Serializable;

public class Address implements Serializable {
	private int aid;
	private String dno;
	private String StreetName;

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getDno() {
		return dno;
	}

	public void setDno(String dno) {
		this.dno = dno;
	}

	public String getStreetName() {
		return StreetName;
	}

	public void setStreetName(String streetName) {
		StreetName = streetName;
	}

	@Override
	public String toString() {
		return "Address [aid=" + aid + ", dno=" + dno + ", StreetName=" + StreetName + "]";
	}

}
