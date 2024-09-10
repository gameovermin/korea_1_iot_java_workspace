package chapter01;

public class C_TypeConversion {
//	자바 형 변환
//	: 하나의 타입을 다른 타입으로 바꾸는 것
	
//	자료형의 크기에 따른 형 변환 규측
//	byte(1) < short(2) < int(4) < long(8) < float(4) < double(8) 
	
//	cf) 메모리 설계 상 정수타입보다 실수 타입이 더 크다.
	
	
	public static void main(String[] ar) {
//		1. 자동 형 변환
//		: 크기가 큰 자료형으로의 변환
		byte smallBowl = 10;		//	1byte
		int bigBowl = 10000;		//	4byte
		
//		작은 범위의 타입을 큰 타입으로 넣을 때는 
//		컴파일러가 자동으로 형 변환을 수행
		bigBowl = smallBowl;
		
		byte a = 32;
		short b = a;
		int c = b;
		long d = c;
		
		float e = d;		//	실수는 정수 자료형보다 크다
		
//		2. 강제 형 변환 (명시적)
//		: 크기가 작은 자료형으로의 변환
		int number = 1234;
		float fNumber = number;	// 값 손실 일어나지 않음
		
		float fNumber2 = 3.14f;
//		int number2 = fNumber2; 	// 실수를 정수로 강제 타입 변환 시 오류
		
//		강제 형 변환 방법
//		(작은변환자료형) 큰 데이터값;
		int number2 = (int)fNumber2;
		System.out.println(number2);	//	3
		
//		>> char 자료형의 형 변환 (char:  2byte)
		char a1 = 'a';	//	일반 문자값
		char a2 = 97;	//	아스키코드값
		char a3 = '\u0061';
		
		System.out.println(a1);	//	a
		System.out.println(a2);	//	a
		System.out.println(a3);	//	a
		
		int num97 = 97;
		System.out.println(num97);	//	97
		
		char example = '가';
		System.out.println((int)example);	//	44032
		System.out.println((int)example + 1);	//	44033
		System.out.println((char)(int)example + 1);	//	각
		
//		char 자료형은 음수 표현식이 없고 전부다 양수 표현만 가능하다
		long l1 = 123456;

		int i1 = (int)l1;

		short s1 = (short)i1;

		byte b1 = (byte)s1;

		System.out.println(b1);// 64가 출력된다
	}
}
