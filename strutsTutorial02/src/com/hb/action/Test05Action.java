package com.hb.action;

import com.opensymphony.xwork2.Action;

public class Test05Action implements Action {
	
	@Override
	public String execute() throws Exception {
		
		return this.SUCCESS;
	}
	
	public String action05() {
		
		return ERROR;
	}

}
