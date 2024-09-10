package chapter09;

//	추상 클래스
//	==	모바일 애플리케이션 == 

abstract class MobileApp {
	abstract void execute();	//	추상 메서드 (실행)
	
	//	(일반, 구현) 메서드
	void appInfo() {
		System.out.println("This is a mobile app");
	}
}
//	==	게임 애플리케이션	==
class GameApp extends MobileApp {
	
	@Override
	void execute() {
		System.out.println("Game app executes");
	}
	
}

//	==	사회 네트워킹 애플리케이션 ==
class SocialApp extends MobileApp {
	String name;
	
	SocialApp (String name) {
		this.name = name;
	}
	@Override
	void execute() {
		System.out.println(name + " App executes");
	}
	
	@Override
	void appInfo() {
		System.out.println(name + " app is most popular social app");
	}
}


public class E_Practice {
	public static void main(String[] args) {
		MobileApp gameApp = new GameApp();
		MobileApp socialApp = new SocialApp("tester");
		
		gameApp.execute();
		gameApp.appInfo();	//	추상 클래스가 가진 일반 메서드 출력
		
		socialApp.execute();
		socialApp.appInfo();	//	재정의 된 메서드 출력
	}
}
