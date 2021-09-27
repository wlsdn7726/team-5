package com.human.zero.dao;

import com.human.zero.domain.CakeVO;
import com.human.zero.domain.MemberVO;
import com.human.zero.domain.OtherVO;
import com.human.zero.domain.StatVO;

public interface ManagerDAO {
    void addCake(CakeVO cvo);					// 케이크 정보 등록 메소드
    void updateCake(CakeVO cvo);				// 케이크 정보 수정 메소드
    void deleteCake(CakeVO cvo);				// 케이크 정보 삭제 메소드
    void addOther(String kind, OtherVO ovo);	// 부재료 정보 등록 메소드
    void updateOther(String kind, OtherVO ovo);	// 부재료 정보 수정 메소드
    void deleteOther(String kind, OtherVO ovo);	// 부재료 정보 삭제 메소드
    StatVO cakeStat();							// 케이크별 통계 메소드
    StatVO genderStat();						// 성별별 통계 메소드
    StatVO ageStat();							// 연령별 통계 메소드
    void addBlacklist(MemberVO mvo);			// 블랙리스트 등록 메소드
    void delBlacklist(MemberVO mvo);			// 블랙리스트 삭제 메소드
}
