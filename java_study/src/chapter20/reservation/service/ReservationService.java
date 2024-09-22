package chapter20.reservation.service;

import java.util.ArrayList;
import java.util.List;

import chapter20.reservation.model.Reservation;
import chapter20.reservation.model.User;
import chapter20.reservation.repository.ReservationRepository;
import chapter20.reservation.repository.UserRepository;

/*
	ReservationService 클래스 (service)
	- 예약 생성, 확인, 취소 관련 기능 구현
	- 메서드 정의
 */

public class ReservationService {
//	private List<Reservation> reservations;
	private ReservationRepository reservationRepository;

	public ReservationService() {
//		this.reservations = new ArrayList<Reservation>();
		this.reservationRepository = new ReservationRepository();
	}
	
	//	예약 생성 메서드
	public void createReservation(String reservationId, String userId, String reservationTime) {
		Reservation newReservation = new Reservation(reservationId, userId, reservationTime);
//		reservations.add(newReservation);
		reservationRepository.addReservation(newReservation);
		System.out.println("예약 완료 : " + reservationTime);
	}
	
	//	예약 확인 메서드
	public List<Reservation> getReservations(String userId) {
		List<Reservation> userReservations = new ArrayList<Reservation>();
		
//		for (Reservation reservation : reservations) {
//			if (reservation.getUserId().equals(userId) && reservation.isActive()) {
//				userReservations.add(reservation);	//	활성 예약 추가
//			}
//		}
//		return userReservations;	//	사용자의 활성 예약 목록 반환
		
		return userReservations.stream()
				.filter(reservation -> reservation.getUserId().equals(userId) && reservation.isActive())
				.toList();	//	사용자 ID와 활성 예약 필터
		
	}
	
	//	예약 취소 메서드
	public void cancelReservation(String reservationId) {
		Reservation reservation = reservationRepository.findById(reservationId);
		
//		for (Reservation reservation : reservations) {
//			if (reservation.getUserId().equals(reservationId) && reservation.isActive()) {
//				reservation.cancel(false);
//				System.out.println("예약 취소 완료 : " + reservationId);
//				return;
//			}
//		}
		if (reservation != null && reservation.isActive()) {
			reservation.cancel(false);	//	예약 취소
			System.out.println("예약 취소 완료 : " + reservationId);
		} else {
			System.out.println("예약 취소 실패 : 예약 Id가 잘못되었습니다.");
		}
		
		System.out.println("예약 취소 실패 : 예약 ID가 잘못되었습니다.");
	}
}
