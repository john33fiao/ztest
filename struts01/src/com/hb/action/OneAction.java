package com.hb.action;

import com.hb.model.GuestDao;
import com.hb.model.entity.GuestVo;
import com.opensymphony.xwork2.Action;

public class OneAction implements Action {

	private int idx;
	private GuestVo bean;
	
	public void setIdx(int idx) {
		this.idx = idx;
	}
	
	public GuestVo getBean() {
		return bean;
	}
	
	@Override
	public String execute() throws Exception {
		GuestDao dao = new GuestDao();
		bean =dao.selectOne(idx);
		
		return SUCCESS;
	}

}
