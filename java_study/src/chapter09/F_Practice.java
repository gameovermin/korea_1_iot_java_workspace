package chapter09;

//	인터페이스
//	fruit 인터페이스 정의

interface Fruit {
	String color();
	default void describe() {
		System.out.println("과일의 색상은 " + color());
	}
	
	static void printType() {
		System.out.println("과일의 타입입니다");
	}
}

//	인터페이스 구현

class Apple implements Fruit{
	@Override
	public String color() {
		return "red";
	}
	
	// 디폴트 메서드를 재정의 X
	// >> Fruit에 있는 디폴트 메서드가 생략된 형태
}

class Orange implements Fruit {
	@Override
	public String color() {
		return "orange";
	}
}

public class F_Practice {
	public static void main(String[] args) {
		Fruit apple = new Apple();
		Fruit orange = new Orange();
		
		apple.describe();
		orange.describe();
		
		//	정적 메서드 활용 - 인터페이스 자체로 호출
		Fruit.printType();
	}
}
