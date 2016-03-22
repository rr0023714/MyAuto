package JavaPrograms1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class WeeklyHours {

	public static final int days =7;
	static int [] total = new int[days];
	String [] weekdays = {"Mon", "Tue", "Wed", "Thur", "Fri", "Sat","Sun"};
	
	public static void main(String[] args) throws FileNotFoundException {		
		Scanner input = new Scanner(new File("./input.txt"));
		processFile(input);	
		for(int i=0;i<days;i++){
			System.out.println(total[i]);}
		
	}	

	
	public static void processFile(Scanner input){		
		while(input.hasNextLine()){
			String  text = input.nextLine();
			//System.out.println("Line is : " +text);
			int [] next = transferToArray(text);
			System.out.println(Arrays.toString(next));
		}
	}
	
	public static int[] transferToArray(String text){
		Scanner data = new Scanner(text);
		int [] hours = new int[days];
		int i=0; int sum = 0;
		while(data.hasNextInt()){
			hours[i]=data.nextInt();
			i++;			
		}
		addHours(hours, total);
		return hours;
		}
	
	public static void addHours(int[] hours, int[] total){
		
		int sum=0; 
		for(int i=0;i<7;i++){
			sum += hours[i];
			
			total[i] += hours[i];
			}
		System.out.println(sum);
		}
		
		
		public void Weekdayhours(int total[]){
			for(int i=0;i<days;i++){
				System.out.println(total[i]);
			}
			
		}
		

	}

	

