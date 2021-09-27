package com.human.zero.service;

import com.human.zero.domain.MemberVO;

public interface MemberService {
    void login(MemberVO mvo);			// 로그인 메소드
    void register(MemberVO mvo);		// 회원가입 메소드
    void drop(MemberVO mvo);			// 회원탈퇴 메소드
    MemberVO memberInfo(MemberVO mvo);	// 회원정보 메소드
}
