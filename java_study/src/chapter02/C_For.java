package chapter02;

public class C_For {
//	반복문
//	: 어떤 작업을 반복적으로 실행하고 싶을 때 사용
	
//	종류
//	for, while, do-while문
	public static void main(String[] args) {
//		for문
//		: 특정 조건이 만족될 때까지 코드 블록을 반복 실행
//		>> 횟수가 정해져 있을 때
		
		/*
		 * for (초기화; 조건; 증감) { 조건이 만족될 때 실행할 코드 }
 		 * */
		for (int num = 0; num < 6; num++) {
			System.out.println(num);
		}
//		012345
		
//		=== 예제 === 
		
		for (int num2 = 1; num2 < 11; num2++) {
			if (num2 % 2 == 0) 
				System.out.println(num2);
		}
		
//		== for 반복문을 사용하여 구구단의 일부를 출력하는 코드 ==
//		EX) 3단
		int num = 3;
		for (int i = 1; i < 10; i++) {
			System.out.println(num  + " X " + i + " = " + num * i );
		}
		
		System.out.println("구구단 전체 출력");
		
		for( int i = 1; i < 10; i++) {
			System.out.println(" { " + i + " 단 } ");
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " X " + j + " = " + i * j);
			}
		}
	}

}
