package com.human.zero.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.human.zero.domain.ReviewCommentVO;
import com.human.zero.domain.ReviewVO;
import com.human.zero.service.ReviewService;

@Controller
public class ReviewController {

	@Autowired
	private ReviewService reviewService;
	
	@RequestMapping()
    String showReviewList(ReviewVO rvo, Model model)	{				// 리뷰 목록 확인 메소드
    	model.addAttribute("ReviewList", reviewService.showReviewList());
		return null;
    }
	
	@RequestMapping()
    String showReview(ReviewVO rvo)	{	// 리뷰 상세 확인 메소드
		reviewService.showReview(rvo);	
    	return null;
    }
    
	@RequestMapping()
    String addReview(ReviewVO rvo) {	// 사용자의 리뷰 등록 메소드
    	reviewService.addReview(rvo);
    	return null;	
    }
    
	@RequestMapping()
    String addReviewComment(ReviewCommentVO rvo) {		// 관리자의 리뷰 댓글 등록 메소드
		reviewService.addReviewComment(rvo);
		return null;	  	
    }
    
	@RequestMapping()
    String deleteReview(ReviewVO rvo) {		// 관리자의 리뷰 삭제 메소드
		reviewService.deleteReview(rvo);
    	return null;		
    }
}
