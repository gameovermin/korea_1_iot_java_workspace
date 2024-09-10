package chapter04;

//	객체 지향 프로그램의 '변수'

//	필드 vs 지역 변수
//	1. 필드
//	: 객체의 지속적인 상태를 저장하는 클래스 내부의 변수

//	2. 지역 변수
//	: 메서드가 실행되는 동안에만 존재하는 일시적인 변수

//	== 인스턴스 변수 ==
//	: 클래스의 각 객체(인스턴스)에 속한 변수
//	>> 클래스 내부에서 선언하지만 객체가 생성될 때 메모리에 할당

//	== 클래스(정적) 변수 == 
//	: static 키워드를 사용하여 선언되는 변수
//	>> 클래스의 모든 인스턴스에서 공유되는 데이터
//	>> 프로그램이 시작될 때 생성되고 프로그램이 종료될때 소멸 (메모리 할당)

class Car2 {
//	인스턴수 변수
//	: 각 객체(인스턴스) 마다 다른 값을 가짐
	String color;
	int speed;
	String brand;
	
//	정적 변수
//	: 해당 클래스로 생성되는 모든 객체가 동일한 값을 가짐
//	: 데이터 타입 앞에 static 키워드 사용
	
//	변수 선언과 동시에 공유될 값을 초기화
	static int tireNumber = 4;
	static int doorNumber ;
	
	void accelerate (int increment) {
		speed += increment; 
	}
}

public class Object05 {
	public static void main(String[] args) {
		Car2 car = new Car2();
		Car2 car2 = new Car2();
		
		car.brand = "kia";
		car.color = "black";
		
//		객체의 클래스 변수 : 클래스명.속성 (각 인스턴스로도 호출 가능)
		System.out.println(Car2.tireNumber);  // 4
		
//		>> 클래스 변수는 클래스명으로 접근을 권장!
//		System.out.println(car.tireNumber);		//	4
//		car.tireNumber = 5;
//		
//		System.out.println(car.tireNumber);	//	5
		
		System.out.println(car2.brand);	//	null
	}

}
