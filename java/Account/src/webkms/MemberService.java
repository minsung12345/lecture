package webkms;

public class MemberService {
	boolean login(String memberId, String memberPwd) {
		if(memberId.equals("dooly") && memberPwd.equals("1234")) {
			return true;
		}else {
			return false;
		}
	}
}
