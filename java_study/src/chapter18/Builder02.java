package chapter18;

//	== 빌더 패턴 없이! == 
//	학생 클래스 구현
//	: name, age (필수 속성)
//	: grade, major (선택적 속성)

//	>> 생성자 4개 구현
//	>> 각 필드에 대한 getter 구현

class Student {
    private final String name;
    private final int age;
    private String grade;	//	학년
    private String major;
    
    //	==	빌더 패턴 사용 시의 생성자 == 
    private Student(Builder builder) {
    	this.name = builder.name;
    	this.age = builder.age;
    	this.grade = builder.grade;
    	this.major = builder.major;
    }
	
    //	== 빌더 클래스 정의 (내부 클래스) == 
    public static class Builder {
        private final String name;
        private final int age;
        private String grade;	//	학년
        private String major;
        
        public Builder (String name, int age) {
        	this.name = name;
        	this.age = age;
        }
        
        //	- 선택적 피드의 체이닝을 위한 메서드
        public Builder grade(String grade) {
        	this.grade = grade;
        	return this;
        }
        
        public Builder major(String major) {
        	this.major = major;
        	return this;
        }
        
        //	- 빌더를 통한 Student 인스턴스 생성
        public Student build() {
        	return new Student(this);
        }
    }
//    // 필수 속성만 받는 생성자
//    public Student(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//    
//    //	cf) 생성자의 오버로딩
//    //	: 파라미터의 개수와 타입이 같다면 생성자 호출 시 충돌 발생
//    // 필수 속성 + grade를 받는 생성자
//    public Student(String name, int age, String selectedField) {
//        this(name, age);
//        this.grade = selectedField;
//    }
//
//    // 모든 속성을 받는 생성자
//    public Student(String name, int age, String grade, String major) {
//        this(name, age);
//        this.grade = grade;
//        this.major = major;
//    }
//
	public String getGrade() {
		return grade;
	}
//
//	public void setGrade(String grade) {
//		this.grade = grade;
//	}
//
	public String getMajor() {
		return major;
	}
//
//	public void setMajor(String major) {
//		this.major = major;
//	}
//
	public String getName() {
		return name;
	}
//
	public int getAge() {
		return age;
	}
}

public class Builder02 {
	public static void main(String[] args) {
//		Student st1 = new Student("이승아", 28, "1학년");
//		Student st2 = new Student("이도경", 30);
//		Student st3 = new Student("김명진", 35, "3학년");
//		System.out.println(st1.getGrade());
//		System.out.println(st2.getAge());
//		System.out.println(st3.getName());
		Student st1 = new Student.Builder("이승아", 28).build();
		Student st2 = new Student.Builder("이도경", 30).grade("1학년").build();
		Student st3 = new Student.Builder("이지훈", 26).major("머선학과고").build();
		Student st4 = new Student.Builder("이지희", 29).grade("3학년").major("그냥학과").build();
		
		System.out.println(st1.getName());
		System.out.println(st2.getMajor());
		System.out.println(st3.getAge());
		System.out.println(st4.getGrade());
	}
}
