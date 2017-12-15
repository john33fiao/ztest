package com.hb.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.hb.model.GuestDao;
import com.hb.model.entity.GuestVo;

public class ListController implements MyController{

	@Override
	public String execute(HttpServletRequest req) {
		GuestDao dao = new GuestDao();
		try {
			List<GuestVo> list = dao.selectAll();
			req.setAttribute("alist", list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "list";
	}
	
}
