
public class Learnings {

	public static void main(String[] args) {
		
		/*Points to Keep in Mind Before attempting the Solution:

			1. String class in java do not have reverse() method , StringBuilder class does have built in reverse() method.
			2. StringBuilder class do not have toCharArray() method , while String class does have toCharArray() method
			3. String + Char = String, similar to how an int + double = double.

			4. Char + Char is int despite what the other answers tell you.

			String s = 1; // compilation error due to mismatched types.

			Your working code is (String+Char)+Char. If you had done this: String+(Char+Char) you would get a number in your string. Example:

			System.out.println("" + ('x' + 'x')); // prints 240
			System.out.println(("" + 'x') + 'x'); // prints xx - this is the same as leaving out the ( ).*/
		
		String line = "This is madness";
		char arr[]=line.toCharArray();
		int right = arr.length-1;
		int left =0;
		
		for(left=0; left <= right;left++,right--){
			char temp = arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
		}
			for(char ch: arr){
				System.out.print(ch);
			}
			//System.out.print(arr[i]);
		/*	System.out.println("=======");
		System.out.println(arr);
		
		// Method1 to reverse the string
		StringBuilder test = new StringBuilder();
		test=test.append(line);
		// Append method can be used to append to an existing string
		test=test.reverse();
		// Reverse method can be used to reverse the string.
		
		System.out.println(test);
		
		// Method2 without using reverse method of String Builder
		*/
	
		}
		
		

	}


