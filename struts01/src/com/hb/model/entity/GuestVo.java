package com.hb.model.entity;

import java.sql.Date;

public class GuestVo {
	private int sabun;
	private String name;
	private Date nalja;
	private int pay;

	public int getSabun() {
		return sabun;
	}

	public GuestVo() {
		
	}

	@Override
	public String toString() {
		return "GuestVo [sabun=" + sabun + ", name=" + name + ", nalja=" + nalja + ", pay=" + pay + ", getSabun()="
				+ getSabun() + ", getName()=" + getName() + ", getNalja()=" + getNalja() + ", getPay()=" + getPay()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	public void setSabun(int sabun) {
		this.sabun = sabun;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getNalja() {
		return nalja;
	}

	public void setNalja(Date nalja) {
		this.nalja = nalja;
	}

	public int getPay() {
		return pay;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}
}
