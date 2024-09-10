package chapter05;

class Restaurant {
//	메서드 정의
//	: placeOrder 주문 메서드
//	>> 메뉴 이름(String dish)
//	>> 메뉴 이름, 수량 제공(int quantity)
//	>> 메뉴 이름, 특별 요청 사항 제공 (String specialRequests)
//	>> 메뉴 이름, 수량 제공, 특별 요청 사항 제공
	void placeOrder(String dish) {
		System.out.println("메뉴 이름 : " + dish);
	}
	
	void placeOrder(String dish, int quantity) {
		System.out.println("메뉴 이름 : " + dish + ", 수량 : " + quantity);
	}
	
	void placeOrder(String dish, String specialRequests) {
		System.out.println("메뉴 이름 : " + dish + ", 특별 요청 사항 제공 : " + specialRequests);
	}
	
	void placeOrder(String dish, int quantity, String specialRequests) {
		System.out.println("메뉴 이름 : " + dish + ", 수량 제공 : "  + quantity + ", 특별 요청 사항 제공 : " + specialRequests);
	}
	
}

public class Overloading02 {

	public static void main(String[] args) {
//		인스턴스 생성
		Restaurant rt = new Restaurant();
		
		rt.placeOrder("빅맥");
		rt.placeOrder("불고기버거", 2);
		rt.placeOrder("1955버거", "피클뺴주셈");
		rt.placeOrder("상하이스파이스치킨버거", 3, "서비스낭낭하게 ㅎ");
		
	}

}
