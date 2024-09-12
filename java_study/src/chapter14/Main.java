package chapter14;

import chapter14.controller.OrderController;
import chapter14.model.OrderModel;
import chapter14.view.OrderView;

public class Main {
	public static void main(String[] args) {
		OrderModel orderModel = new OrderModel();
		OrderView orderView = new OrderView();
		OrderController controller = new OrderController(orderModel, orderView);
		controller.processOrder();
	}
}
