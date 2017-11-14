package com.ngovandoanh.onlineshopping.controller.action.home;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import static com.ngovandoanh.onlineshopping.constant.URL.*;
import com.opensymphony.xwork2.ActionSupport;

public class PageController extends ActionSupport {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	@Action(value = "/", results = { @Result(location = INDEX_URL) })
	public String loadIndex() {
		return SUCCESS;
	}

}
