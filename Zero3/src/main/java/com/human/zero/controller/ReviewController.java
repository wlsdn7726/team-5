package com.human.zero.controller;

import org.springframework.stereotype.Controller;

import com.human.zero.domain.ReviewVO;

@Controller
public class ReviewController {

    String showReviewList()	{				// 리뷰 목록 확인 메소드
    	
    	return null;
    }
    
    String showReview(ReviewVO rvo)	{		// 리뷰 상세 확인 메소드
    	
    	return null;
    }
    
    String addReview(ReviewVO rvo) {		// 사용자의 리뷰 등록 메소드
    	
    	return null;
    }
    
    String addReviewComment(ReviewVO rvo) {	// 관리자의 리뷰 댓글 등록 메소드
    	
    	return null;
    }
    
    String deleteReview(ReviewVO rvo) {		// 관리자의 리뷰 삭제 메소드
    	
    	return null;
    }
}
