package chapter20.reservation.controller;

import java.util.List;
import java.util.Scanner;

import chapter20.reservation.model.Reservation;
import chapter20.reservation.service.ReservationService;
import chapter20.reservation.service.UserService;

/*
	ReservationController 클래스 (controller)
	- 사용자 요청을 처리하고 알맞은 서비스 메서드를 호출
	- 콘솔 기반의 인터페이스로 사용자와 상호 작용
 */

public class ReservationController {
	UserService userService = new UserService();
	ReservationService reservationService = new ReservationService();
	
	public ReservationController() {
		this.userService = new UserService();
		this.reservationService = new ReservationService();
	}
	
	public void run() {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("1. 사용자 등록 | 2. 로그인 | 3. 로그아웃");
			System.out.println("4. 예약하기 | 5. 예약확인 | 6. 예약 취소");
			System.out.println("7. 종료");
			System.out.println("선택 : ");
			
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
				case 1: 
					//	사용자 등록
					System.out.println("사용자 ID ");
					String userId = sc.nextLine();
					System.out.println("비밀번호 ");
					String userPw = sc.nextLine();
					System.out.println("이름 ");
					String name = sc.nextLine();
					System.out.println("이메일 ");
					String email = sc.nextLine();
					
					userService.registerUesr(userId, userPw, name, email);
					break;
					//	반복문에서 break 키워드를 만나는 경우
					//	: break 키워드 아래의 구문을 실행하지 않고 다시 조건 검사를 진행
				case 2: 
					//	로그인
					System.out.println("사용자 ID ");
					userId = sc.nextLine();
					System.out.println("비밀번호 ");
					userPw = sc.nextLine();
					
					userService.login(userId, userPw);
					break;
				case 3: 
					//	로그아웃
					userService.logout();
					break;
				case 4: 
					//	예약하기
					System.out.println("예약 ID : ");
					String reservationId = sc.nextLine();
					System.out.println("사용자 ID :  ");
					userId = sc.nextLine();
					System.out.println("예약 시간 ");
					String reservationTime = sc.nextLine();
					
					reservationService.createReservation(reservationId, userId, reservationTime);
					break;
				case 5: 
					//	예약확인
					System.out.println("사용자 ID : ");
					userId = sc.nextLine();
					List<Reservation> userReservations = reservationService.getReservations(userId);
					if (userReservations != null && userReservations.isEmpty()) {
						System.out.println("예약 내역이 없음");
					} else {
						for (Reservation reservation : userReservations) {
							System.out.println("예약 ID : " + reservation.getReservationId());
						}
					}
					break;
				case 6:
					//	예약 취소
					System.out.println("예약 ID");
					reservationId = sc.nextLine();
					reservationService.cancelReservation(reservationId);
					break;
				case 7:
					System.out.println("종료");
					sc.close();
					return;
					//	반복문, 조건문, 함수에서는 return 키워드를 만나면 해당 프로세스가 종료
				default : 
					System.out.println("Error - please try this again");
					break;
					
			}
		}
	}
}
