package com.hb.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.hb.model.GuestDao;
import com.hb.model.entity.GuestVo;

public class ListController implements Controller {

	GuestDao dao;

	public void setDao(GuestDao dao) {
		this.dao = dao;
	}

	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {

		ModelAndView mav = new ModelAndView();
		mav.addObject("list", dao.selectAll());
		for(GuestVo bean:dao.selectAll()) {
			System.out.println(bean.getPay());
		}
		mav.setViewName("list");
		return mav;
	}

}
