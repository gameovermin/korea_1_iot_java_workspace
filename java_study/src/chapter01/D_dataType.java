package chapter01;

public class D_dataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 데이터 타입 ( 자료형, DataType)
		// : 자바는 강 타입 언어
		// >> 모든 변수 선언 시 반드시 데이터 타입을 명시!
		
//		1. 데이터 타입 종류
//		: 기본 타입 | 참조 타입
		
//		기본 타입
//		>> 변수 선언 시 해당되는 자료형의 크기 만큼 메모리 할당
//		>> 실질적인 데이터가 저장
		
//		참조타입
//		>> 객체의 참조(메모리 주소)를 저장하는 변수 타입
		
//		2. 기본 자료형
//		: 총 8가지의 기본형 타입
		
//		byte(1), short(2), int(4), long(8), float(4), double(8), char(2), boolean(1)
		
		int age;
		age = 33;
		int height = 200;
		
		System.out.println(age);
		System.out.println(height);
		
		long bitNumber = 1000000000L;
		
		System.out.println(bitNumber);
		
//		2.2 문자형
//		char* : 하나의 문자를 저장하기 위한 변수를 선언할 때 사용
//		- 문자형의 데이터의 경우 따옴표를 사용해 감싸야 함
//		- 2 바이트 
//		>> 단일 문자 저장
		char grade = 'a';
		char lastName = '하';
//		
//		2.3 실수형(부동소수점 타입): 소수점 자리가 있는 수
//		float ; 4바이트 소수점, 숫자 뒤에 알파벳 F를 써서 float형임을 표시
//		double*(기본) : 8바이트 소수점. 기본 실수 타입
		
		float weight1= 70.12341234f;
		double weight2 = 35.3142312321;
		
//		2.4 논리형* : 데이터 값으로 true(참), false(거짓)만 담을 수 있음
//		- 1바이트
//		- 값이 존재하는지, 결과가 참인지 거짓인지 등을 표현
//		- 소문자 값 사용을 궈장
//		- 주로 is 키워드를 사용하여 변수명 저장
		boolean isMarreied = false;
		boolean isActived = true;
		
//		3. 참조 자료형
//		: 기본 자료형을 기초로 만들어진 자료형
//		>> 실제 데이터 값 X, 데이터가 저장된 주소값을 가지는 자료형
		
//		종류
//		>> String : 문자열을 저장하는 데 사용
//		>> Array : 배열을 저장하는 데 사용
		String str = "deee";
		int[] scores = {90,80,70};
		
		
	}

}
