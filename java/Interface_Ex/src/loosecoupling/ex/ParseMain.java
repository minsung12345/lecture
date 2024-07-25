package loosecoupling.ex;

public class ParseMain {

	public static void main(String[] args) {
		ParseService service = new ParseService();
		
		service.processParse("data.json");
		service.processParse("data.xml");
		service.processParse("data.dat");
	}

}
