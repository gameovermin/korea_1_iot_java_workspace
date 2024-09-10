package chapter13;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor

@Data	//	@Data 어노테이션은 모든 멤버필드에 대한 게터, 세터, toString, equals 메서드를 생성
//@Getter
//@Setter
//@ToString
public class Example {
	private String name;
	private int age;
	
//	public Example() { 	}
//	public Example(모든 멤버필드에 대한 매개변수) {	모든 필드의 초기화	}
}

//	Example exam1 = new Example();
