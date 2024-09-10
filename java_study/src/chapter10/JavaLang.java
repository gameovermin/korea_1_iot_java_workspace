package chapter10;

//	java.lang
//	: 자바 프로그램의 가장 기본적인 클래스들을 포함
//	>> 별도의 import문 없이 사용 가능

//	1) Object 클래스
//	>> 자바의 모든 클래스의 최상위 클래스, 기본적으로 생랴

class MyClass extends Object {
	//	toString() 메서드
	//	: 객체의 문자열 표현을 반환
	
	//	equals() 메서드
	//	: 두 객체가 동등한지 비교
	
	private int id;
	private String name;
	
	public MyClass(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "MyClass" + id + name;
	}
}

//	2) Math 클래스
//	>> 수학적 연산 & 함수를 제공하는 클래스
//	>> 모든 피드와 메서드가 static!


//	3) String 클래스
//	>> 문자열 내용 작성에 유용한 유틸리티를 담은 클래스


public class JavaLang {
	public static void main(String[] args) {
		System.out.println("=== Object Class === ");
		
		MyClass my1 = new MyClass(123, "ㅇㅅㅇ");
		MyClass my2 = new MyClass(456, "ㅇㄴㅁ");
		MyClass my3 = new MyClass(789, "ㅇㅂㅇ");
		
		System.out.println(my1.toString());
		System.out.println(my2.toString());
		System.out.println(my3.toString());
		
		System.out.println(my1.equals(my2));	//	false
		
		String name = "ㅇㅅㅇ";
		String name2 = name;
		
		System.out.println(name.equals(name2));	//	true
		System.out.println(name == name2);
		
		System.out.println("=== Math Class === ");
		
		//	Math.abs(데이터) : 절대값 반환
		double result1 = Math.abs(-3.5);
		System.out.println(result1);
		
		//	max(데이터1, 데이터2), min(a, b) : 최대값, 최소값 반환
		System.out.println(Math.max(1234123, 12321312));
		
		//	sqrt(데이터) : 제곱근 반환
		System.out.println(Math.sqrt(1234));
		
		//	random() : 0.0에서 1.0 사이의 난수 생성
		System.out.println(Math.random() * 10);
		
		//	pow(a, b) : a의 b거듭제곱 반환
		System.out.println(Math.pow(2, 4));
		
		System.out.println("=== String Class ===");
		
		//	length() : 문자열 길이 반환
		//	equals(a, b) : 두 문자열 비교
		//	substring(int 시작인덱스, int 끝 인덱스) : 부분 문자열 반환
		
		String msg = "Hello, World";
		
		System.out.println(msg.length());
		
		boolean isEqual = msg.equals("Hello, World");
		
		System.out.println(isEqual);	//	true
		
		// substring();
		// >> 시작 번호, 끝 번호
		// >> 시작 번호는 포함(이상)! 끝 번호는 미포함(미만)
		System.out.println(msg.substring(7, 12)); // World
		
		// indexOf(String str): 특정 문자열의 위치를 찾음
		// charAt(int index): 특정 위치의 문자를 반환
		char ch = msg.charAt(1);
		System.out.println(ch); // e
		
		int index = msg.indexOf("World");
		System.out.println(index); // 7
	}
}
