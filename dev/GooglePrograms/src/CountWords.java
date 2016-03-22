


public class CountWords {

	

	public static void main(String[] args) {

		String str ="   Manchester United is also known as Red Devil. I am red devil fan.";
		System.out.println("Length of the string is : " +str.length());
		/*String str1=str.trim();
		System.out.println("Length of the string is : " +str1.length());
		String patternString = ".*Red.*";
		boolean isMatch;
		isMatch=Pattern.matches(patternString, str);
		System.out.println(isMatch);
		String patternString1= ".*devil.*";
		Pattern pattern = Pattern.compile(patternString1, Pattern.CASE_INSENSITIVE);
		Matcher matcher= pattern.matcher(str);
		 isMatch = matcher.matches();
			System.out.println(isMatch);
			
		String patternString2 =" ";
		Pattern pattern1 = Pattern.compile(patternString2, Pattern.CASE_INSENSITIVE);
		//use split function to break
		String arr[] = pattern1.split(str);
		System.out.println(arr.length);
		for(int i=0;i<=arr.length-1;i++){
				System.out.println(arr[i]);
		}*/
		String str1=str.trim();
		System.out.println(str1);
		char[] ch = str1.toCharArray();
		int count=0;
		for(int i=0;i<=str1.length()-1;i++){
			if(ch[i]==' '){
				 count ++;
			}
		System.out.print("ch is: " +ch[i] +" " );
		System.out.println(count);
		}
	}

}
