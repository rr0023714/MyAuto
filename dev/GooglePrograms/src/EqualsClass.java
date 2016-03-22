

public class EqualsClass {

	public static void main(String[] args) {
		
		String str1 = "Hello world";
		String str2 = "Hello world ";
		
		System.out.println( str1.equals(str2.trim()));
		
		Device device1 = new Device("Apple","ipad");
		Device device2 = new Device("Apple","ipad");
		Device device3 = new Device("Cisco","Nexus");
		//device1=device2;
		
		
		boolean status2 = device1.equals(device2);
		System.out.println(status2);
		Device device4 = device1;
		boolean status3 = device1.equals(device3);
		System.out.println(status3);
}
}