package webkms.daoex;

public class MySqlDao implements DataAccessObject {
	public void select() {
		System.out.println("MySql DB 조회");
	}
	public void insert() {
		System.out.println("MySql DB 저장");
	}
	public void update() {
		System.out.println("MySql DB 수정");
	}
	public void delete() {
		System.out.println("MySql DB 삭제");
	}
}
