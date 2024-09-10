package chapter03;

import java.util.ArrayList;
import java.util.Arrays;

public class D_Array {
	
	public static void main(String[] args) {
//		자바의 기본 배열 형태
//		: 한 번 생성되면 크기 변경 X
//		>> 변경시 새로운 배열을 생성하여 원래 배열 요소를 복사
		int[] numbers = new int[5];
		System.out.println(Arrays.toString(numbers));  // [0, 0, 0, 0, 0]
		
//		== 동적 배열 (ArrayList) 사용법 ==
//		: 자바의 ArrayList 라이브러리의 기능
//		: java.utils.ArrayList를 import 해서 사용
		
//		cf) 동적 배열의 경우 배열의 타입 지정 시 일반 데이터 타입 X, 참조 타입으로 작성
//		int >> Integer
//		char >> Charactor
//		boolean >> Boolean
//		String
		
//		+) 참조 타입은 기본값이 모두 null
//		[null, null,null, ...]
		
//		+) 기본 타입은 null값을 가질 수 X >> int a = null; (X)
		
		Integer a = 123;
		System.out.println(a); // 123
		
//		== ArrayList 생성 == 
//		ArrayList<데이터타입> 배열명 = new ArrayList<>(선택);
//		>> 소괄호 안의 선택값은 초기용량을 설정
//		: 지정하지 않을 경우 기본 용량이 10
		
//		ArrayList<Integer> array = new ArrayList<>();
		ArrayList<Integer> array = new ArrayList<>(5);
		
		System.out.println(array); // []
		
//		== ArrayList 데이터 추가 == 
//		: 해당 리스트(배열)의 마지막에 값을 추가
//		: 배열명.add(추가할 데이터)
		
		array.add(10);
		array.add(20);
		array.add(30);
		array.add(40);
		System.out.println(array);	//	[10, 20, 30, 40]
		
//		== ArrayList 데이터 변경 == 
//		: 배열명.set(인덱스번호, 변경할 데이터);
		array.set(1, 40);
		System.out.println(array);	//	[10, 40, 30, 40]
		
//		== ArrayList 데이터 삭제 == 
//		: 배열명.remove(인덱스번호);
		array.remove(3);
		System.out.println(array);	//	[10, 40, 30]
		
//		== ArrayList 크기 확인 == 
//		배열명.size();
		System.out.println(array.size());  // 3
		
//		== 원하는 위치에 데이터 삽입
//		: 배열명.add(인덱스번호, 데이터값);
		array.add(3, 90);
		System.out.println(array);	//	[10, 40, 30, 90]

		
//		== 특정 요소 접근 == 
//		배열명.get(인덱스번호)
		System.out.println(array.get(2));	//	30
		
	}

}

