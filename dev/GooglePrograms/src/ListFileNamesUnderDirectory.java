import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ListFileNamesUnderDirectory {
	
	public static List<File> listf(String directoryName) {
    File directory = new File(directoryName);

    

    // get all the files from a directory
    File[] fList = directory.listFiles();
    List<File> resultList = new ArrayList<File>(Arrays.asList(fList));
    //resultList.addAll(Arrays.asList(fList));
    for (File file : fList) {
        if (file.isFile()) {
            System.out.println(file.getAbsolutePath());
        } /*else if (file.isDirectory()) {
            resultList.addAll(listf(file.getAbsolutePath()));
        }*/
    }
    //System.out.println(fList);
    return resultList;
} 
	
	

	public static void main(String[] args) {
		
				listf("C:\\MyWorks");

	}

}
