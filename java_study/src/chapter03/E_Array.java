package chapter03;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class E_Array {

	public static void main(String[] args) {
//		ArrayList 생성
//		: 문자열(String) 요소를 담는 배열
		ArrayList<String> items = new ArrayList<String>();
		
		items.add("사과");
		items.add("배");
		items.add("수박");
		items.add("참외");
		items.add("포도");
		
//		난수를 생성하는 Random 기능
		Random random = new Random();
		
//		0번쨰 인덱스 부터 마지막 요소의 인덱스까지의 수 중에서 무작위 수를 생성
//		random.nextInt(숫자값);
//		>> 0부터 해당 숫자 미만의 정수가 생성
		String selectedItem = items.get(random.nextInt(items.size()));
		
		Scanner sc = new Scanner(System.in);
		
		String userGuess; // 반복문 내에서 스캐너를 통해 값 할당
		
		while (true) {
			System.out.println("아이템을 맞춰보기");
			userGuess = sc.nextLine();
			if (userGuess.equals(selectedItem)) {
				System.out.println("정답입니다");
				break;
			} else if (userGuess.equals("종료")) {
				break;
			} else {
				System.out.println("틀렷습니다 다시 시도해 주세요");
			}
		}
		
		sc.close();
		System.out.println("종료되었습니다");
	}

}
