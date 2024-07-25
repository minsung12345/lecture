package webkms;

public class MemberMain {

	public static void main(String[] args) {
		
		Member loginInfo = new Member("dooly","1234"); //로그인시 입력한 정보
		MemberService ms = new MemberService();
		
		boolean result = ms.login(loginInfo.getMemberId(), loginInfo.getMemberPwd());
		
		if(result) {
			System.out.println("로그인 되었습니다.");
		}else {
			System.out.println("아이디나 패스워드가 틀립니다.");
		}
	}

}
