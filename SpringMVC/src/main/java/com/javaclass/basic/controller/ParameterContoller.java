package com.javaclass.basic.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.javaclass.basic.model.MemberVO;

import oracle.net.aso.m;

@Controller
public class ParameterContoller {
	
	@RequestMapping(value="/param.do")
	// public String test(String id, int age) // int 형은 null을 받지 못 합니다.(형변환오류)
	// public String test(String id, Integer age) { // 1번 해결책
	// public String test(String id, @RequestParam(defaultValue = "0") int age) // 2번 해결책 : requestparameter의 값에 기본값을 부여한다(0)
	
	// public String test(@RequestParam(value = "id") String userid, @RequestParam(defaultValue = "0") int age) 
	// @RequestParam(value = "id") : id라는 파라미터를 꼭 전달 받아야한다.
	public String test(@RequestParam(value = "id", required = false) String userid, @RequestParam(defaultValue = "0") int age) 
	{
		
		// age 자료형은 int
		// null이라는 값은 String 공백 표시, int 공백 아닙니다.
		// 원래는 형변환 오류가 발생해야 합니다.
		
		System.out.println("param.do 요청 확인");
		// System.out.println("id : " + id);
		System.out.println("id : " + userid);
		System.out.println("age : " + age);
		return "04_param";
	}
	
	@RequestMapping(value="/paramForm.do", method = RequestMethod.POST)
	public String test2(MemberVO m, HttpSession session) {
		
		// DB에 저장된 데이터
		String id = "Bae";
		String name = "진우";
		// 실제 데이터를 구현할 때 하는 시나리오
		// 1. 현재 컨트롤러 메소드가 시작점
		// 2. service 라는 클래스(가능)를 호츌
		// 3. id 라는 값을 가져올 수 있도록 getMemberId()를 호출
		// 4. service에서는 DAO라는 클래스(기능)를 호출
		// 5. DB에서 가져올 수 있도록 getMemberID()를 호출
		// 6. DAO에서는 Mapper를 이용해서 SQL를 호출
		// 7. SQL 가서 실행하고 결과 return
		// 8. 결과를 SQL > DAO > Service > Controller까지 return
		// 9. ** 리턴해온 값을 변수로 저장, 사용하고 싶은 대로 가공
		
		
		System.out.println("paramFormResult");
		
		System.out.println("==사용자가 입력한 값==");
		System.out.println(m.getId());
		System.out.println(m.getName());
		System.out.println(m.getAge());
		System.out.println("================");
		
		// 로그인 성공에 관련된 if 작성 예정
		// db에서 id와 name 하고 m으로 받은 id와 param 비교 같으면 : 
		if(id.equals(m.getId()) && name.equals(m.getName())) {
			session.setAttribute("login", m.getId());
			System.out.println("==세션에 저장한 값==");
			System.out.println(session.getAttribute("login"));
		}
		
		
		return "paramFormResult";
	}
}
