package com.hb.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.hb.core.Controller;
import com.hb.model.entity.GuestDao;
import com.hb.model.entity.GuestDto;

public class ListController implements Controller {
	
	// list.do
	
	public String execute(HttpServletRequest req) {
		System.out.println("ListController run...");
		GuestDao dao = new GuestDao();
		List<GuestDto> list = dao.selectAll();

		req.setAttribute("alist", list);

		return "list";
	}
}
