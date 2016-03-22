import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


public class SortingAndSearching {
	
	public static void printNumbers(ArrayList<Integer> a){
		
		for(int i =0;i<a.size();i++){
			System.out.printf(" %d ", a.get(i) );
		}
		
	}
	
	public static int findNumber(ArrayList<Integer> a,int number){
		int found =-1;
		for(int i =0;i<a.size();i++){
			if (a.get(i)==number){
				found=i;
				
				break;
			}
				}
			
			 return found;
					
			}
		
		
		
	

	public static void main(String[] args) {
		Random random = new Random();
		int found =-1;
		ArrayList<Integer> a = new ArrayList<Integer>();
		for(int i=0;i<20;i++){
		a.add(random.nextInt(100)+1);
		}
		printNumbers(a);
		System.out.println();
		Collections.sort(a, new IntegerComparator() );
		System.out.println("After Sort");
		printNumbers(a);
		int i =findNumber(a,50);
		System.out.printf("The Number %d was  %s found\n", 50, found<0 ? "not" : "");
		
		}

	}


