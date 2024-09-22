package chapter16;

class Student {
	private String name;
	private int score;
	
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	public String getName() {
		return name;
	}
	
	public int getScore() {
		return score;
	}
}

//	인터페이스 정의 - 성적 계산
interface Grading {
	String calculateGrade(Student student);	//	추상 메서드
}

public class B_Anonymous02 {
	public static void main(String[] args) {
		Student st1 = new Student("aa", 85);
		Student st2 = new Student("bb", 72);
		Student st3 = new Student("cc", 90);
		Student st4 = new Student("dd", 65);
		Student st5 = new Student("ee", 81);
		Student st6 = new Student("ff", 95);
		
		Grading grading = new Grading() {
			@Override
			public String calculateGrade(Student student) {
				int score = student.getScore();
				
				if (score > 100 || score < 0 ) {
					System.out.println("잘못된 점수입니다.");
					return null;
				} else if (score >= 90) {
					return "A";
				} else if (score >= 80) {
					return "B";
				} else if (score >= 70) {
					return "C";
				} else if (score >= 60) {
					return "D";
				} else {
					return "F";
				}
			}
		};
		
		System.out.println(st1.getName() + "의 성적" + grading.calculateGrade(st1));
		System.out.println(st2.getName() + "의 성적" + grading.calculateGrade(st2));
		System.out.println(st3.getName() + "의 성적" + grading.calculateGrade(st3));
		System.out.println(st4.getName() + "의 성적" + grading.calculateGrade(st4));
		System.out.println(st5.getName() + "의 성적" + grading.calculateGrade(st5));
		System.out.println(st6.getName() + "의 성적" + grading.calculateGrade(st6));
	}
}
