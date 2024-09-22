package chapter18.practice;

import java.util.Arrays;
import java.util.List;

//	=== 빌더 패턴 예제 ===

//	1) Product 클래스 : 제품에 대한 정보 (상품 이름, 가격 설명 등)
//	2) Customer 클래스 : 고객에 대한 정보 (고객 이름, 이메일, 배송 주소 등)
//	3) Order 클래스 : 주문에 대한 정보 (주문 아이디, 제품 목록, 고객 정보, 총 금액 등)

//	메인 클래스
public class Main {
	public static void main(String[] args) {
		Product pd1 = Product.builder()
				.name("갤럭시북4")
				.price(1200.10)
				.description("갤러시북 시리즈 네번째 모델")
				.build();
		Product pd2 = Product.builder()
				.name("갤럭시 s24")
				.price(670.50)
				.description("S시리즈 24모델")
				.build();
		
		Customer.Address address1 = Customer.Address.builder()
				.street("전포대로")
				.city("부산")
				.postalCode("123")
				.build();
		
		Customer customer1 = Customer.builder()
				.name("이승아")
				.email("dev@")
				.address(address1)
				.build();
		
		//	3. Order 객체 생성
		List<Product> products = Arrays.asList(pd1, pd2);
		double totalPrice = Order.calculateTotalPrice(products);
		
		System.out.println(totalPrice);
		
		Order order = Order.builder()
				.orderId("OID1234")
				.customer(customer1)
				.products(products)
				.totalPrice(totalPrice)
				.build();
		System.out.println(order);
		
		
		
	}
}
