import java.util.Scanner;

public class Scanner1 {

public static void main(String[] args) {

    int[] array = new int[3];
    int[] array2 = new int[3];
  
    Scanner scan = new Scanner(System.in);

    int i = 0;
    while(scan.hasNextInt()){
        array[i] = scan.nextInt();
        i++;
        if(i == 3){
            break;
        }
    }

    i = 0;
    while(scan.hasNextInt()){
        array2[i] = scan.nextInt();
        i++;
        if(i == 3){
            break;
        }
    }

    for(int j  = 0; j < array.length; j++){
        System.out.println(array[j]);
    }

    for(int j  = 0; j < array2.length; j++){
        System.out.println(array2[j]);
    }
}

}