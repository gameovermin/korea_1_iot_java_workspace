package chapter14.controller;

import chapter14.model.OrderModel;
import chapter14.view.OrderView;

public class OrderController {
	private OrderModel model;
	private OrderView view;
	
	public OrderController(OrderModel model, OrderView view) {
		this.model = model;
		this.view = view;
	}
	
	//	사용자의 입력을 처리하고 주문을 관리하는 메서드
	public void processOrder() {
		while(!model.isCompleted()) {
			String userChoice = view.getUserChoice();
			switch(userChoice) {
				case "1":
					model.addOrder("Pizza", view.getQuantity());
					break;
				case "2":
					model.addOrder("Pasta", view.getQuantity());
					break;
				case "3":
					model.addOrder("Coke", view.getQuantity());
					break;
				case "4":
					model.addOrder("stake", view.getQuantity());
					break;
				case "q": 
					model.setCompleted(true);
					view.displayTotalPrice(model.calculateTotal());
					view.displayOrderCompleted();
					break;
				default: 
					System.out.println("fxxking retry Bixxh man");
					break;
			}
		}
	}
	
}
