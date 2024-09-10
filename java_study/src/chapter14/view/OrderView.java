package chapter14.view;

import java.util.Scanner;

public class OrderView {
	//	사용자로부터 주문을 받는 로직
	private Scanner sc = new Scanner(System.in);
	
	// 메뉴 선택을 사용자에게 요처하는 메서드
	public String getUserChoice()  {
		System.err.println("==================");
		System.out.println("Select an option : ");
		System.out.println("1. Pizza");
		System.out.println("2. Pasta");
		System.out.println("3. Coke");
		System.out.println("4. Stake");
		System.out.println("Your Choice : ");
		return sc.nextLine();
	}
	
	
}
