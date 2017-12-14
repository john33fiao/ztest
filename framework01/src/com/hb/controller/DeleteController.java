package com.hb.controller;

import javax.servlet.http.HttpServletRequest;

import com.hb.core.Controller;
import com.hb.model.entity.GuestDao;

public class DeleteController implements Controller {

	@Override
	public String execute(HttpServletRequest req) {
		String idx = req.getParameter("idx");
		int sabun = Integer.parseInt(idx);
		GuestDao dao = new GuestDao();
		dao.deleteOne(sabun);
		
		return "redirect:list.do";
	}

}
