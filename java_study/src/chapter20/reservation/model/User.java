package chapter20.reservation.model;

/*
	User 클래스 (model)
	- 사용자 정보를 담는 클래스
	- 속성 : 사용자 ID, 비밀번호, 사용자 이름, 사용자 이메일
 */
public class User {
	private String userId;
	private String userPw;
	private String name;
	private String email;
	
	public User (String userId, String userPw, String name, String email) {
		this.userId = userId;
		this.userPw = userPw;
		this.name = name;
		this.email = email;
	}

	//	Getter
	public String getUserId() {
		return userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}

	//	Setter
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
