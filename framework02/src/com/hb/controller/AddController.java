package com.hb.controller;

import javax.servlet.http.HttpServletRequest;

public class AddController implements MyController {

	public String execute(HttpServletRequest req) {
		System.out.println("AddController run...");
		return "add";
	}
}