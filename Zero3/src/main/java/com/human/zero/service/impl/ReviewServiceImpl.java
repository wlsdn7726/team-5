package com.human.zero.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.human.zero.dao.ReviewDAO;
import com.human.zero.domain.ReviewCommentVO;
import com.human.zero.domain.ReviewVO;
import com.human.zero.service.ReviewService;


public class ReviewServiceImpl implements ReviewService {
	
	@Autowired
	private ReviewDAO reviewDAO;

	@Override
	public List<ReviewVO> showReviewList() {		// 글 전체 조회
		return reviewDAO.showReviewList();
	}

	@Override
	public ReviewVO showReview(ReviewVO rvo) {		// 글 단일 조회
		return reviewDAO.showReview(rvo);
	}

	@Override
	public void addReview(ReviewVO rvo) {		// 리뷰 추가
		reviewDAO.addReview(rvo);
	}

	@Override
	public void addReviewComment(ReviewCommentVO rvo) {		// 리뷰 댓글 추가
		reviewDAO.addReviewComment(rvo);
	}

	@Override
	public void deleteReview(ReviewVO rvo) {		// 리뷰 삭제
		reviewDAO.deleteReview(rvo);
	}

}
