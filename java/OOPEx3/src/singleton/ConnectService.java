package singleton;

public class ConnectService {
	
	private static ConnectService instance = new ConnectService();
	
	private ConnectService() {
		
		
	}
	
	static ConnectService getInstance() {
		return instance;
	}
}
