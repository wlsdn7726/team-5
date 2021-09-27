package com.human.zero.controller;

import org.springframework.stereotype.Controller;

import com.human.zero.domain.CakeVO;
import com.human.zero.domain.MemberVO;
import com.human.zero.domain.OtherVO;

@Controller
public class ManagerController {

    String addCake(CakeVO cvo) {						// 케이크 정보 등록 메소드
    	
    	return null;
    }
    
    String updateCake(CakeVO cvo) {						// 케이크 정보 수정 메소드
    	
    	return null;
    }
    
    String deleteCake(CakeVO cvo) {						// 케이크 정보 삭제 메소드
    	
    	return null;
    }
    
    String addOther(String kind, OtherVO ovo) {			// 부재료 정보 등록 메소드
    	
    	return null;
    }
    
    String updateOther(String kind, OtherVO ovo) {		// 부재료 정보 수정 메소드
    	
    	return null;
    }
    
    String deleteOther(String kind, OtherVO ovo) {		// 부재료 정보 삭제 메소드
    	
    	return null;
    }
    
    String cakeStat()	{	      	         			// 케이크별 통계 메소드
    	
    	return null;
    }
    
    String genderStat()	{	      	         			// 성별별 통계 메소드
    	
    	return null;
    }
    
    String ageStat()	{	      	         			// 연령별 통계 메소드
    	
    	return null;
    }
    
    String addBlacklist(MemberVO mvo) {         		// 블랙리스트 등록 메소드
    	
    	return null;
    }
    
    String delBlacklist(MemberVO mvo) {         		// 블랙리스트 삭제 메소드
    	
    	return null;
    }
}
