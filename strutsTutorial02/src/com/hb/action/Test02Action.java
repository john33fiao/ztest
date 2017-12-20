package com.hb.action;

import com.opensymphony.xwork2.Action;

public class Test02Action implements Action {

	@Override
	public String execute() throws Exception {
		
//		return "success";
//		return this.ERROR;
//		return this.INPUT;
//		return this.LOGIN;
//		return this.NONE;
		return this.SUCCESS;
	}

}
