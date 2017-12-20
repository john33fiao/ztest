package com.hb.action;

import com.opensymphony.xwork2.Action;

public class Test03Action implements Action {

	private String msg;
	
	public String getMsg() {
		return msg;
	}

	@Override
	public String execute() throws Exception {
		
		msg = "스트러츠로 출력";
		
		return this.SUCCESS;
	}

}
