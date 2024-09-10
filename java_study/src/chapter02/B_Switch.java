package chapter02;

import java.util.Scanner;

public class B_Switch {

	public static void main(String[] args) {
//		Switch 조건문
//		: 특정 변수의 값에 따라 실행할 코드 블록의 범위를 결정

//		- 비교할 변수와 case값을 비교하여 같은 값일 경우 해당 블록부터 끝까지 실행
//		: break 키워드에서 switch문이 종료
		Scanner sc = new Scanner(System.in);
		
		int chapter = sc.nextInt();
		
		switch (chapter) {
			case 1:
				System.out.println("자바 기본 문법");
				break;
			case 2:
				System.out.println("자바 제어문 - 조건문 / 반복문");
				break;
			case 3:
				System.out.println("자바 배열");
				break;
			default:
//				default문은 case 조건시깅 끝난 뒤 작성
//				: 어느 case에도 일치하지 않으 ㄹ경우
				System.out.println("범위 초과");
		}
		
	}
}
