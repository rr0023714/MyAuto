import java.util.Random;


public class CompareArrays {

	public static void main(String[] args) {
		int[] Array1=new int [20];
		int Array2[]=new int [20];
		
		Random ran = new Random();
		for(int i=0;i<20;i++){
			Array1[i]=ran.nextInt(100);
		}
		
		for(int i=0;i<20;i++){
			System.out.println(Array1[i]);
		}
	}

}
