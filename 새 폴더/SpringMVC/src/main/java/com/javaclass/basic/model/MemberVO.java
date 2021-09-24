package com.javaclass.basic.model;

// VO의 형태 
// 변수만 있어야 합니다.(권장사항)
// 변수는 private로 선언
// 변수명은 form 적힌 name 동일해야함
// DB에 컬럼명과도 동일

// 만약 form과 db 컬럼명이 다르다?
// vo 2개 만들어서 다른 vo로 데이터를 받아 줘야 한다.
// form용 VO와 DB용 VO를 2개 만들어줘서
// 우리가 서로 연관되는 값들을 연결시켜줘야 합니다.

// getter, setter 필수

// 변수명 규칙 : 소문자작성, 2번째 단어는 첫 글자만 대문자
// 사용자 이름 변수 >> userName
// 단어 사이 언더바 가능 user_name

public class MemberVO {
	
	private String id;
	private String name;
	private String age;
	
//	
	private boolean state;

	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public boolean isState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}
	
	
}
