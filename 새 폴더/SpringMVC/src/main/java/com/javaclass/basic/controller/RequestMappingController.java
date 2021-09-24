package com.javaclass.basic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javaclass.basic.model.MemberVO;

@Controller
@RequestMapping("/re")
public class RequestMappingController {

	@RequestMapping(value= {"/a.do","/b.do"})
	public String test() {
		// location:8080/basic/02_requestMapping.jsp
		// a태그 : re/a.do
		// localhost:8080/host/basic/re/a.do
		
		System.out.println("a.do와 b.do를 요청하였습니다.");
		
		// /WEB-INF/views/리턴값/jsp
		// /WEB-INF/views/hello.jsp
		return "hello";
	}
	
//	@RequestMapping("/re/b.do")
//	public String test2() {
//		
//		System.out.println("b.do를 요청하였습니다.");
//		
//		return "hello";
//	}
	
	
	@RequestMapping(value="/c.do", params = {"id=kim"})	// params = {"id=kim"}의 경우에는 id의 값이 kim이여야만 한다. ( ex) 관리자 로그인)
	public void test3(String id) {
		System.out.println("/c.do?id=kim");
		System.out.println("params = " + id + " 을 요청2" + id);
		// 리턴이 없을 시, return을 안쓰고 싶을 때
		
		//  /WEB-INF/views/"호출한 페이지 경로".jsp
		// 호출 페이지 경로 > re/c.do
		// .do 만 제거를 하고 "re/c" 페이지 경로
		
		//  /WEB-INF/views/re/c.jsp
	}
	
	@RequestMapping(value="/c.do")
	public void test4(String id) {
		System.out.println("/c.do?id=kim");
		System.out.println("params = " + id + " 을 요청1" + id);
	}
	
	@RequestMapping(value="/request.do", method = RequestMethod.GET)
	public void test5(String id, String name, String age) {
		System.out.println("Request.do GET 요청입니다.");
		System.out.println("입력 받은  id : " + id);
		System.out.println("입력 받은 name : " + name);
		System.out.println("입력 받은  age : " + age);
	}
	
	@RequestMapping(value="/request.do", method = RequestMethod.POST)
	public void test6(@ModelAttribute("mvo") MemberVO vo) {
		System.out.println("Request.do POST 요청입니다.");
		System.out.println(vo.getId());
	}
}
