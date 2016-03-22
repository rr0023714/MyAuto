import java.util.Date;


public class Random1 {

	public static String getRandomString(int length) {
		StringBuilder sb = new StringBuilder();
		String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		for (int i = 0; i < length; i++) {
			int index = (int) (Math.random() * characters.length());
			sb.append(characters.charAt(index));
		}
		return sb.toString();
	}
	
	public static String getScreenshotName(String testName){
		
		StringBuilder sb = new StringBuilder();
		sb.append(testName);
		Date dt = new Date();
		dt.getTime();
		sb.append(dt);
		
		return sb.toString();
	}
	public static void main(String[] args) {
	
		//String name =getRandomString(10);
		String name = getScreenshotName("test_");
		System.out.println(name.trim().replaceAll("\\s",""));
	}

}
