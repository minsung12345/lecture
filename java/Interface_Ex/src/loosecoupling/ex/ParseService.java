package loosecoupling.ex;

public class ParseService {
	public void processParse(String fileName) {
		
		boolean result = false;
		String ext = fileName.substring(fileName.lastIndexOf(".")+1);
		System.out.println("파일의 확장자 : " + ext);
		
		if(ext.equals("json")) {
			JasonParser jsonParser = new JasonParser();
			result = jsonParser.parse();
		}else if (ext.equals("xml")) {
			XmlParser xmlParser = new XmlParser();
			result = xmlParser.parse();
			
		}else {
			System.out.println("파서기가 없습니다.");
			result = false;
		}
		if(result) {
			System.out.println("파싱 완료!");
		}else {
			System.out.println("파싱 실패!");
		}
	}
}
