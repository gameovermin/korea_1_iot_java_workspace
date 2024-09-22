package chapter16;

class School {
	private String name;
	
	public School (String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	class Student {
		private String studentName;
		private int studentId;
		
		public Student(String studentName, int studentId) {
			this.studentName = studentName;
			this.studentId = studentId;
		}
		
		public void displayInfo() {
			System.out.println("학교 " + name);
			System.out.println("학생 이름 : " + studentName);
			System.out.println("학생 ID : " + studentId);
		}
	}
	
	class Teacher {
		private String teacherName;
		private String subject;
		
		public Teacher(String teacherName, String subject) {
			this.teacherName = teacherName;
			this.subject = subject;
		}
		
		public void displayInfo() {
			System.out.println("학교 " + name);
			System.out.println("선생님 이름 : " + teacherName);
			System.out.println("과목 : " + subject);
		}
	}
}

public class A_Inner02 {
	public static void main(String[] args) {
		//	학교 인스턴스 생성
		School school = new School("인동초");
		
		//	학생 객체 생성
		School.Student student1 = school.new Student("이승아", 1001);
		School.Student student2 = school.new Student("이도경", 1002);
		
		//	교사 객체 생성
		School.Teacher teacher1 = school.new Teacher("김준일", "수학");
		School.Teacher teacher2 = school.new Teacher("서지훈", "국어");
		
		//	== 학생 정보 출력 ==
		student1.displayInfo();
		student2.displayInfo();
		
		//	== 교사 정보 출력 == 
		teacher1.displayInfo();
		teacher2.displayInfo();
		
	}
}
