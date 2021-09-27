package com.human.zero.dao;

import com.human.zero.domain.CakeVO;
import com.human.zero.domain.OtherVO;

public interface CakeDAO {
    void addCake(CakeVO cvo);					// 케이크 정보 등록 메소드
    void updateCake(CakeVO cvo);				// 케이크 정보 수정 메소드
    void deleteCake(CakeVO cvo);				// 케이크 정보 삭제 메소드
    void addOther(String kind, OtherVO ovo);	// 부재료 정보 등록 메소드
    void updateOther(String kind, OtherVO ovo);	// 부재료 정보 수정 메소드
    void deleteOther(String kind, OtherVO ovo);	// 부재료 정보 삭제 메소드
}
