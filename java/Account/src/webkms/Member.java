package webkms;

public class Member {
	//멤버 변수
	private String memberId;
	private String memberPwd;
	private String memberName;
	private int memberAge;
	
	//생성자
	public Member(String memberId, String memberPwd) {
		
		this.memberId = memberId;
		this.memberPwd = memberPwd;
	}
	public String getMemberId() {
		return this.memberId;
	}
	public String getMemberPwd() {
		return this.memberPwd;
	}
	
	
}

