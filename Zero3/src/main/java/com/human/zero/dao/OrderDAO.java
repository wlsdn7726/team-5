package com.human.zero.dao;

import com.human.zero.domain.OrderVO;

public interface OrderDAO {
    void productSell(OrderVO ovo);			// 사용자의 예약구매 메소드
    void madeSell(OrderVO ovo);				// 사용자의 주문제작 메소드
    void expReservation(OrderVO ovo);		// 사용자의 체험예약 메소드
    OrderVO orderCheck();					// 사용자의 예약 확인 메소드
    OrderVO detailCheck(OrderVO ovo);		// 사용자의 예약 상세확인 메소드
    OrderVO productSell();					// 관리자의 예약구매 확인 메소드
    OrderVO madeSell();						// 관리자의 주문제작 확인 메소드
    OrderVO expReservation();				// 관리자의 체험예약 확인 메소드
    void productSellUpdate(OrderVO ovo);	// 사용자의 예약구매 수정 메소드
    void madeSellUpdate(OrderVO ovo);		// 사용자의 주문제작 수정 메소드
    void expReservationUpdate(OrderVO ovo);	// 사용자의 체험예약 수정 메소드
    void orderCancel(OrderVO ovo);     		// 판매&예약 취소 메소드
}
