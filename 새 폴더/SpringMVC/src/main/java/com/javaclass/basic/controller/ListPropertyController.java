package com.javaclass.basic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javaclass.basic.model.MemberVO;
import com.javaclass.basic.model.MemberVOList;

@Controller
public class ListPropertyController {

	@RequestMapping(value="/multiInsert.do")
	public String test(MemberVOList memberVOList) {
		
		// 배열로 들어오면 확인
		for(MemberVO vo : memberVOList.getList()) {
			System.out.printf("state = %s, id = %s, name = %s, age = %s \n",
					vo.isState(), vo.getId(), vo.getName(), vo.getAge());
		}
		
		return "03_userListPropertyResult";
	}
}
