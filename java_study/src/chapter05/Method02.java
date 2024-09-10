package chapter05;
//메서드
//: 특정 작업을 수행하는 일련의 문장들을 하나로 묶은 것
//: 어떤 값을 입력하면 해당 값으로 작업을 수행하여 결과를 반환

//=== 메서드의 구조 ===
//>> 선언부, 구현부

//반환타입 메서드명 () : 선언부
//{ 메서드 호출 시 수행될 코드 } : 구현부

//>>  메서드를 정의한다 == 선언부와 구현부를 작성한다

//== 1. 메서드의 선언부 ==
//'반환타입', '메서드명', '매개변수 선언'

//매개변수(parameter) 선언
//: 메서드가 작업을 수행하는데 필요한 값들(입력)을 제공받기 위한 것

//: 필요한 값의 개수만큼 변수를 선언하여 각 변수 간의 구분은 쉼표(,)를 사용
//: 변수들의 데이터 타입이 같더라도 변수의 타입을 생략할 수 X
//int add (int x, y) {...} - Error

//+) 메서드 내부의 지역 변수

//반환 타입(return type)
//: 메서드의 작업수행 결과(출력)인 반환값의 타입을 명시
//: 반환값이 없는 경우 void 키워드를 사용

//2. 메서드의 구현부
//: 메서드 선언부 다음에 오는 중괄호{}

//return문
//: 메서드의 반환타입이 void가 아닌 경우
//: , 구현부{} 안에 반드시 'return 반환값타입데이터'이 포함
//: 해당 반환값은 반환타입과 일치하거나 적어도 자동 형변환이 가능한 것

//cf) 자동 형 변환: 작은 데이터 > 큰 데이터
//int example() {
//	  short a = 10;
//	  return a;
//}

//: return문은 단 하나의 값만을 반환 가능

//지역변수(local variable)
//: 메서드 내에 선언된 변수 - 그 메서드 내에서만 사용 가능
//: 메서드의 구현부에 작성된 변수 뿐만 아니라 
//: , 매개변수도 메서드 내에서 선언된 것으로 간주하기 때문에 지역변수로 인식
class Example {
	int x, y;
	
	int add (int x, int y) {
		return x + y;
	}
	
	int multiply(int x, int y) {
		return x * y;
	}
	
//	매개변수 x, 반환값 x
	void print99dan() {
		for (int i = 1; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				System.out.print(j * i + " ");
			}
			System.out.println();
		}
	}
}

public class Method02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example ex = new Example();
		ex.print99dan();
		
		System.out.println(ex.add(10, 50));
		
		System.out.println(ex.multiply(20, 30));
	}

}
