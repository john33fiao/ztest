package com.hb.action;

import com.hb.model.GuestDao;
import com.opensymphony.xwork2.ActionSupport;

public class AddAction extends ActionSupport {
	private String name;
	private int pay;

	public String getName() {
		return name;
	}
	public int getPay() {
		return pay;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}

	@Override
	public String execute() throws Exception {
		GuestDao dao = new GuestDao();
		dao.addOne(name, pay);
		return SUCCESS;
	}
	
	@Override
	public void validate() {
		System.out.println("검증 들어갑니다 짜라자자잔짜");
		name=name.trim();
		if(name==null || "".equals(name)) {
			addFieldError("nameErr", "이름을 입력하세요");
		}
		if(pay==0) {
			addFieldError("payErr", "금액을 입력하세요");
		}
		if(pay<0) {
			addFieldError("payErr", "0보다 커야합니다");
		}
	}
}
