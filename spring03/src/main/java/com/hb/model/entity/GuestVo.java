package com.hb.model.entity;

import java.sql.Timestamp;

public class GuestVo {
	private int sabun;
	private String name;
	private Timestamp nalja;
	private int pay;

	public int getSabun() {
		return sabun;
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

	public Timestamp getNalja() {
		return nalja;
	}

	public void setNalja(Timestamp nalja) {
		this.nalja = nalja;
	}

	public int getPay() {
		return pay;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}

	public GuestVo(int sabun, String name, Timestamp nalja, int pay) {
		super();
		this.sabun = sabun;
		this.name = name;
		this.nalja = nalja;
		this.pay = pay;
	}

	public GuestVo() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "GuestVo [sabun=" + sabun + ", name=" + name + ", nalja=" + nalja + ", pay=" + pay + ", getSabun()="
				+ getSabun() + ", getName()=" + getName() + ", getNalja()=" + getNalja() + ", getPay()=" + getPay()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
