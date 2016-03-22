
public class ReplaceCharactersInString {
	
	static void replaceChar(String str){
		
		char[] chars = str.toCharArray();
		for (int i = 0; i <= str.length()-1; i++) {
			if (chars[i] == '*') {
				chars[i] = 'r';
			}
		}
		System.out.println("new character seq:");
		for (char c : chars) {
			System.out.print(c);
		}
		
		}

	public static void main(String[] args) {
		String str ="Mancheste* united is my favou*ite socce* team";
		replaceChar(str);
			}

}
