package com.human.zero.dao.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import com.human.zero.dao.ReviewDAO;
import com.human.zero.domain.ReviewCommentVO;
import com.human.zero.domain.ReviewVO;

public class ReviewDAOImpl implements ReviewDAO {
	
	@Autowired
	private SqlSessionTemplate mybatis;
	
	@Override
	public List<ReviewVO> showReviewList() {
		return mybatis.selectList("ReviewDAO.showReviewList");
	}

	@Override
	public ReviewVO showReview(ReviewVO rvo) {
		return mybatis.selectOne("ReviewDAO.showReview", rvo);
	}

	@Override
	public void addReview(ReviewVO rvo) {
		mybatis.insert("ReviewDAO.addReview", rvo);
	}

	@Override
	public void addReviewComment(ReviewCommentVO rvo) {
		mybatis.insert("ReviewDAO.addReviewComment", rvo);
	}

	@Override
	public void deleteReview(ReviewVO rvo) {
		mybatis.delete("ReviewDAO.deleteReview", rvo);
	}

}
