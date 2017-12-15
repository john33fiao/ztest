package com.hb.core;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hb.controller.MyController;

@WebServlet("*.do")
public class DispatcherServlet extends HttpServlet {
	// FrontController

	Map<String, String> map;

	// /guest/list.do -> com.hb.controller.ListController
	// /guest/add.do -> com.hb.controller.AddController

	// 1. 沥焊 淬扁 map<String,String>
	// 2. 按眉 积己

	@Override
	public void init() throws ServletException {
		System.out.println("init 积己");
		map = new HashMap<String, String>();
		map.put("/guest/list.do", "com.hb.controller.ListController");
		map.put("/guest/add.do", "com.hb.controller.AddController");
		map.put("/guest/insert.do", "com.hb.controller.InsertController");
		map.put("/guest/detail.do", "com.hb.controller.DetailController");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		doGet(req, resp);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String uri = req.getRequestURI();
		String url = uri.replace(req.getContextPath(), "");
		System.out.println(map.get(url));
		MyController controll = null;
		if (map.get(url) != null) {
			try {
				Class<?> clazz = Class.forName(map.get(url));
				controll = (MyController) clazz.newInstance();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		String viewName = controll.execute(req);
		String prefix = "/WEB-INF/page/";
		String suffix = ".jsp";
		System.out.println("viewName = " + viewName);
		
		if(viewName.startsWith("redirect:")) {
			resp.sendRedirect(viewName.replace("redirect:", ""));
		}else {
			req.getRequestDispatcher(prefix+viewName+suffix).forward(req, resp);
		}

	}
}
