package JavaPrograms;

public class ExceptionHandling1 {

	public static void main(String[] args) {
		try{
		String text = "test";
		System.out.println(text.charAt(3));
		int n = Integer.parseInt("abc");
		}
		catch(IndexOutOfBoundsException e){
			System.err.println("The index is not right" + e.getMessage());
			e.printStackTrace();
		}
		catch(NumberFormatException e){
			System.err.println("Bad number" + e.getMessage() );
			
		}

	}

}
