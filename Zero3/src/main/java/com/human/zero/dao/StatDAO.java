package com.human.zero.dao;

import com.human.zero.domain.StatVO;

public interface StatDAO {
    StatVO cakeStatistics();	// 케이크별 통계 메소드
    StatVO genderStatistics();	// 성별별 통계 메소드
    StatVO ageStatistics();		// 연령별 통계 메소드
}
