package com.human.zero.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OtherController {
	
	@RequestMapping(value="{url}.do")
	public String url(@PathVariable String url) {

		return null;
	}
}
