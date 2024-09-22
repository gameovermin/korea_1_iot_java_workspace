package chapter18;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
class Person {
	//	선택적 필드
	private String name;
	private int age;
	private String hobby;
	private String favoriteFood;
	
	//	===	@Builder 어노테이션 === 
	//	Person 클래스의 내부 Builder 클래스
	
}

public class Builder03 {
	public static void main(String[] args) {
		Person ps1 = Person.builder().name("이승아").build();
		Person ps2 = Person.builder().hobby("운동").build();
		Person ps3 = Person.builder().favoriteFood("떡볶이").build();
		
		System.out.println(ps1.getName());
		System.out.println(ps2.getHobby());
		System.out.println(ps3.getFavoriteFood());
		
	}
}
