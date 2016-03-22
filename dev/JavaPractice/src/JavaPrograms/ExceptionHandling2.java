package JavaPrograms;

public class ExceptionHandling2{
	
	public static void main(String[] args){
	try{
		String text = "test";
		System.out.println(text.charAt(1));
		int n = Integer.parseInt("rrwqe");
		}
	catch(Exception e)	{
		System.err.println("Something bad happened" + e.getMessage() );
		}
	finally{
		System.out.println("This is going to execute always");
	}
	}
}
