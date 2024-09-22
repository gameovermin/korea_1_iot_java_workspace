package chapter16;

interface Animal {
	void performAction();		//	동물의 행동을 정의하는 추상 메서드
}

class Zoo {
	//	사자 클래스
	//	인터페이스 Animal을 구현(implements)하는 사자 클래스
	static class Lion implements Animal {
		private String day;	//	요일에 따라 사자의 행동
		
		//	생성자에서 요일을 받음
		public Lion(String day) {
			this.day = day;
		}

		@Override
		public void performAction() {
			//	a.equalsIgnoreCase(b)
			//	: 대소문자 구분 없이 문자열 비교
			if (day.equalsIgnoreCase("Sunday")) {
				//	일요일 - 사냥\
				class SundayAction implements Animal {
					@Override
					public void performAction() {
						System.out.println("사자 사냥");
					}
				}
				Animal specialAction = new SundayAction();
				specialAction.performAction();
			} else {
				//	람다 표현식을 사용하여 평소 행동을 정의
				Animal regularAction = () -> System.out.println("사자 잠");
				regularAction.performAction();
			}
		}
	}
	
	//	원숭이 클래스
	static class Monkey implements Animal {
		@Override
		public void performAction() {
			Animal action = () -> System.out.println("원숭이 나무 탐");
			action.performAction();
		}
	}
	
	public static void main(String[] args) {
		Animal lion = new Lion("Sunday");
		lion.performAction();
		
		Animal lion2 = new Lion("Saturday");
		lion2.performAction();
		
		Animal monkey = new Monkey();
		
		Animal penguin = new Animal() {
			
			@Override
			public void performAction() {
				// TODO Auto-generated method stub
				System.out.println("펭귄 뒤뚱");
			}
		};
		penguin.performAction();
	}
}

