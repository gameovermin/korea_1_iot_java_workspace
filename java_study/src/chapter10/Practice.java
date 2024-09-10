package chapter10;

import java.util.Calendar;
import java.util.Scanner;

//	 생일까지 남은 일수 계산 프로그램
//	: 사용자로부터 생년월일을 입력 받고
//	: 다가오는 생일까지 남은 일수를 반환

public class Practice {
	public static void main(String[] args) {
		// 1. 사용자로부터 생년월일 입력받기
		// 스캐너 >> 연도, 월, 일을 각각 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.println("연도 : YYYY, 월 : MM, 일 : DD");
		int birthYear = sc.nextInt();
		int birthMonth = sc.nextInt();
		int birthDay = sc.nextInt();
		
		// 현재 날짜와 시간을  포함하는 Calendar 인스턴스 생성
		Calendar today = Calendar.getInstance();
		
		// 사용자의 생일 설정(월은 0부터 시작하기 때문에 -1을 해야함)
		Calendar birthday = Calendar.getInstance();
		birthday.set(Calendar.YEAR, birthYear);
		birthday.set(Calendar.MONTH, birthMonth -1);
		birthday.set(Calendar.DAY_OF_MONTH, birthDay);
		
		// 올해의 생일이 이미 지났는지 확인
		if(birthday.before(today)) {
			// 이미 지났다면 내년으로 설정
			birthday.set(Calendar.YEAR, today.get(Calendar.YEAR) + 1);
		}
		// 날짜 차이 계산 (밀리초 단위로 계산 후 일 단위로 변경)
		// 1초 = 1000밀리초, 1분 = 60초, 1시간 = 60분, 1일 = 24시간
		long difference = (birthday.getTimeInMillis() - today.getTimeInMillis()) / (1000 * 60 * 60 * 24);
		System.out.println("남은 생일은 : " + difference + "일");
	}
}
