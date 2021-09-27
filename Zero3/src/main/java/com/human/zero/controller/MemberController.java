package com.human.zero.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;

import com.human.zero.domain.MemberVO;

@Controller
public class MemberController {

    String login(MemberVO mvo) {				// 로그인 메소드
    	
    	return null;
    }
    
    String register(MemberVO mvo) {				// 회원 가입 메소드
    	
    	return null;
    }
    
    String drop(HttpSession seesion) {			// 회원 탈퇴 메소드
    	
    	return null;
    }
    
    String memberInfo(HttpSession seesion) {	// 회원정보 메소드
    	
    	return null;
    }
}
