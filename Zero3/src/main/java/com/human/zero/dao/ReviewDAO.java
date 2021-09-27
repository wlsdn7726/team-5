package com.human.zero.dao;

import com.human.zero.domain.ReviewCommentVO;
import com.human.zero.domain.ReviewVO;

public interface ReviewDAO {
    ReviewVO showReviewList();					// 리뷰 목록 확인 메소드
    ReviewVO showReview(ReviewVO rvo);			// 리뷰 상세 확인 메소드
    void addReview(ReviewVO rvo);				// 사용자의 리뷰 등록 메소드
    void addReviewComment(ReviewCommentVO rvo);	// 관리자의 리뷰 댓글 등록 메소드
    void deleteReview(ReviewVO rvo);			// 관리자의 리뷰 삭제 메소드
}
