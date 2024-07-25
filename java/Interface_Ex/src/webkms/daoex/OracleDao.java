package webkms.daoex;

public class OracleDao implements DataAccessObject {
	
	public void select() {
		System.out.println("Oracle DB 조회");
	}
	public void insert() {
		System.out.println("Oracle DB 저장");
	}
	public void update() {
		System.out.println("Oracle DB 수정");
	}
	public void delete() {
		System.out.println("Oracle DB 삭제");
	}
}