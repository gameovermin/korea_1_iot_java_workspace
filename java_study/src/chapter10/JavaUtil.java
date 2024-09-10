package chapter10;

import java.util.Calendar;
import java.util.Date;

//	java.util 패키지
//	: 자바의 표준 라이브러리 중 하나
//	>> 데이터의 구조, 시간과 날짜 처리, 무작위 숫자 생성 등의 기능을 포함
//	>> 외부에 있는 클래스를 import 사용

//	== 시간과 날짜 처리 클래스 == 
//	Data 클래스
//	: 날짜와 시간을 표현
//	: 현재의 밀리초 단위까지를 반환
//	>> toString() : 현재 날짜 시간을 문자열로 반환
//	>> getTime() : 현재의 밀리초 단위를 반환

//	Calendar 클래스
//	: 날짜와 시간을 처리하기 위한 추상 클래스
//	>> getInstance() : 현재 날짜와 시간으로 설정된 Calendar 객체를 반환
//	>> get(int field) : 지정된 필드의 값을 반환
//	>> 객체의 필드 값을 반환
//	>> set(int year, int month, int date) : 연, 월, 일을 설정



public class JavaUtil {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date.toString());
		System.out.println(date.getTime());
		
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		
		//	month(달)이 0~11까지의 수로 반환
		int month = cal.get(Calendar.MONTH);
		int day = cal.get(Calendar.DAY_OF_MONTH);
		
		System.out.println(year + " " + month + " " + day);
		
	}
}
