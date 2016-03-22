package JavaPrograms1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegTest {

	public static void main(String[] args) {
		String text ="This is a regular book by some author";
		String patternstring =".*book.*";
		Pattern pattern = Pattern.compile(patternstring, Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(text);
		boolean isMatch= matcher.matches();
		//boolean isMatch=Pattern.matches(pattern, text);
		System.out.println(isMatch);
		

	}

}
